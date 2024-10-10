
package clases;


public class Asientos {
    
    private String etiqueta;
    private boolean ocupado;

    public Asientos(String etiqueta) {
        this.etiqueta = etiqueta;
        this.ocupado = false;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
    public boolean estaOcupado(){
        return ocupado;
    }
    public void ocupar(){
        this.ocupado = true;
    }

    @Override
    public String toString() {
        return "Asientos{" + "etiqueta=" + etiqueta + ", ocupado=" + ocupado + '}';
    }
    
}
    

