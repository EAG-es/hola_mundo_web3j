// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.8.17;

import "./libs/lib_bases.sol";
/**
* Estructura para el control de usuarios
*/
struct acls {
    /// Dirección EAO
    address direccion;
    /// Texto que identifica al usuario, y que es necesario para poder cambiar su dirección
    string usuario;
    /// código sha256 de la clave secreta del usuario
    bytes32 clave;
    /// Array con los permisos ACL
    bytes32 [] permisos_array;
}
bytes32 constant k_permiso_maximo = "permiso_maximo";
bytes32 constant k_permiso_minimo = "permiso_minimo";

enum estados {
    activo, inactivo, limitado
}
/**
* Contrato normalizado con administradores, permisos y clave.
*/
contract bases {    
    /**
    * Array acl, con las direcciones de los administradores
    */
    acls [] public acl_array;
    /**
    * Estado del contrato. 
    */
    estados public estado = estados.inactivo;

    constructor () {
        // acls [] storage acl_array_ref;
        // acl_array_ref = acl_array;
        acls memory acl;
        acl.direccion = msg.sender;
        acl.usuario = "root";
        acl.clave = "root_hola_mundos";
        acl.permisos_array = new bytes32[](1);
        acl.permisos_array[0] = k_permiso_maximo;
        acl_array.push(acl);
    }
    /**
    * Rquiere que el estado sea activo
    */
    modifier si_activo {
        require(estado == estados.activo, unicode"El contrato no está activo.");
        _;
    }
    /**
    * Requiere que el estado sea activo o limitado
    */
    modifier si_activo_o_limitado {
        require(estado == estados.activo || estado == estados.limitado
        , unicode"El contrato no está activo o no está limitado.");
        _;
    }
    /**
    * Requiere que el estado limitado
    */
    modifier si_limitado {
        require(estado == estados.limitado, unicode"El contrato no está limitado.");
        _;
    }
    /**
    * Comprueba que una dirección sea de administrador
    * @param direccion La dirección que comprobar
    * @return true si la dirección es de administrador, false en caso contrario
    */
    function ser_administrador(address direccion) public virtual view 
    returns (bool){
        bool es_encontrado = false;
        uint i = 0;
        while (true) {
            if (i >= acl_array.length) {
                break;
            }
            if (direccion == acl_array[i].direccion) {
                es_encontrado = true;
                break;
            }
            i = i + 1;
        }
        return es_encontrado;
    }
    /**
    * Requiere un administrador
    */
    modifier si_administrador {
        address direccion = msg.sender;
        require(ser_administrador(direccion), unicode"Usuario no administrador.");
        _;
    }
    /**
    * Comprueba que una dirección sea de administrador y que tiene el permiso requerido
    * @param direccion La dirección que comprobar
    * @param permiso_necesario Un texto que coincida con el alguno de los permisos de esa dirección
    * @return true si la dirección es de administrador, false en caso contrario
    */
    function ser_administrador_con_permiso (address direccion, bytes32 permiso_necesario) public virtual view 
    returns (bool) {
        bool es_encontrado = false;
        int i = 0;
        i = leer_administrador_pos(direccion);
        uint u;
        uint uu = 0;
        if (i >= 0) {
            u = uint(i);
            uu = 0; 
            while (true) {
                if (uu >= acl_array[u].permisos_array.length) {
                    break;
                }
                if (acl_array[u].permisos_array[uu] == permiso_necesario) {
                    es_encontrado == true;
                    break;
                }
                uu = uu + 1;
            }
        }
        return es_encontrado;
    }
    /**
    * Requiere un administrador con un permiso determinado
    * @param permiso_necesario Permiso que debe poseer ese administrador
    */
    modifier si_administrador_con_permiso (bytes32 permiso_necesario) {
        address direccion = msg.sender;
        string memory texto = textos_bases.convertir_bytes32_a_string(permiso_necesario);
        require(ser_administrador_con_permiso(direccion, permiso_necesario)
        , string.concat(unicode"Usuario no administrador o no tiene el permiso solicitado: "
        , texto));
        _;
    }
    /**
    * Comprueba que la clave de una dirección de administrador coincide con la clave enviada
    * @param direccion La dirección que comprobar
    * @param clave Texto que encriptar SHA256 y cotejar con la clave de la dirección
    * @return true si la dirección es de administrador, false en caso contrario
    */
    function comprobar_clave(address direccion, bytes memory clave) public virtual view 
    returns (bool) {
        int i;
        i = leer_administrador_pos(direccion);
        require(i >= 0, unicode"El usuario no existe. ");
        return (acl_array[uint(i)].clave == sha256(clave));
    }
    /**
    * Requiere un administrador con una clave determinada
    * @param clave Clave que debe coincidir con la de ese adminiatrador
    */
    modifier si_administrador_con_clave (bytes memory clave) {
        address direccion = msg.sender;
        require(comprobar_clave(direccion, clave)
        , unicode"Usuario no administrador o clave incorrecta. ");
        _;
    }
    /**
    * Requiere un administrador con una clave determinada y un permiso determinado
    * @param clave Clave que debe coincidir con la de ese adminiatrador
    * @param permiso_necesario Permiso que debe poseer ese administrador
    */
    modifier si_administrador_con_clave_permiso (bytes memory clave, bytes32 permiso_necesario) {
        address direccion = msg.sender;
        require(comprobar_clave(direccion, clave)
        , unicode"Usuario no administrador o clave incorrecta. ");
        string memory texto = textos_bases.convertir_bytes32_a_string(permiso_necesario);
        require(ser_administrador_con_permiso(direccion, permiso_necesario)
        , string.concat(unicode"Usuario no administrador o no tiene el permiso solicitado: "
        , texto));
        _;
    }
    /**
    * Activa el contrato
    */
    function activar() public virtual 
    si_administrador {
        estado = estados.activo;
    }
    /**
    * Inactiva el contrato
    */
    function inactivar() public virtual
    si_administrador {
        estado = estados.inactivo;
    }
    /**
    * Pone en contrato en un estado limitado.
    */
    function limitar() public virtual
    si_administrador {
        estado = estados.limitado;
    }
    /**
    * Cambia la dirección de un usuario (debe ser administrador de máximo permiso y conocer el campo de usuario)
    * @param usuario Texto con el nombre que el usuario tiene.
    * @param nueva_direccion Nueva dirección para ese usuario
    */
    function cambiar_direccion(string memory usuario, address nueva_direccion) public virtual 
    si_administrador_con_permiso (k_permiso_maximo) {
        bool es_encontrado = false;
        uint i = 0;
        while (true) {
            if (i >= acl_array.length) {
                break;
            }
            if (textos_bases.ser_igual_string(usuario, acl_array[i].usuario)) {
                es_encontrado = true;
                break;
            }
            i = i + 1;
        }
        require(es_encontrado, unicode"El usuario no existe. ");
        acl_array[i].direccion = nueva_direccion;
    }
    /**
    * Crea un nuevo administrador
    * @param direccion Dirección de cuenta EAO
    * @param usuario Nombre de usuario
    * @param clave Clave que se guarda codificada con SHA256
    * @param permisos_array Array de texto libre para comprobar permisos (puede usarse k_maximo_permiso).
    */
    function crear_administrador(address direccion, string memory usuario, bytes memory clave, bytes32[] memory permisos_array) public virtual
    si_administrador {
        bool es_encontrado = false;
        uint i = 0;
        while (true) {
            if (i >= acl_array.length) {
                break;
            }
            if (direccion == acl_array[i].direccion) {
                es_encontrado = true;
                break;
            }
            i = i + 1;
        }
        require(es_encontrado == false, unicode"El usuario ya existe. ");
        acls memory acl;
        acl.direccion = direccion;
        acl. usuario = usuario;
        acl.clave = sha256(clave);
        acl.permisos_array = permisos_array;
        acl_array.push(acl);
    }
    /**
    * Devuelve la posición de un administrador en el acl_array de administradores
    * @param direccion Dirección de cuenta EAO del nuevo administrador
    * @return la posición en acl_array o -1 si no está en él
    */
    function leer_administrador_pos(address direccion) public view virtual
    returns (int) {
        bool es_encontrado = false;
        uint i = 0;
        while (true) {
            if (i >= acl_array.length) {
                break;
            }
            if (direccion == acl_array[i].direccion) {
                es_encontrado = true;
                break;
            }
            i = i + 1;
        }
        if (es_encontrado) {
            return int(i);
        } else {
            return -1;
        }
    }
    /**
    * Devuelve el registro acl de un administrador, con la clave invalidada con *'s
    * @param direccion Direccion de cuenta EAO
    * @return Un objeto de estructura acl con los datos encontrados 
    */
    function leer_administrador(address direccion) public view virtual
    returns (acls memory) {
        int i = 0;
        i = leer_administrador_pos(direccion);
        require(i >= 0, unicode"El usuario no existe. ");
        acls memory acl;
        acl = acl_array[uint(i)];
        acl.clave = "*****";
        return acl;
    }
    /**
    * Actualiza el acl de administrador, por su dirección, pero no su clave.
    * @param acl Estructura con los datos que utilizar (salvo: clave)
    */
    function actualizar_administrador_pero_no_clave(acls memory acl) public virtual
    si_administrador {
        address direccion = acl.direccion;
        int i = 0;
        i = leer_administrador_pos(direccion);
        require(i >= 0, unicode"El usuario no existe. ");
        uint u = uint(i);
        u = 0;
        while (true) {
            if (u >= acl.permisos_array.length) {
                break;
            }
            if (acl.permisos_array[u] == k_permiso_maximo) {
                require(ser_administrador_con_permiso(msg.sender, k_permiso_maximo)
                , unicode"No puede poner el permiso máximo; si quien lo pide, no lo posee. ");
                break;
            }
            u = u + 1;
        }
        acl_array[u].permisos_array = acl.permisos_array;
        acl_array[u].usuario = acl.usuario;
    }
    /**
    * Actualiza la clave de un administrador
    * @param clave Clave que actualizar codificada con sha256
    */
    function actualizar_administrador_clave(bytes memory clave) public virtual
    si_administrador {
        address direccion = msg.sender;
        int i = 0;
        i = leer_administrador_pos(direccion);
        require(i >= 0, unicode"El usuario no existe. ");
        acl_array[uint(i)].clave = sha256(clave);
    }
    /**
    * Borra un administrador
    * @param direccion Dirección de cuenta EAO que eliminar
    */
    function borrar_administrador(address direccion) public virtual 
    si_administrador_con_permiso (k_permiso_maximo) {
        int i;
        i = leer_administrador_pos(direccion);
        require(i >= 0, unicode"El usuario no existe. ");
        acl_array[uint(i)] = acl_array[acl_array.length - 1];
        acl_array.pop();
    }

}