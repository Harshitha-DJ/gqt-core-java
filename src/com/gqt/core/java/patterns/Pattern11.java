package com.gqt.core.java.patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		int count =25;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				System.out.print(count + "  " );
				count--;
		        
			}
			System.out.println();

	}

}
}


	