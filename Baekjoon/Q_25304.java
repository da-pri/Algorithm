package algorithm;

import java.util.Scanner;

public class Q_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int index = sc.nextInt(); // �� �ݾ�
		int cut = sc.nextInt(); // ������ ��
		int sum = 0;
		
		for(int i = 0; i < cut; i++) {
			int a = sc.nextInt(); // �ݾ�
			int b = sc.nextInt(); // ����
			sum += a*b;
		}
		if(index == sum) {
			System.out.println("Yes");
		}
		else System.out.println("No");
		
	}

}
