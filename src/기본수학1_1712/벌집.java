package 기본수학1_1712;

import java.util.Scanner;
public class 벌집 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dis = 2;
		int k =1;
		int h =2;
		
		if(n==1) {
			dis=1;
		}
		
		else {
	    while(true) {
		if(n>(1+6*k)) {
			dis++;
			k +=h;
			h+=1;
		}
		else break;
	}

}
		System.out.println(dis);
}
}
