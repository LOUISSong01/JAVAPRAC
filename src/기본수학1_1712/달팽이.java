package 기본수학1_1712;

import java.util.Scanner;

public class 달팽이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int k =1;
		
		
		//달팽이의 높이가 V보다 작을 때, k는 일수
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
