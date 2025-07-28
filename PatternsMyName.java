
package PatternsCS;

import java.util.Scanner;

/**
 * @author Harshitha
 * @category Patterns
 * @description This is an Example for printing name.
 */
public class PatternsMyName {

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
				if(j==0 || j == n-1 || i == n/2) 
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
				if(j==0 || j == n-1 || i == n/2 || i==0) 
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
				if(j == 0 || i+j == n/2 ||i-j == n/2 || (i==0 && j<=n/2))
				{
					System.out.print("#  ");
				}
				else {
					System.out.print("   ");
				}
			}
		System.out.println();
		}
		System.out.println("-----------------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i == 0 || i == n/2 ||i == n-1 || (j==0 && i<=n/2) || (j==n-1 && i>=n/2))
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
				if(j==0 || j == n-1 || i == n/2) 
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
				if(i==0 || j == n/2 || i == n-1) 
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
				if(i == 0 || j == n/2)
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
				if(j==0 || j == n-1 || i == n/2) 
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
				if(j==0 || j == n-1 || i == n/2 || i==0) 
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
