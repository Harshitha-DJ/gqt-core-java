package com.gqt.CoreJava.Pattern;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        for (int i = 1; i <= n; i++) {
      
            for (int space = 1; space <= n - i; space++) {
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

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            
            for (int space = 1; space <= n - i; space++) {
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


