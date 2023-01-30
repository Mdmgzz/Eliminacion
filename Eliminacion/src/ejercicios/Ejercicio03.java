package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Bloque de variables
		//Array de 10 enteros
		int array[] = new int [10];
		int opcion=0; // sera la opcion que marquemos
		int v=0; //será el numero que querremos eliminar
		
		//creamos el scanner 
		Scanner sc= new Scanner(System.in);
		// llenamos el array con numeros enteros aleatorios
		for (int i=0;i<array.length;i++ ) {
			array[i]= (int) (Math.random()*11);
		}
		System.out.println("1- Mostrar valores.");
		System.out.println("2- Eliminar valor.");
		System.out.println("3- salir.");
		System.out.println("");
		System.out.println("Elija un valor: ");
		opcion = sc.nextInt();
		while ( opcion !=3 ) {
			
			if (opcion==1) {
				System.out.println(Arrays.toString(array));
			} else if (opcion==2){
				System.out.println("Introduzca el numero que quieres eliminar");
				v = sc.nextInt();
				for (int i=0;i<array.length;i++) {
					if (array[i] == v) {
						System.arraycopy(array, i + 1, array, i, array.length-i-1);
						array=Arrays.copyOf(array,array.length-1);
					}
				}
			}else {
				System.out.println("Introduzca una opcion correcta.");
				System.out.println("");
				System.out.println("Elija un valor: ");
				opcion = sc.nextInt();
			}
		}
		
		
		
		//cerramos scanner
		sc.close();
	}

}
