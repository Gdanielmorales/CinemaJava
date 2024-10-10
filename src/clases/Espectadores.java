
package clases;


public class Espectadores {
     private String nombre;
    private int edad;
    private double efectivo;

    public Espectadores(String nombre, int edad, double efectivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.efectivo = efectivo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEfectivo() {
        return efectivo;
    }

    @Override
    public String toString() {
        return "Espectadores{" + "nombre=" + nombre + ", edad=" + edad + ", efectivo=" + efectivo + '}';
    }
    
    
    
    
}

    

