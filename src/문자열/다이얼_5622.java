package 문자열;
import java.util.Scanner;


public class 다이얼_5622 {
	
	public static void main(String [] args) {
		int t=3;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char [] carry = new char [s.length()];
		int [] arry = new int[s.length()];
		int sum=0;
		
		for(int i=0; i<carry.length; i++) {
			carry[i] = s.charAt(i);
		}
		
		for(int i=0; i<carry.length; i++) {
			if(i>0) {
				t=3;
			}
			for(int k=2; k<=27; k+=1) {
				if((carry[i]-65) == 18) {
					arry[i] = 8;
					break;
				}	
				if((carry[i]-65) == 25) {
					arry[i] = 10;
					break;
				}
			if((carry[i] -65) <= k) {
				arry[i] = t;
			}
			else t++;
				
			}
		}
		
		for(int i=0; i<arry.length; i++) {
			sum+= arry[i];
		}
		System.out.println(sum);
	}
}
