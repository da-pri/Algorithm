package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[31];
		
		for(int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			
			list[num] = 1;
		}
		for(int i = 1; i < 30; i++) {
			if(list[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
