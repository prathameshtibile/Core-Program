/**
 * @author PRATHAMESH TIBILE
 * @since 11-6-21
 * To check whether the Alphabet is Vowel or Consonant
 */
package Core_programs;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		
		if (ch == 'a' || ch =='e' ||  ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  )
			System.out.println("The given Alphabet is a Vowel");
		else	
			System.out.println("The given Alphabet is a consonant");
		
		
	}
}
