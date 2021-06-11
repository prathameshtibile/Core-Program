/**
 * determine whether the year is leap or not
 * @since 11-6-21
 * @author PRATHAMESH TIBILE
 */
package Core_programs;

import java.util.Scanner;

public class Leap_year {
     public static void main(String[] args) {
		int year;
		System.out.println("please enter year :");
    	Scanner sc = new Scanner(System.in);
    	year = sc.nextInt();
    	
    	if (((year % 4 ==0) && (year % 100!=0)) || (year%400==0))
    		System.out.println("it is a leap year");
    	else
    		System.out.println("it is a not a leap year");
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
	
	
	
	
	
	
	
	
	
}
