package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etiquetaV, etiquetaF;

    public NodoC3D(String cad) {
        this.cad = cad;
    }

    public NodoC3D(String etiquetaV, String etiquetaF) {
        this.etiquetaV = etiquetaV;
        this.etiquetaF = etiquetaF;
    }
    
    
    public String getCad(){
        return cad;
    }

    public String getEtiquetaV() {
        return etiquetaV;
    }

    public void setEtiquetaV(String etiquetaV) {
        this.etiquetaV = etiquetaV;
    }

    public String getEtiquetaF() {
        return etiquetaF;
    }

    public void setEtiquetaF(String etiquetaF) {
        this.etiquetaF = etiquetaF;
    }
        
}
