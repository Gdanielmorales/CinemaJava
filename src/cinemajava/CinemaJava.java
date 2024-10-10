
package cinemajava;

import java.util.Scanner;

import clases.Cine;
import clases.Espectadores;
import clases.Pelicula;

public class CinemaJava {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese el título de la película:");
        String titulo = scanner.nextLine();
        
        System.out.println("Ingrese la duración de la película (en minutos):");
        int duracion = scanner.nextInt();
        
        System.out.println("Ingrese la edad mínima para ver la película:");
        int edadMinima = scanner.nextInt();
        
        scanner.nextLine();  
        
        System.out.println("Ingrese el nombre del director:");
        String director = scanner.nextLine();
        
        Pelicula pelicula = new Pelicula(titulo, duracion, edadMinima, director);
        
        System.out.println("Ingrese el valor de la entrada");
        
        double valorEntrada = scanner.nextDouble();
        
       Cine cine = new Cine(pelicula, valorEntrada);
        
        boolean continuar = true;
        
        while (continuar){
            System.out.println("Ingrese su nombre");
            scanner.nextLine();
            String nombreEspectador = scanner.nextLine();
            System.out.println("Ingrese la edad");
            int edadEspectador = scanner.nextInt();
            System.out.println("Ingrese el efectivo");
            double efectivoEspectador = scanner.nextDouble();
            
            Espectadores espectadores = new Espectadores(nombreEspectador, edadEspectador, efectivoEspectador);
            
            System.out.println("Ingrese la fila del asiento (0-7):");
            int fila = scanner.nextInt();
            System.out.println("Ingrese la columna del asiento (0-8)");
            int columna = scanner.nextInt();
            
            if (cine.asignarEspectador(espectadores, fila, columna)){
                System.out.println("Asiento vendido correctamente");
            } else {
                System.out.println("No se pudo vender el asiento, le buscaremos un asiento aleatorio...");
                
                boolean asientoAsignado = false;
                
                while (!asientoAsignado){
                    int filaAleatoria = (int) (Math.random() * 8);
                    int columnaAleatoria = (int) (Math.random() * 9);
                    
                    if (cine.asientoDisponible(filaAleatoria, columnaAleatoria)){
                        System.out.println("Se encontró un lugar disponible en la fila " + filaAleatoria + " , columna  " + columnaAleatoria );
                        System.out.println("¿Desea ocupar ese lugar? (SI/NO):");
                        String respuesta = scanner.next();
                        
                        if (respuesta.equalsIgnoreCase("SI")){
                            cine.asignarEspectador(espectadores, filaAleatoria, columnaAleatoria);
                            asientoAsignado = true;
                            System.out.println("Asiento asignado correctamente.");
                        } else {
                            System.out.println("Buscando otro lugar disponible...");
                        }
                    }
                }
            }
            
            cine.mostrarAsientos();
            
            System.out.println("¿Deses ingresar otro espectador? (SI/NO):");
            String respuesta = scanner.next();
            if(respuesta.equalsIgnoreCase("NO")){
                continuar = false;
            }
        }
                
    }
        
       
           
    
}

    
    

