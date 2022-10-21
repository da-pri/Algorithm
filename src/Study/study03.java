package Study;

import java.util.Scanner;

public class study03 {

	public static void main(String[] args) {
		/*
		 * 2에서 1000까지의 소수 나열하기
		 * 2에서 1000까지의 바깥 for문으로 돌기
		 * 안쪽 for문에서 2부터 자신의 수 -1까지 나누어서 떨어지면 소수가 아니다. 
		 */
		method01();	
		method02(); // 홀수만 검사
		method03(); // 자신보다 작은 수 
	}

	private static void method01() {
		int n;
		int count = 0;
		boolean isPrime;

		for (int i = 0; i < 999; i++) {
			n = i + 2;
			isPrime = true;
			for (int j = 0; j < n - 2; j++) {
				count++;
				if (n % (j + 2) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(n+" ");
			}
		}
		System.out.println("\n나눗셈 횟수는 " + count);
	}
	
	private static void method02() {
		int n;
		int count = 0;
		boolean isPrime;
		
		System.out.print(2+" ");
		for (int i = 3; i < 1000; i+=2) {
			isPrime = true;
			for (int j = 0; j < i - 2; j++) {
				count++;
				if (i % (j + 2) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n나눗셈 횟수는 " + count);
	}
	
	private static void method03() {
		int n;
		int i , j;
		int count = 0;
		boolean isPrime;
		int[] prime = new int[500]; // 소수를 저장할 변수
		int ptr = 0; // 저장된 소수의 개수
		
		prime[ptr++] = 2; // 초기에 2를 소수 배열에 넣는다.
		
		for (i = 3; i < 1000; i+=2) {
			isPrime = true;
			for (j = 0; j < ptr; j++) {
				count++;
				if (i % prime[j] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				prime[ptr++] = i;
			}
		}
			for (i = 0; i < ptr; i++) {
				System.out.print(prime[i]+" ");
			}
		System.out.println("\n나눗셈 횟수는 " + count);
		
	}
}
