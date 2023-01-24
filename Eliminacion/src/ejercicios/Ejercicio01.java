package ejercicios;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		// bloque de variables
		int tabla [] = new int[20];
		int numerosordenados[]=new int[20];
		int par=0;										// la variable par comienza en 0 ya que los numeros pares van al principio
		int impar=tabla.length-1;						// la variable impar empieza por la ult casilla de la tabla 
		
		//  creamos el bucle que generará los 20 numeros aleatorios
		for (int i=0 ; i<=tabla.length-1;i++) {
			tabla[i]=(int) (Math.random() * 101);
		}
		// mostramos la tabla generada
		System.out.println(Arrays.toString(tabla));
	
		for (int i=0;i<=tabla.length-1;i++) {			// este for comprueba si los numeros de la primera tabla y los va guardando en orden 
			if (tabla[i]%2==0) {						// si es par se guardará en la primera posicion 
				numerosordenados[par]=tabla[i];		// la variable par aumenta para que no se solapen los numeros
				par++;
			}else {										// si el numero no es par quiere decir que es impar
				numerosordenados[impar]=tabla[i];		// se guarda en la ult posicion de la tabla
				impar--;								// la variable impar desciende una unidad para que no se solapen
			}
		}
		System.out.println(Arrays.toString(numerosordenados));
		tabla=numerosordenados;
		for (int i=tabla.length ; i>par; i--) {
			tabla=Arrays.copyOf(tabla, tabla.length-1);
		}
		System.out.println(Arrays.toString(tabla));
}
}
