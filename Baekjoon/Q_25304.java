package algorithm;

import java.util.Scanner;

public class Q_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int index = sc.nextInt(); // 총 금액
		int cut = sc.nextInt(); // 종류의 수
		int sum = 0;
		
		for(int i = 0; i < cut; i++) {
			int a = sc.nextInt(); // 금액
			int b = sc.nextInt(); // 개수
			sum += a*b;
		}
		if(index == sum) {
			System.out.println("Yes");
		}
		else System.out.println("No");
		
	}

}
