/**
 * @author PRATHAMESH TIBILE
 * @since 11-6-21
 * To check whether the number is even or odd
 */


package Core_programs;

import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
	
		if (number%2 ==0)
			System.out.println("The number is even");
		else 
			System.out.println("The number is odd");	
		
		sc.close();	
	}
	

}

