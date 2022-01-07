package 문자열;

import java.util.Scanner;

public class 단어공부_1157 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toUpperCase();
		int [] arry = new int[26];
		int max=0;
		int k=0;
		int t=0;
		
		
		for(int i=0; i<s.length(); i++) {
			arry[s.charAt(i) - 65]++;
		}
	
		for(int i=0; i<arry.length; i++) {
			if(arry[i]> max) {
				max = arry[i];
			}
		}
		
		for(int i=0; i<arry.length;i++) {
			if(max == arry[i]) {
				t = i;
				k++;
			}
		}
		
		if(k>1) {
			System.out.println("?");
		} else {
			System.out.println((char) (t+65));
		}
			
			
		}
		
	}


