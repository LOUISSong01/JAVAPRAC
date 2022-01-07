package 기본수학1_1712;

import java.util.Scanner;

public class 부녀회장 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [][] arry = new int[15][15];
		
		for(int i=0; i<15; i++) {
			arry[i][1] = 1;
			arry[0][i] = i;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++) {
				
				arry[i][j] = arry[i][j-1] + arry[i-1][j];
		}
			
		}
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(arry[k][n]);
		}

	}

}
