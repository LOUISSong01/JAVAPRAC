package ���ڿ�;

import java.util.Scanner;

public class �׷�ܾ�üĿ_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����� �׽�Ʈ ���̽�
		int n = sc.nextInt();
		//t�� �׷� �ܾ �̴� ���� ���� 
		int t=0;
	
		//n������...
		for(int i=0; i<n; i++){
		   String s = sc.next();
		   
		   if(s.length() >2) {
		    Outter : for(int j=0; j<s.length()-2; j++){
		    	for(int h=2; h<s.length(); h++) {
		    	if((j+h) >= s.length()) break;
		    	
		    	
		    	if(s.charAt(j) == (s.charAt(j+h))) {
		    		if(s.charAt(j) == s.charAt(j+1)) break;
		    		t++;
		    		break Outter;
		    	}
		    	}
			}
		   }
		}
System.out.println(n-t);
	}
}
