package _2022_05_24;

import java.util.Arrays;
import java.util.Scanner;

public class YDY_Q2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int avg = 0, sum = 0;
		int center = 0;
		
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
			
		}
		Arrays.sort(num);
		avg = sum / 5;
		center = num[3];
		
		System.out.println(avg);
		System.out.println(center);

	}
}

/*
 * 2022-05-24
 * 문제 이해도 : 5
 * 문제 해결 : O
 * 코딩 시간 : 5분
 */