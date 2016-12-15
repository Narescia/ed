package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int index = indexOf(new int[]{32,15,7,9,12}, 99);
		System.out.println("Vector index =" + index);
	}	
	
	public static int indexOf(int[] v, int item){
		//Wirth Algoritmos y Estructuras de datos
		int index = 0;
		while (index < v.length && v[index] != item )
			index++;
		if (index == v.length)
			return -1;
			
		return index;
	}
	
}

