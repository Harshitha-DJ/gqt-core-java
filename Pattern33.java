package com.gqt.CoreJava.Pattern;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 
        char startChar;

        for (int i = 1; i <= n; i++) {
         
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            startChar = (char) ('A' + (2 * (i - 1)));

            for (char ch = startChar; ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

	}

}
