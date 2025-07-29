package com.gqt.CoreJava.Pattern;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
		    
		    for (int space = 1; space <= rows - i; space++) {
		        System.out.print("  ");
		    }

		    
		    for (int j = 1; j <= i; j++) {
		        System.out.print(j + " ");
		    }

		    
		    for (int j = i - 1; j >= 1; j--) {
		        System.out.print(j + " ");
		    }

		    System.out.println();
		}


	}

}
