package com.gqt.core.java.patterns;

import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		int count = n*n;
		for(int i=1; i<=n; i++)
		{
			count = 1;
			for(int j=1; j<=i; j++)
			{
				
				System.out.print(count + "  ");
				count = count + 1;
				
			}
			System.out.println();
		}

	}

}
