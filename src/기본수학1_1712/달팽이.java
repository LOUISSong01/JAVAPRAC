package �⺻����1_1712;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int k =1;
		
		
		//�������� ���̰� V���� ���� ��, k�� �ϼ�
		while(((A-B)*k) <= V) {
			if((k*(A-B) + A) >= V) {
				k++;
				break;
				
			}
			k++;
		}
		
		System.out.print(k);

	}

}
