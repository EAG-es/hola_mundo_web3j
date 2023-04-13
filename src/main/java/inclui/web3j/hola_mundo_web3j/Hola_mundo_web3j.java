package inclui.web3j.hola_mundo_web3j;

import inclui.web3j.web3js;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.modelos;
import static java.lang.System.exit;
import java.math.BigInteger;
import java.util.ResourceBundle;

/**
 *
 * @author emilio
 */
public class Hola_mundo_web3j extends iniciales {
    /** 
     * Ruta de los recursos de traducción para este paquete
     */
    public static String k_in_ruta = "in/inclui/web3j/hola_mundo_web3j/in";  //NOI18N
    public static String k_wallet_ruta = "/re";  
    public static String k_web3_endpoint_https = "web3_endpoint_https";
    public static String k_web3_endpoint_wss = "web3_endpoint_wss";
    public static String k_web3_archivo_EAO = "web3_archivo_EAO";
    public static String k_web3_clave_EAO = "web3_clave_EAO";
    public static String k_web3_direccion_contrato_hola_mundos = "web3_direccion_contrato_hola_mundos";
    public static String k_web3_gas_disponible_total = "web3_gas_disponible_total";
    public static String k_web3_gas_aceptable_por_transaccion = "web3_gas_aceptable_por_transaccion";
    public web3js web3j = new web3js();
    public Hola_mundos_web3j hola_mundos_web3j = new Hola_mundos_web3j();
    public Bases_web3j bases_web3j = new Bases_web3j();
    /**
     * Inicio de la aplicación
     * @param args 
     */
    public static void main(String[] args) {
        oks ok = new oks();
        Hola_mundo_web3j hola_mundo_web3j = null;
        try {
            hola_mundo_web3j = new Hola_mundo_web3j();
            hola_mundo_web3j.run(ok);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        if (ok.es == false) {
            System.err.println(ok.txt);
            exit(1);
        } else {
            exit(0);
        }
    }    
    /**
     * Inicio de la aplicación desde un objeto instanciado
     * @param ok Comunicar resultados
     * @param extras_array Opción de añadir parámetros en el futuro.
     * @return true si todo va bien
     * @throws Exception Opción de notificar errores de excepción
     */
    public boolean run(oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return ok.es; }
            ResourceBundle in = null;
            iniciar(ok);
            if (ok.es) { 
                in = ResourceBundles.getBundle(k_in_ruta);
                // Inicio del código propio de la aplicación
                while (true) {
                    conectar_web3(ok);
                    if (ok.es == false) { break; }
                    bases_web3j.cargar_contrato_hola_mundos(web3j.web3_direccion_contrato, ok, extras_array);
                    if (ok.es == false) { break; }
                    bases_web3j.leer_acl_array(BigInteger.valueOf(0), ok, extras_array);
                    if (ok.es == false) { break; }
                    bases_web3j.leer_acl_array(BigInteger.valueOf(3), ok, extras_array);
                    if (ok.es == false) { break; }
                    bases_web3j.leer_estado(ok, extras_array);
                    if (ok.es == false) { break; }
                    bases_web3j.inactivar(web3j.web3_gas_aceptable_por_transaccion, ok, extras_array);
                    if (ok.es == false) { break; }
                    bases_web3j.limitar(web3j.web3_gas_aceptable_por_transaccion, ok, extras_array);
                    if (ok.es == false) { break; }
                    bases_web3j.activar(web3j.web3_gas_aceptable_por_transaccion, ok, extras_array);
                    if (ok.es == false) { break; }
                    hola_mundos_web3j.cargar_contrato_hola_mundos(web3j.web3_direccion_contrato, ok);
                    if (ok.es == false) { break; }
                    hola_mundos_web3j.leer(ok);
                    if (ok.es == false) { break; }
                    break;
                }
                // Fin del código propio de la aplicación
                oks ok_fin = new oks();
                terminar(ok_fin);
                if (ok_fin.es == false) {
                    ok.setTxt(ok.getTxt(), ok_fin.getTxt());
                }
            }
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean iniciar(oks ok, Object... extra_array) throws Exception {
        // Iniciar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        _iniciar_desde_clase(modelos.class, ok);
        if (ok.es == false) { return ok.es; }
        _iniciar_desde_clase(this.getClass(), ok);
        return ok.es;
    }
    
    @Override
    public boolean terminar(oks ok, Object... extra_array) throws Exception {
        // Terminar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        _terminar_desde_clase(modelos.class, ok);
        if (ok.es == false) { return ok.es; }
        String texto = web3j.web3_gas_disponible_total.toString();
        properties.setProperty(k_web3_gas_disponible_total, texto);
        _terminar_desde_clase(this.getClass(), ok);
        return ok.es;
    }
    /**
     * Conecta con el punto de acceso HTTPS e inicia los objetos de manejo de los contratos inteligentes
     * @param ok
     * @param extras_array
     * @return
     * @throws Exception 
     */
    public boolean conectar_web3(oks ok, Object ... extras_array) throws Exception {
        try {
            if (ok.es == false) { return false; }
            String texto;
            web3j.web3_endpoint_https = properties.getProperty(k_web3_endpoint_https);
            web3j.web3_endpoint_wss = properties.getProperty(k_web3_endpoint_wss);
            web3j.web3_archivo_EAO = properties.getProperty(k_web3_archivo_EAO);
            web3j.web3_clave_EAO = properties.getProperty(k_web3_clave_EAO);
            web3j.web3_direccion_contrato = properties.getProperty(k_web3_direccion_contrato_hola_mundos);
            texto = properties.getProperty(k_web3_gas_disponible_total);
            web3j.web3_gas_disponible_total = new BigInteger(texto);
            texto = properties.getProperty(k_web3_gas_aceptable_por_transaccion);
            web3j.web3_gas_aceptable_por_transaccion = new BigInteger(texto);
            web3j.iniciar(k_wallet_ruta, ok, extras_array);
            if (ok.es == false) { return false; }
            hola_mundos_web3j.web3j = web3j;
            bases_web3j.web3j = web3j;
        } catch (Exception e) {
            ok.setTxt(e);            
        }
        return ok.es;
    }

}
