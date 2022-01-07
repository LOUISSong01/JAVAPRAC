package 문자열;

import java.util.Scanner;

public class 함수 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char [] carry = new char [s.length()];
		int sum=0;
		
		for(int i=0; i<carry.length; i++) {
			carry[i] = s.charAt(i);
		}
		
		System.out.println(test(3));
	}
	
	public static int test(int n) {
		return n;
	}
}

