package 기본수학1_1712;

import java.util.Scanner;

public class 분수찾기_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int cross_count = 1, prev_count_sum =0;
		
		while(true) {
			if (X <= prev_count_sum + cross_count) {	
			//직전 대각선 누적 합 + 해당 대각선 개수 이용한 범위 판별
			if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
				// 분모가 큰 수부터 시작
				// 분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1) 
				// 분자는 X 번째 - 직전 대각선까지의 누적합 
				System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + 
				(X - prev_count_sum));
				break;
			} 
			else {	// 대각선의 개수가 짝수라면 
				// 홀수일 때의 출력을 반대로 
				System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
				break;
			}
		}
			
			 else {
					prev_count_sum += cross_count;
					cross_count++;
		
		
		

	}

}
	}
}
