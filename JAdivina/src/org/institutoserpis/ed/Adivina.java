package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		Random random = new Random ();
		Scanner scanner = new Scanner (System.in);
		int numeroAleatorio = random.nextInt(1000)	+ 1;
		int numero;
		System.out.println("Tengo un número escondido entre uno y mile, adivina");
		
		
		boolean correcto = false;
		
		do{
			System.out.println("Introduce el número: ");
			String line = scanner.nextLine();
			numero = Integer.parseInt(line);
			//damos pista al usuario
			if (numero<numeroAleatorio)
				System.out.println("Tu número es menor");
			else if (numero>numeroAleatorio)
				System.out.println("Tu número es mayor");
			else
				correcto = true;
			
			
		} while (correcto == false);
		System.out.println("Has ganado");

	}

}
