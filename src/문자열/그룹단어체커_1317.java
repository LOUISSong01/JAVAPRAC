package ���ڿ�;

import java.util.Scanner;

public class �׷�ܾ�üĿ_1317 {

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
		    	int h= 3;
		    	if((j+h) >= s.length()) break;
		    	
		    	
		    	if(s.charAt(j) == (s.charAt(j+h)))
		    		t++;
		    		break Outter;
		  
		    	
			}
		   }
		}
System.out.println(t);
	}
}
