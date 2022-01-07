package 문자열;

import java.util.Scanner;

public class 단어의개수_1152_ver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();  //공백을 담고 있는 문자열일 때,
	
		
		String [] tokens =s.split(" ");
		
		if(s =="") {
			System.out.println(0);
		} else {
			System.out.println(tokens.length);
		}
		
	}

}

//s.strip이나 s.trim 메소드를 통해 앞뒤 공백을 삭제할 수 있음.