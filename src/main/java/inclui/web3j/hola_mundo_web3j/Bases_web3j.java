package inclui.web3j.hola_mundo_web3j;

import inclui.web3j.web3js;
import innui.bases;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.web3j.generated.contracts.Bases;
import innui.web3j.generated.contracts.Hola_mundos.acls;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import org.web3j.abi.datatypes.Type;
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
        TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(base.activar(), gas_aceptable, ok, extras_array);
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
        TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(base.inactivar(), gas_aceptable, ok, extras_array);
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
        TransactionReceipt transactionReceipt = web3j.firmar_y_llamar_funcion_con_gas(base.limitar(), gas_aceptable, ok, extras_array);
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
            Tuple3<String, String, byte[]> tuple3;
            RemoteFunctionCall<Tuple3<String, String, byte[]>> remoteFunctionCall = base.acl_array(posicion);
            EthCall ethCall = web3j.llamar_funcion_sin_gas(remoteFunctionCall, ok, extras_array);
            if (ok.es == false) { return null; }
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(ethCall.getValue());
            if (types_list != null) {
                tuple3 = new Tuple3<>((String) types_list.get(0).getValue()
                  , (String) types_list.get(1).getValue()
                  , (byte []) types_list.get(2).getValue());
                types_list.get(0).getValue();
                byte[] bytes_array = tuple3.component3();
                List<Bytes32> bytes32_list = new LinkedList<>();
                Bytes32 bytes32;
                int tam = bytes_array.length;
                int i = 0;
                int ii = 0;
                int max_ii = 32;
                byte[] bytes_array_32 = new byte[32];
                while (true) {
                    ii = 0;
                    if (i >= tam) {
                        break;
                    }
                    while (true) {
                        if (ii>= max_ii) {
                            break;
                        }
                        if (i < tam) {
                            bytes_array_32[ii] = bytes_array[i];
                        } else {
                            bytes_array_32[ii] = 0;
                        }
                        ii = ii + 1;
                        i = i + 1;
                    }
                    bytes32_list.add(new Bytes32(bytes_array_32));
                }
                bytes32 = bytes32_list.get(0);
                bytes32_list.remove(0);
                List<byte[]> bytes_arrays_list = new LinkedList<>();
                for (Bytes32 elemento: bytes32_list) {
                    bytes_arrays_list.add(elemento.getValue());
                }
                acl = new acls(tuple3.component1(), tuple3.component2(), bytes32.getValue(), bytes_arrays_list);
            }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return acl;
    }
}
