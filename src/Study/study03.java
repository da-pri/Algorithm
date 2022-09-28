package Study;

import java.util.Scanner;

public class study03 {

	public static void main(String[] args) {
		/*
		 * 2���� 1000������ �Ҽ� �����ϱ�
		 * 2���� 1000������ �ٱ� for������ ����
		 * ���� for������ 2���� �ڽ��� �� -1���� ����� �������� �Ҽ��� �ƴϴ�.
		 */
		method01();	
		method02(); // Ȧ���� �˻�
		method03(); // �ڽź��� ���� �� 
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
		System.out.println("\n������ Ƚ���� " + count);
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
		System.out.println("\n������ Ƚ���� " + count);
	}
	
	private static void method03() {
		int n;
		int i , j;
		int count = 0;
		boolean isPrime;
		int[] prime = new int[500]; // �Ҽ��� ������ ����
		int ptr = 0;				// ����� �Ҽ��� ����
		
		prime[ptr++] = 2; // �ʱ⿡ 2�� �Ҽ� �迭�� �ִ´�.
		
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
		System.out.println("\n������ Ƚ���� " + count);
		
	}
}
