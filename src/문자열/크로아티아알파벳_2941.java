package ���ڿ�;

import java.util.Scanner;

public class ũ�ξ�Ƽ�ƾ��ĺ�_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���ڿ� n�� input���� �ޱ�
		String s = sc.nextLine();
		int k=0;
		
		//char �迭 ����
		char [] arry = new char[s.length()];
		
		//���ڿ��� ���ڷ� ����� �迭�� ����
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
