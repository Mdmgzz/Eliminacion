package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
	static boolean esPrimo (int numero) {
        boolean primo=true;						// comprueba si el numero es primo o no
        if (numero ==1) {						// si el numero es = a 1 el numero no es primo	
            primo=false;
        }
        for (int j = 2; j<numero;j++) {        // el for hace el modulo de j y si al hacerlo este es = 0 entonces no será primo
            if (numero%j==0) {
                primo=false;
            }
        }
        return (primo);    // devuelve primo
    }


	public static void main(String[] args) {
		//bloque de variables
		int numeros []= new int [10];
		int contador=0; 
		
		// creamos scanner
		Scanner sc=new Scanner (System.in);
		
		// creamos un bucle para pedir los 10 numeros por teclado
		for (int i=0; i<10;i++) {
			System.out.println("Introduzca un numero: ");
			numeros[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(numeros));
		
		while (contador<numeros.length){
			if (!esPrimo(numeros[contador])) {
				contador++;
			}else {
				System.arraycopy(numeros, contador + 1, numeros, contador, numeros.length-contador-1);
				numeros=Arrays.copyOf(numeros,numeros.length-1);
			}
			
		}
		
		System.out.println(Arrays.toString(numeros));
	//cerramos scanner
		sc.close();
	}
	

}
