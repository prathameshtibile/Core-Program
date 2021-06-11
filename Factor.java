/**
 * @author PRATHAMESH TIBILE
 * @since 11-6-21
 * Compute the prime factorization
 */
package Core_programs;

import java.util.Scanner;

//check the number is prime 
public class Factor {

	public static boolean isprime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;		
	}
	// to find prime factors
	static void primefactors(int n) {
		for (int i = 2; i <= n; i++ ) {
			int t = n % i;
			if (t == 0) {
				if (isprime(i))
					System.out.println(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no to find prime factors");
		int n = sc.nextInt();
		System.out.println("prime factors are");
		primefactors(n);
	}
	
}
