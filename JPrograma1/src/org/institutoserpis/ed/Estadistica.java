package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Estadistica {
	
	public static void main(String[] args) {
		int vector[] = {40, 25, 17, 5, 70};
		mostrarVector(vector);
		System.out.println("La media es " + media(vector));
		System.out.println("El mínimo es " + min(vector));
		System.out.println("El máximo es " + max(vector));

	}
	static void mostrarVector (int datos[]){
		String output = "";
		for (int dato : datos) {
			String separator = output == "" ? "" : ", ";
			output = output + separator + dato;
		}
        System.out.println("[" + output + "]");
	}
	
	static double media (int[] vector){
	int i;
	  int   n = vector.length;
	  double suma = 0;
	  for (i=0; i<n; i++)
		  suma = suma + vector[i];
	  return suma/n;
	}
	
	public static int min(int[] v){
		int min = v[0];
		for (int item : v)
			if(item < min)
				min = item;
		return min;
	}
	
	public static int max(int[] v){
		int max = v[0];
		for (int item : v)
			if(item > max)
				max = item;
		return max;
	}

	
}
