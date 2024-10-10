
package clases;


public class Cine {
     private Asientos[][] asiento;
    private Pelicula pelicula;
    private double valorEntrada;

    public Cine(Pelicula pelicula, double valorEntrada) {
        this.pelicula = pelicula;
        this.valorEntrada = valorEntrada;
        this.asiento = new Asientos[8][9];
        
        
        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 9; j++){
                this.asiento[i][j] = new Asientos("Fila " + (i + 1) + ", columna " + (j + 1));
            }
               
        }
    }
    public boolean asientoDisponible(int fila, int columna){
        if (fila < 0 || fila >= asiento.length || columna < 0 || columna >= asiento[0].length){
            System.out.println("La posición de asiento es inválida");
            return false;
        }
        return !asiento [fila][columna].estaOcupado();
    }
    
    public boolean asignarEspectador(Espectadores espectadores, int fila, int columna){
        if (espectadores.getEdad() < pelicula.getEdadMinima()){
            System.out.println(espectadores.getNombre() + " No cumples con la edad mínima para ver la pelicula");
            return false;
        }
        if (espectadores.getEfectivo() < valorEntrada){
            System.out.println(espectadores.getNombre() + " No tienes suficiente efectivo para la entrada");
            return false;
        }
        if (asientoDisponible(fila, columna)){
            asiento[fila][columna].ocupar();
            System.out.println(espectadores.getNombre() + " te toca el asiento " + asiento[fila][columna].getEtiqueta());
            return true;
        } else {
            System.out.println("El asiento de la "+ asiento[fila][columna].getEtiqueta() + " ya está ocupado");
            return false;
        }
    }
    
    public void mostrarAsientos() {
    System.out.println("Estado actual de los asientos:");
    for (int i = 0; i < asiento.length; i++) {
        for (int j = 0; j < asiento[i].length; j++) {
            if (asiento[i][j].estaOcupado()) {
                System.out.print("[X] ");  // Asiento ocupado
            } else {
                System.out.print("[ ] ");  // Asiento libre
            }
        }
        System.out.println();  // Salto de línea para la siguiente fila
    }
}

 
    

    public Pelicula getPelicula() {
        return pelicula;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }
    
    
}    

    

