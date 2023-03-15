package Pythagorean_triples;

import java.util.Scanner;

public class Pythagorean_triples {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("c: ");
		int c = sc.nextInt();
//		int c = 10;
		
		if (!formula(c, 1)) {	
			if (!formula(c, 2)) {
				System.out.println("Reseni neexistuje.");
			}
		}
	}
	public static boolean isWhole(double a) {
		return(a%1 == 0);
	}
	
//	public static boolean isPrime(int c) {
//		int divisors = 0;
//		for (int i = 1; i <= c; i++) {
//			boolean divisible = (c%i == 0);
//			if (divisible == true) {
//				divisors++;
//			}
//		}
//		if(divisors == 2) {
//			return true;
//		}
//		
//		return false;
//	}
	
	public static boolean isUnfair (int a, int b, int c) {
		for (int i = 2; i < c; i ++) {
			if (a%i == 0 && b%i == 0 && c%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean formula(int c, int sub) {
		int c1 = c;
		int b = c1 - sub;
		c1 = c1 * c1;
		b = b * b;
		double aDouble = (Math.sqrt(c1 - b));
		
		if(isWhole(aDouble)) {
			int a = (int)aDouble;
			b = ((int)Math.sqrt(b));
			c1 = ((int)Math.sqrt(c1));
			
			if (a < b && (isUnfair(a, b, c))) {
//				System.out.println("1\n");
				System.out.println(a+"^2 + "+b+"^2 = "+c+"^2");	
				return true;
			}
		}
		else {
			int a = 0;
			b = 0;
			for(a = 1; a <= c; a++) {
				for(b = 2; b <= c; b++) {
					int abPow = (a * a) + (b * b);
					if(abPow == (c * c) && isUnfair(a, b, c)) {
//						System.out.println("1\n");
						System.out.println(a+"^2 + "+b+"^2 = "+c+"^2");
						return true;
					}
				}
			}
//			
//			for(a = 2; a < c; a = (a + 2)) {
//				for(b = 1; b <= c; b = (b + 2)) {
//					int abPow = (a * a) + (b * b);
//					if(abPow == (c * c) && isUnfair(a, b, c1)) {
////						System.out.println("2\n");
//						System.out.println(a+"^2 + "+b+"^2 = "+c+"^2");
//						return true;
//					}
//				}
//			}
		}
		return false;
	}
}