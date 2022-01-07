package 문자열;

import java.util.Scanner;

public class 그룹단어체커_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//몇번의 테스트 케이스
		int n = sc.nextInt();
		//t는 그룹 단어가 이닌 수의 개수 
		int t=0;
	
		//n번동안...
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
