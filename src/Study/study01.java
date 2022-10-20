package Study;

import java.util.Arrays;
import java.util.Random;

public class study01 {
	public static void main(String[] args) {

		Random rand = new Random();
		int a[] = new int[5];
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("\n" + maxOf(a));
		revers(a);

		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println("하는 과정");
		revers1(a);
		System.out.println();
		System.out.println("합계 과정");
		System.out.println(sumOf(a));
		System.out.println();
		System.out.println("카피 과정");
		copy(a, b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println();
		System.out.println("역순 과정");
		rcopy(a, b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println();

	}

	static int maxOf(int a[]) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	static void revers(int a[]) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	static void revers1(int a[]) {
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println(Arrays.toString(a));
			swap(a, i, a.length - i - 1);
		}
		System.out.println(Arrays.toString(a));
	}

	static void swap(int a[], int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int sumOf(int a[]) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	static void copy(int a[], int b[]) {
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
	}

	static void rcopy(int a[], int b[]) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
			swap(b, i, b.length - i - 1);
		}
	}
}