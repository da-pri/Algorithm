package Study;

import java.util.Random;

class Search {
	// ���� ����
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
				}
			}
		}
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// �迭���� ���� �˻�
	// a : ã���� �ϴ� �迭, n : �迭�� ��Ҽ�, key : ã���� �ϴ� ��
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
//		while (true) {
//			if (i == n) {
//				return -1;
//			}
//			if (a[i] == key) {
//				return i;
//			}
//			i++;
//		}
		a[n] = key; // 1. �迭�� �� �������� ã������ ���� ����

		while (true) {
			if (a[i] == key) {
				break; // ������ �ݺ� ������ ���������� ���
			}
			i++;
		}

		if (i == n) {
			return -1;
		}

		return i;
	}

	static int binarySearch(int[] a, int n, int key) {
		// pl : ���� ��ġ, pr : ������ ��ġ, pc : �߰� ��ġ
		int pl, pr, pc;
		pl = 0;
		pr = n - 1;
		do {
			pc = (pl + pr) / 2;
			if (a[pc] == key) {
				return pc;
			} else if (a[pc] < key) { // �˻������� ���������� ����
				pl = pc + 1;
			} else { // �˻������� �������� ����
				pr = pc - 1;
			}
		} while (pl <= pr);

		return -1;

	}
}

public class Search00 {

	public static void main(String[] args) {
		// 100���� ������ ������( 0���� 100������ ����)�� ���� �迭�� �����ϰ�
		// ���⿡�� 5�� ��� �ִ� �迭�� �ε����� �˻��Ͻÿ�.
		// ��ã���� ��ã�Ҵٰ� ����Ͻÿ�.
		int i;
		int num = 100;
		int[] array = new int[num + 1];
		Random random = new Random();
		for (i = 0; i < num; i++) {
			array[i] = random.nextInt(101);
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
			System.out.print("���� �����");
		} else {
			System.out.print("���� " + idx + "��° �־��");
		}
		System.out.println("\n ���� ����");
		Search.bubbleSort(array, num);
		for (i = 0; i < num; i++) {
			System.out.print("a[" + i + "]=" + array[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}

		}
		System.out.println("\n ���� �˻�");
		idx = Search.binarySearch(array, num, 5);
		if (idx < 0) {
			System.out.print("���� �����");
		} else {
			System.out.print("���� " + idx + "��° �־��");
		}

	}

}