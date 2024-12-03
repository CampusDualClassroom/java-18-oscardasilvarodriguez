package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int param = Utils.integer("Introduce el número de elementos: \n");
		createAndInitializeArray(param);

		System.out.println("Elementos del array: ");
		showInlineArray(createAndInitializeArray(param));

	}

	public static int[] createAndInitializeArray(int param) {
		int [] intArray = new int[param];
		for (int i = 1; i < intArray.length; i++) {
			intArray[i] = i;
		}
        return intArray;
    }
	public static void showInlineArray(int[] intArray) {
		for (int element : intArray) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
}
