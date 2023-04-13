package inclui.web3j.hola_mundo_web3j;

import inclui.web3j.web3js;
import innui.bases;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.web3j.generated.contracts.Hola_mundos;
import static innui.web3j.generated.contracts.Hola_mundos.FUNC_LEER;
import java.util.List;
import java.util.ResourceBundle;
import org.web3j.abi.datatypes.Type;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.EthCall;
import org.web3j.tx.gas.DefaultGasProvider;

/**
 *
 * @author emilio
 */
public class Hola_mundos_web3j extends bases {
    public static String k_in_ruta = "in/inclui/web3j/hola_mundo_web3j/in";  //NOI18N
    public web3js web3j;
    public Hola_mundos hola_mundos;

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
            hola_mundos = Hola_mundos.load(web3_direccion_contrato, web3j.web3j, web3j.transactionManager, web3j.defaultGasProvider);
            escribir_linea(tr.in(in, "Datos de conexión con el contrato cargados. "), ok, extras_array);
            if (ok.es == false) { return false; }
            web3j.web3_direccion_contrato = web3_direccion_contrato;
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return ok.es;
    }    
    /**
     * Llama a la función leer de Hola_mundos y procesa los posibles resultados
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    public String leer(oks ok, Object ... extras_array) throws Exception {
        String resultado = null;
        EthCall ethCall = null;
        ResourceBundle in;
        in = ResourceBundles.getBundle(k_in_ruta);
        String nombre_funcion = FUNC_LEER;
        try {
            if (ok.es == false) { return null; }
            RemoteFunctionCall<String> remoteFunctionCall = hola_mundos.leer();
            ethCall = web3j.llamar_funcion_sin_gas(remoteFunctionCall, ok, extras_array);
            if (ok.es == false) { return null; }
            List<Type> types_list = remoteFunctionCall.decodeFunctionResponse(ethCall.getValue());
            if (types_list != null) {
                resultado = types_list.get(0).getValue().toString();
            }
            // resultado = remoteFunctionCall.send(); // Método con menos información de errores-
            escribir_linea(tr.in(in, "Respuesta recibida desde función de contrato inteligente: ") 
                    + nombre_funcion, ok, extras_array);
            if (ok.es == false) { return null; }
            escribir_linea(resultado, ok, extras_array);
            if (ok.es == false) { return null; }
        } catch (Exception e) {
            ok.setTxt(e); 
        }
        return resultado;
    }
}
