package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		Random random = new Random ();
		Scanner scanner = new Scanner (System.in);
		int numeroAleatorio = random.nextInt(1000)	+ 1;
		System.out.println("Tengo un número escondido entre uno y mil, adivina");
		
		
		boolean correcto = false;
		int contadorIntentos = 0;
		
		do{
			contadorIntentos++;
			System.out.printf("Introduce el número (intento nº%d): ", contadorIntentos);
			String line = scanner.nextLine();
			int numero = Integer.parseInt(line);
			//damos pista al usuario
			if (numero<numeroAleatorio)
				System.out.println("Tu número es menor");
			else if (numero>numeroAleatorio)
				System.out.println("Tu número es mayor");
			correcto = numero == numeroAleatorio;	
		} while (correcto == false);
		System.out.printf("Has acertado (al intento n2%d).\n ", contadorIntentos);

	}

}
