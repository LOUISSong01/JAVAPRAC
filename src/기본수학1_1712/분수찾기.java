package 기본수학1_1712;
import java.util.Scanner;

public class 분수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int numerator = 1;
		int denominator = 1;
		String [] arry = new String [X];
		int [] num = new int[X];
		int [] den = new int[X];
		
		for(int i=0; i<X; i++) {
		
			arry[i] = (numerator+ "/" + denominator);
			
			if(i==0) {
				denominator++;
			}
			
			//분자가 1일 경우를 정리
			else if(numerator ==1) {
				if((denominator %2) ==0) {
				for(int j=0; j<(denominator -1); j++) {
					numerator++;
					denominator--;
				}
				}
				else if ((denominator %2) ==1) {
					denominator++;
				}
			}
			
			//분모가 1일 경우를 정리
			else if(denominator ==1) {
				if((numerator %2) ==0) {
					numerator++;
				}
				else if((numerator %2) ==1) {
				for(int j=0; j<(numerator-1); j++) 
					//지금 이 루프에 갇혔어
					numerator--;
					denominator++;
				}
			}
			
		}
		
		for(int i=0; i<10; i++) {
		System.out.println(arry[i]);

	}

}
}
