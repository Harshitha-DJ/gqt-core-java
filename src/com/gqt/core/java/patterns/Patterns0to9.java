package PatternsCS;

import java.util.Scanner;

/**
 * @author Harshitha
 * @category Patterns
 * @description this is an example of conditional statements patterns for numbers(0-9).
 */
public class Patterns0to9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-1 || j==n/2 || i+j == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || (j==n-1 && i <= n/2) || i==n/2 || (j==0 && i>=n/2) 
						|| i == n-1) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==n-1 || i == n-1 || i==n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n-1 || i==n/2 || (j== 0 && i<=n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || (j== 0 && i<=n/2) || i==n/2 || (j== n-1 && i>=n/2)|| i == n-1)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j== 0 || i==n-1 || (j== n-1 && i>=n/2)|| i == n/2)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j== n-1)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j== 0 || i==n-1 || j== n-1 || i == n/2)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || (j==0 && i<=n/2) || i==n-1 || j== n-1 || i == n/2)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		}
	}
