package 기본수학1_1712;

import java.util.Scanner;

public class 설탕_배달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum =0;

		
	while(true) {
		if(N%5 ==0) {
			sum += (N/5);
			System.out.println(sum);
			break;
		}
		else {
		       N-=3;
		       sum++;
		}
		
		if(N<0) {
			System.out.println(-1);
			break;
		}
		
		
	}
	    
		
	

	}
}
