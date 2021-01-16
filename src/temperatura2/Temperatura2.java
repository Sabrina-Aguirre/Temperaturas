
package temperatura2;

import java.util.Scanner;


public class Temperatura2 {

    
    public static void main(String[] args) {
        //definimos los vectores
        String ciudades [] = new String [2];
        int minimas [] = new int [2];
        int maximas [] = new int [2];
        
        Scanner teclado = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);
        //cargar los 3 vectores
        for (int i=0; i<ciudades.length; i++){
            System.out.println("Ingrese la ciudad en conjunto con su minima y su máxima temperatura: ");
            ciudades[i] = teclado.next();
            minimas[i] = teclado2.nextInt();
            maximas[i] = teclado2.nextInt();
        }
        
        //buscar los 3 vectores:
        
        //buscar la minima:
        int minima = 99999;
        int posicMin = 0;
        
        for (int i=0; i<minimas.length; i++){
            if (minimas[i]< minima){
                minima = minimas[i];
                posicMin=i;
            }
        }
        //buscar la maxima
        int maxima = -99999;
        int posicMax = 0;
        for (int i=0; i<maximas.length; i++){
        if (maximas[i]>maxima){
            maxima = maximas[i];
            posicMax = i;
        }
        
    }
        //voy a mostrar los resultados
        System.out.println("La temperatura más baja es encontrada en las ciudades de Misiones es:  " + minima + " y corresponde a la ciudad de: " + ciudades[posicMin]);
        System.out.println("La temperatura más baja es encontrada en las ciudades de Misiones es:  " + maxima + " y corresponde a la ciudad de: " + ciudades[posicMax]);

    }
    
}
