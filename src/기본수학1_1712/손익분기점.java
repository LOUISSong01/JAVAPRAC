package �⺻����1_1712;
import java.util.Scanner;

public class ���ͺб��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		
		if((C-B) <= 0) {
			System.out.println(-1);
		} else {
			System.out.println((A/(C-B)) +1);
		}
		
}
}
