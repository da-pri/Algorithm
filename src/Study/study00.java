package Study;

import java.util.Scanner;

public class study00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// n 입력을 받는다.
		System.out.print("n을 입력해 주세요 : ");
		int n = sc.nextInt();

		System.out.println("직각삼각형");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  *");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("거꾸로 직각삼각형");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  *");
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("길어진 직각삼각형");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  *");
			for (int j = 0; j < i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("거꾸로 길어진 직각삼각형");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  *");
			for (int j = 0; j < (n - i - 1) * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("정삼각형");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  ");
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("거꾸로 정삼각형");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  ");
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * (n - i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("마름모");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  ");
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print(i + n + "  ");
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * n - 3 - (2 * i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("마름모 두 개");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  ");
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2) + 1; k++) {
				System.out.print("*");
			}
			for (int j = 0; j < (n - i - 1) * 2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print(i + n + "  ");
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * n - 3 - (2 * i); k++) {
				System.out.print("*");
			}
			for (int j = 0; j < (i + 1) * 2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * n - 3 - (2 * i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}