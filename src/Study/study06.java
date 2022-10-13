package Study;

import java.util.Random;

public class study06 {

	static int binarySearch(int[] a, int n, int key) {
		// pl : 왼쪽 위치, pr : 오른쪽 위치, pc : 중간 위치
		int pl, pr, pc;
		pl = 0;
		pr = n - 1;
		do {
			pc = (pl + pr) / 2;

			System.out.print("   |");
			if (pl != pc) {
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			} else {
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			}

			if (pc != pr) {
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			} else {
				System.out.println("->");
			}
			System.out.println("");

			System.out.printf("%3d|", pc);
			for (int k = 0; k < n; k++) {
				System.out.printf("%4d", a[k]);
			}
			System.out.println("\n   |");
			if (a[pc] == key) {
				return pc;
			} else if (a[pc] < key) { // 검색범위가 오른쪽으로 변경
				pl = pc + 1;
			} else { // 검색범위가 왼쪽으로 변경
				pr = pc - 1;
			}
		} while (pl <= pr);

		return -1;
	}

	public static void main(String[] args) {

		int num = 10;
		int[] array = new int[num + 1];
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			array[i] = random.nextInt(10);
			System.out.print("a[" + i + "]=" + array[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}
		}
		System.out.println();
		int idx = Search.seqSearch(array, num, 5);
		if (idx < 0) {
			System.out.print("값이 없어요");
		} else {
			System.out.print("값이 " + idx + "번째 있어요");
		}
		System.out.println("\n 버블 정렬");
		Search.bubbleSort(array, num);
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]=" + array[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}

		}
		System.out.println("\n 이진 검색");
		for (int i = 0; i < num; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();

		idx = binarySearch(array, num, 5);
		if (idx < 0) {
			System.out.print("값이 없어요");
		} else {
			System.out.print("값이 " + idx + "번째 있어요");
		}

	}

}