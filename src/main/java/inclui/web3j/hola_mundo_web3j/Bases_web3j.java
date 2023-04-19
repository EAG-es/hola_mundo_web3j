package inclui.web3j.hola_mundo_web3j;

import inclui.web3j.Bytes__;
import inclui.web3j.web3js;
import innui.bases;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.web3j.generated.contracts.Bases;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.EthCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;

/**
 *
 * @author emilio
 */
public class Bases_web3j extends bases {
    /**
     * Estructura de almacenamiento de los administradores en: permisos_array
     */
    public static class acls extends bases {
        public String direccion;
        public String usuario;
        public byte [] clave_sha256;
        public List<String> permisos_lista; 
    }
    
    /** 
     * Ruta de los recursos de traducción para este paquete
     */
    public static String k_in_ruta = "in/inclui/web3j/hola_mundo_web3j/in";  //NOI18N
    public web3js web3j;
    public Bases base;
    
    /**
     * Carga los datos generales que utilizar con las llamadas a las funciones del contrato Hola_mundos
     * @param web3_direccion_contrato
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    public boolean cargar_contrato_hola_mundos(String web3_direccion_contrato, oks ok, Object ... extras_array) throws Exception {
        ResourceBundle in;
        in = ResourceBundles.getBundle(k_in_ruta);
        try {
            if (ok.es == false) { return false; }
            escribir_linea(tr.in(in, "Cargando datos de conexión con el contrato... Espera por favor (puede llevar bastante tiempo). "), ok, extras_array);
            base = Bases.load(web3_direccion_contrato, web3j.web3j, web3j.transactionManager, web3j.defaultGasProvider);
            escribir_linea(tr.in(in, "Datos de conexión con el contrato cargados. "), ok, extras_array);
            if (ok.es == false) { return false; }
            web3j.web3_direccion_contrato = web3_direccion_contrato;
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return ok.es;
    }
    /**
     * Llama a la función activar de bases
     * @param gas_aceptable
     * @param ok
     * @param extras_array
     * @return El hash de la trasaccion
     * @throws Exception 
     */
    public String activar(BigInteger gas_aceptable, oks ok, Object ... extras_array) throws Exception {
        TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(base.activar(), gas_aceptable, null, ok, extras_array);
        return transactionReceipt.getTransactionHash();
    }
    /**
     * Llama a la función inactivar de bases
     * @param gas_aceptable
     * @param ok
     * @param extras_array
     * @return El hash de la trasaccion
     * @throws Exception 
     */
    public String inactivar(BigInteger gas_aceptable, oks ok, Object ... extras_array) throws Exception {
        TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(base.inactivar(), gas_aceptable, null, ok, extras_array);
        return transactionReceipt.getTransactionHash();
    }
    /**
     * Llama a la función limitar de bases
     * @param gas_aceptable
     * @param ok
     * @param extras_array
     * @return El hash de la trasaccion
     * @throws Exception 
     */
    public String limitar(BigInteger gas_aceptable, oks ok, Object ... extras_array) throws Exception {
        TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(base.limitar(), gas_aceptable, null, ok, extras_array);
        return transactionReceipt.getTransactionHash();
    }
    /**
     * Obtener información del estado
     * @param ok
     * @param extras_array
     * @return El hash de la trasaccion
     * @throws Exception 
     */
    public BigInteger leer_estado(oks ok, Object ... extras_array) throws Exception {
        BigInteger retorno = null;
        try {
            if (ok.es == false) { return null; }
            RemoteFunctionCall<BigInteger> remoteFunctionCall = base.estado();
            EthCall ethCall = web3j.llamar_funcion_sin_gas(remoteFunctionCall, ok, extras_array);
            if (ok.es == false) { return null; }
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(ethCall.getValue());
            if (types_list != null) {
                retorno = (BigInteger) types_list.get(0).getValue();
            }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return retorno;
    }
    /**
     * Obtener información del estado
     * @param posicion
     * @param ok
     * @param extras_array
     * @return El hash de la trasaccion
     * @throws Exception 
     */
    @SuppressWarnings("unchecked")
    public acls leer_acl_array(BigInteger posicion, oks ok, Object ... extras_array) throws Exception {
        acls acl = null;
        try {
            if (ok.es == false) { return null; }
            RemoteFunctionCall<Tuple3<String,String,byte[]>> remoteFunctionCall = base.acl_array(posicion);
            EthCall ethCall = web3j.llamar_funcion_sin_gas(remoteFunctionCall, ok, extras_array);
            if (ok.es == false) { return null; }
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(ethCall.getValue());
            if (types_list != null) {
                acl = new acls();
                acl.direccion = ((Address) types_list.get(0)).getValue();
                acl.usuario = ((Utf8String) types_list.get(1)).getValue();
                acl.clave_sha256 = ((Bytes32) types_list.get(2)).getValue();
                acl.permisos_lista = leer_administrador_permisos_array(posicion, ok, extras_array);
            }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return acl;
    }
    
    @SuppressWarnings("unchecked")
    public List<String> leer_administrador_permisos_array(BigInteger posicion, oks ok, Object ... extras_array) throws Exception {
        List<String> permisos_lista = null;
        try {
            if (ok.es == false) { return null; }
            RemoteFunctionCall<List> remoteFunctionCall = base.leer_administrador_permisos_array(posicion);
            EthCall ethCall = web3j.llamar_funcion_sin_gas(remoteFunctionCall, ok, extras_array);
            if (ok.es == false) { return null; }
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(ethCall.getValue());
            if (types_list != null) {
                List<Bytes32> bytes32_lista = ((DynamicArray<Bytes32>) types_list.get(0)).getValue();
                permisos_lista = new LinkedList<>();
                for (Bytes32 bytes32: bytes32_lista) {
                    permisos_lista.add(new String(bytes32.getValue()));
                }
            }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return permisos_lista;
    }
    /**
     * Actualiza los datos del propio solicitante
     * @param gas_aceptable
     * @param usuario_nuevo
     * @param clave_nueva (convertida a bytes utf-8)
     * @param direccion_nueva
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    public boolean actualizar_administrador_usuario_clave_direccion(BigInteger gas_aceptable, String usuario_nuevo, String clave_nueva, String direccion_nueva, oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return false; }
            if (usuario_nuevo == null) {
                usuario_nuevo = "";
            }
            if (clave_nueva == null) {
                clave_nueva = "";
            }
            if (direccion_nueva == null || direccion_nueva.isBlank()) {
                direccion_nueva = "0x0000000000000000000000000000000000000000";
            }
            RemoteFunctionCall<TransactionReceipt> remoteFunctionCall = base.actualizar_administrador_usuario_clave_direccion(usuario_nuevo, clave_nueva.getBytes("utf-8"), direccion_nueva);
            TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(remoteFunctionCall, gas_aceptable, null, ok, extras_array);
            if (ok.es == false) { return false; }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return ok.es;
    }
    /**
     * Actualiza los datos de un administrador (si se tiene permiso)
     * @param gas_aceptable
     * @param direccion
     * @param usuario_nuevo
     * @param clave_nueva (convertida a bytes utf-8)
     * @param direccion_nueva
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    public boolean actualizar_administrador_usuario_clave_direccion(BigInteger gas_aceptable, String direccion, String usuario_nuevo, String clave_nueva, String direccion_nueva, oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return false; }
            if (usuario_nuevo == null) {
                usuario_nuevo = "";
            }
            if (clave_nueva == null) {
                clave_nueva = "";
            }
            if (direccion_nueva == null || direccion_nueva.isBlank()) {
                direccion_nueva = "0x0000000000000000000000000000000000000000";
            }
            RemoteFunctionCall<TransactionReceipt> remoteFunctionCall = base.actualizar_administrador_usuario_clave_direccion(direccion, usuario_nuevo, clave_nueva.getBytes("utf-8"), direccion_nueva);
            TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(remoteFunctionCall, gas_aceptable, null, ok, extras_array);
            if (ok.es == false) { return false; }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return ok.es;
    }

    public boolean actualizar_administrador_permisos_array(BigInteger gas_aceptable, String direccion, List<String> permisos_lista, oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return false; }
            List <byte []> permisos_byte_arrays_lista = new LinkedList<>();
            byte [] bytes_array;
            for (String permiso: permisos_lista) {
                bytes_array = Bytes__.ajustar(permiso.getBytes(), 32, ok, extras_array);
                permisos_byte_arrays_lista.add(bytes_array);
            }
            RemoteFunctionCall<TransactionReceipt> remoteFunctionCall = base.actualizar_administrador_permisos_array(direccion, permisos_byte_arrays_lista);
            TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(remoteFunctionCall, gas_aceptable, null, ok, extras_array);
            if (ok.es == false) { return false; }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return ok.es;
    }
    /**
     * Crea un administrador nuevo
     * @param gas_aceptable
     * @param direccion
     * @param usuario
     * @param clave
     * @param permisos_lista Lista de permisos. Puede ser null.
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    public boolean crear_administrador(BigInteger gas_aceptable, String direccion, String usuario, String clave, List<String> permisos_lista, oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return false; }
            List <byte []> permisos_byte_arrays_lista = new LinkedList<>();
            byte [] bytes_array;
            if (permisos_lista != null) {
                for (String permiso: permisos_lista) {
                    bytes_array = Bytes__.ajustar(permiso.getBytes(), 32, ok, extras_array);
                    permisos_byte_arrays_lista.add(bytes_array);
                }
            }
            byte [] clave_bytes_array = clave.getBytes("utf-8");
            RemoteFunctionCall<TransactionReceipt> remoteFunctionCall = base.crear_administrador(direccion
              , usuario, clave_bytes_array, permisos_byte_arrays_lista);
            TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(remoteFunctionCall, gas_aceptable, null, ok, extras_array);
            if (ok.es == false) { return false; }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return ok.es;
    }

    public boolean borrar_administrador(BigInteger gas_aceptable, String direccion, oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return false; }
            RemoteFunctionCall<TransactionReceipt> remoteFunctionCall = base.borrar_administrador(direccion);
            TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(remoteFunctionCall, gas_aceptable, null, ok, extras_array);
            if (ok.es == false) { return false; }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return ok.es;
    }

    public Boolean ser_administrador(String direccion, oks ok, Object ... extras_array) throws Exception {
        Boolean retorno = null;
        try {
            if (ok.es == false) { return null; }
            RemoteFunctionCall<Boolean> remoteFunctionCall = base.ser_administrador(direccion);
            EthCall ethCall = web3j.llamar_funcion_sin_gas(remoteFunctionCall, ok, extras_array);
            if (ok.es == false) { return null; }
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(ethCall.getValue());
            if (types_list != null) {
                retorno = (Boolean) types_list.get(0).getValue();
            }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return retorno;
    }

    public Boolean ser_administrador_con_algun_permiso(String direccion, List<String> permisos_lista, oks ok, Object ... extras_array) throws Exception {
        Boolean retorno = null;
        try {
            if (ok.es == false) { return null; }
            List <byte []> permisos_byte_arrays_lista = new LinkedList<>();
            byte [] bytes_array;
            if (permisos_lista != null) {
                for (String permiso: permisos_lista) {
                    bytes_array = Bytes__.ajustar(permiso.getBytes(), 32, ok, extras_array);
                    permisos_byte_arrays_lista.add(bytes_array);
                }
            }
            RemoteFunctionCall<Boolean> remoteFunctionCall = base.ser_administrador_con_algun_permiso(direccion
              , permisos_byte_arrays_lista);
            EthCall ethCall = web3j.llamar_funcion_sin_gas(remoteFunctionCall, ok, extras_array);
            if (ok.es == false) { return null; }
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(ethCall.getValue());
            if (types_list != null) {
                retorno = (Boolean) types_list.get(0).getValue();
            }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return retorno;
    }

    public Boolean ser_administrador_con_permiso(String direccion, String permiso, oks ok, Object ... extras_array) throws Exception {
        Boolean retorno = null;
        try {
            if (ok.es == false) { return null; }
            byte [] bytes_array;
            bytes_array = Bytes__.ajustar(permiso.getBytes(), 32, ok, extras_array);
            RemoteFunctionCall<Boolean> remoteFunctionCall = base.ser_administrador_con_permiso(direccion
              , bytes_array);
            EthCall ethCall = web3j.llamar_funcion_sin_gas(remoteFunctionCall, ok, extras_array);
            if (ok.es == false) { return null; }
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(ethCall.getValue());
            if (types_list != null) {
                retorno = (Boolean) types_list.get(0).getValue();
            }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return retorno;
    }

    public Boolean ser_administrador_con_todo_permiso(String direccion, List<String> permisos_lista, oks ok, Object ... extras_array) throws Exception {
        Boolean retorno = null;
        try {
            if (ok.es == false) { return null; }
            List <byte []> permisos_byte_arrays_lista = new LinkedList<>();
            byte [] bytes_array;
            if (permisos_lista != null) {
                for (String permiso: permisos_lista) {
                    bytes_array = Bytes__.ajustar(permiso.getBytes(), 32, ok, extras_array);
                    permisos_byte_arrays_lista.add(bytes_array);
                }
            }
            RemoteFunctionCall<Boolean> remoteFunctionCall = base.ser_administrador_con_todo_permiso(direccion
              , permisos_byte_arrays_lista);
            EthCall ethCall = web3j.llamar_funcion_sin_gas(remoteFunctionCall, ok, extras_array);
            if (ok.es == false) { return null; }
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(ethCall.getValue());
            if (types_list != null) {
                retorno = (Boolean) types_list.get(0).getValue();
            }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return retorno;
    }
}
