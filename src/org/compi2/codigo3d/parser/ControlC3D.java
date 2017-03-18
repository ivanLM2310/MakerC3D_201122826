package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static int etiqueta = 0;
    private static String etiquetaV = "";
    private static String etiquetaF = "";
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }

    public static String generaEtq()
    {
        return "L"+ etiqueta++;
    }
    
    public static int getEtiqueta() {
        return etiqueta;
    }

    public static void setEtiqueta(int etiqueta) {
        ControlC3D.etiqueta = etiqueta;
    }

    public static String getEtiquetaV() {
        return etiquetaV;
    }

    public static void setEtiquetaV(String etiquetaV) {
        ControlC3D.etiquetaV = etiquetaV;
    }

    public static String getEtiquetaF() {
        return etiquetaF;
    }

    public static void setEtiquetaF(String etiquetaF) {
        ControlC3D.etiquetaF = etiquetaF;
    }
    
    
}
