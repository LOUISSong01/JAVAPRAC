package ���ڿ�;

import java.util.Scanner;

public class �ܾ��ǰ���_1152_ver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();  //������ ��� �ִ� ���ڿ��� ��,
	
		
		String [] tokens =s.split(" ");
		
		if(s =="") {
			System.out.println(0);
		} else {
			System.out.println(tokens.length);
		}
		
	}

}

//s.strip�̳� s.trim �޼ҵ带 ���� �յ� ������ ������ �� ����.