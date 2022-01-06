package 기본수학1_1712;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int t=0;
		
		for(int i=0; i<T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			
			
			int [] arry = new int [H*W];
			t=0;
			
			for(int k=1; k<=W; k++) {
		
			   for(int j=1; j<=H; j++) {
				   arry[t] = (j*100 + k);
				   t++;
			   }
			}
			System.out.println(arry[N-1]);
			
		}
		
	}

}
