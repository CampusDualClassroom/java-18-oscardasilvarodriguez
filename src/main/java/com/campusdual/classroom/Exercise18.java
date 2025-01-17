package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {

		showInlineArray(createAndInitializeArray(Utils.integer("Introduce el número de elementos: ")));
	}

	public static int[] createAndInitializeArray(int length) {
		int [] intArray = new int[length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
        return intArray;
    }
	public static void showInlineArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);

			if( i < intArray.length - 1) {
				System.out.println(" ");
			}
		}
	}
}
