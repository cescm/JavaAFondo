package paquete1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Arrays {
	public static void main (String [] arg) {
		
		//Manejo de Arrays y cadenas, repaso variables, bucle for normal y for para arrays
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int elemento: arr) {
			System.out.println(elemento);
		}
		String cadena = "Ejemplo de cadena";
		System.out.println("El caracter en la posición 4 es: " + cadena.charAt(4));
		System.out.println("La longitud de la cadena es: " + cadena.length());
		System.out.println("La cadena en minúsculas es: " + cadena.toLowerCase());
		System.out.println("La cadena en mayúsculas es: " + cadena.toUpperCase());
		System.out.println("La primera ocurrencia del caracter \"o\" es: " + cadena.indexOf('o'));
		System.out.println("La última ocurrencia del caracter \"e\" es: " + cadena.lastIndexOf('e'));
		System.out.println("La subcadena entre los caracteres 3 y 5 es: " + cadena.substring(3, 6));
		System.out.println("La subcadena desde el caracter 3 hasta el final es : " + cadena.substring(3));
		System.out.println("La cadena comienza por \"Eje\" : " + cadena.startsWith("Eje"));
		System.out.println("La cadena comienza por \"eje\" : " + cadena.startsWith("eje"));
		System.out.println("La cadena termina por \"ena\" : " + cadena.endsWith("ena"));
		System.out.println("La cadena termina por \"enb\" : " + cadena.endsWith("enb"));
		System.out.println("La primera ocurrencia de la subcadena \"mplo\" es: " + cadena.indexOf("mplo"));
		System.out.println("La ultima ocurrencia de la subcadena \"de\" es: " + cadena.lastIndexOf("de"));
		Scanner sc = new Scanner(System.in);
		
		//uso StringBuffer
		StringBuffer sb = new StringBuffer();
		sb.append("Hola");
		sb.append(" esto es una prueba de StringBuffer");
		System.out.println(sb);
		
		//todos los wrappers tienen los métodos parseXXX y toString
		int i = 43;
		String sInt = Integer.toString(i); //aqui pasamos de int a String
		int i2 = Integer.parseInt(sInt); //aqui pasamos de String a int
		
		//StringTokenizer
		String s = "Juan|Marcos|Jorge|Antonio";
		StringTokenizer st = new StringTokenizer(s,"|");
		String tok;
		System.out.println("Vamos a imprimir todos los tokens de la cadena Juan|Marcos|Jorge|Antonio usando | como token");
		while (st.hasMoreTokens()) {
			tok = st.nextToken();
			System.out.println(tok);
		}
		
		//Para comparar cadenas no se usa == se usa el metodo equals
		String s1 = "Hola";
		String s2 = "hola";
		String s3 = "Hola";
		System.out.println("La cadena s1(" + s1 + ") es igual que s2(" + s2 + "): " + s1.equals(s2));
		System.out.println("La cadena s1(" + s1 + ") es igual que s3(" + s3 + "): " + s1.equals(s3));
	}
}
