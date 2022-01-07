package 문자열;

import java.util.Scanner;

public class 크로아티아알파벳_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자열 n을 input으로 받기
		String s = sc.nextLine();
		int k=0;
		
		//char 배열 생성
		char [] arry = new char[s.length()];
		
		//문자열을 문자로 나누어서 배열에 저장
		for(int i=0; i<s.length(); i++) {
			arry[i] = s.charAt(i);
		}
		
		for(int i=0; i<arry.length; i++) {
			if((arry.length>i+1) && (arry[i+1] == 'j')) {
			if((arry[i] == 'l')||(arry[i] == 'n')){
				k++;
			}}
			if ((arry[i] == '=') ||(arry[i] == '-')) {
				k++;
			if(i>1) {
				if((arry[i-1] == 'z') && (arry[i-2] == 'd'))
					k++;
		}		
	}
	}
		System.out.println(arry.length - k);
}
}
