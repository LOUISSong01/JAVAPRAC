package �⺻����1_1712;
import java.util.Scanner;

public class �м�ã�� {

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
			
			//���ڰ� 1�� ��츦 ����
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
			
			//�и� 1�� ��츦 ����
			else if(denominator ==1) {
				if((numerator %2) ==0) {
					numerator++;
				}
				else if((numerator %2) ==1) {
				for(int j=0; j<(numerator-1); j++) 
					//���� �� ������ ������
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
