package Study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class wdb {

	static class PhyscData {
		private String name; // �̸�
		int height; // Ű
		double vision; // �÷�

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}
	}

	static class NameOrderComparator implements Comparator<PhyscData> {
		public int compare(PhyscData d1, PhyscData d2) {
			if (d1.name.equals(d2.name)) {
				return 0;
			} else if (d1.name.charAt(0) > d2.name.charAt(0)) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = {
				new PhyscData("���ż�", 162, 0.3), 
				new PhyscData("���ȣ", 173, 0.7),
				new PhyscData("����ȫ", 171, 1.5), 
				new PhyscData("���ٿ�", 175, 2.0), 
				new PhyscData("������", 168, 0.4), 
				new PhyscData("���ֹ�", 174, 1.2),
				new PhyscData("�Ͽ���", 169, 0.8),
		};

		System.out.print("�̸��� � ����� ã�� �ֳ���?: ");
		String name = sc.next();
		NameOrderComparator name_order = new NameOrderComparator();
		int idx = Arrays.binarySearch(x, new PhyscData(name, 0, 0.0), name_order);

		if (idx < 0) {
			// ���� ã�� ������ ��
			System.out.println(" �� ���� ��Ұ� �����ϴ�.");
		} else { // ���� ã���� ��
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������: " + x[idx]);
		}
	}
}
