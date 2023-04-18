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
        /**
         * Convierte a una estructura de contrato Bases.acl
         * @param ok
         * @param extras_array
         * @return
         * @throws Exception 
         */
        public Bases.acls convertir(oks ok, Object ... extras_array) throws Exception {
            Bases.acls bases_acl = null;
            try {
                if (ok.es == false) { return null; }
                byte [] bytes_array;
                byte [] bytes32_array;
                LinkedList<byte []> permisos_bytes_array_lista = new LinkedList<>();
                for (String texto: permisos_lista) {
                    bytes_array = texto.getBytes();
                    bytes32_array = Bytes__.ajustar(bytes_array, 32, ok, extras_array);
                    permisos_bytes_array_lista.add(bytes32_array);
                }
                bases_acl = new Bases.acls(direccion, usuario, clave_sha256, permisos_bytes_array_lista);
            } catch (Exception e) {
                throw e;
            }
            return bases_acl;
        }
        /**
         * Convierte una estructura de contrato Bases.acl a acl
         * @param bases_acl
         * @param ok
         * @param extras_array
         * @return
         * @throws Exception 
         */
        public static acls desconvertir(Bases.acls bases_acl, oks ok, Object ... extras_array) throws Exception {
            acls acl = null;
            try {
                if (ok.es == false) { return null; }
                acl = new acls();
                acl.direccion = bases_acl.direccion;
                acl.usuario = bases_acl.usuario;
                acl.clave_sha256 = bases_acl.clave;
                acl.permisos_lista = new LinkedList<>();
                for (byte [] bytes_array: bases_acl.permisos_array) {
                    acl.permisos_lista.add(new String(bytes_array));
                }
                
            } catch (Exception e) {
                throw e;
            }
            return acl;
        }
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
    
    public boolean actualizar_administrador_clave(BigInteger gas_aceptable, String clave_nueva, oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return false; }
            RemoteFunctionCall<TransactionReceipt> remoteFunctionCall = base.actualizar_administrador_clave(clave_nueva.getBytes());
            TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(remoteFunctionCall, gas_aceptable, null, ok, extras_array);
            if (ok.es == false) { return false; }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return ok.es;
    }
    
    public boolean actualizar_administrador(BigInteger gas_aceptable, acls acl, oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return false; }
            TransactionReceipt transactionReceipt;
            Bases.acls bases_acl;
            bases_acl = acl.convertir(ok, extras_array);
            if (ok.es == false) { return false; }
            RemoteFunctionCall<TransactionReceipt> remoteFunctionCall = base.actualizar_administrador(bases_acl);
            transactionReceipt = remoteFunctionCall.send();
            StringBuilder resultado = new StringBuilder();
            transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(remoteFunctionCall, gas_aceptable, resultado, ok, extras_array);
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(resultado.toString());
            if (ok.es == false) { return false; }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return ok.es;
    }

}
