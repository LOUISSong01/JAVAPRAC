package ���ڿ�;

import java.util.Scanner;
public class ���_2908�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(flip(a) > flip(b)) {
			System.out.println(flip(a));
		} else {
			System.out.println(flip(b)); }}

	
	public static int flip(int num) {
		return ((num%10)*100)+(((num/10)%10)*10) +(num/100);
	}

}
