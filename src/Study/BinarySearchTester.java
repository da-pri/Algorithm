package Study;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num]; // ��ڼ��� num�� �迭
		System.out.println("������������ �Է��ϼ���.");
		System.out.print("x[0]: "); // �迭�� ù ��Ҹ�
		x[0] = sc.nextInt(); // ���� �Է¹���
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]); // �ٷ� ���� ��Һ���
		} // ������ �ٽ� �Է¹���
		System.out.print("�˻� �� : "); // Ű���� �Է¹���
		int ky = sc.nextInt();
		// �迭 x���� ���� ky�� ��Ҹ� �˻�
		int idx = Arrays.binarySearch(x, ky);
		if (idx < 0) {
			System.out.println("�˻� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println("�˻� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		}

	}
}