package Study;

import java.util.Scanner;

public class study02 {

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		for (int i = 0; i < digits / 2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}
		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int no, cd, dno, retry;

		char[] cno = new char[32];

		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
				no = sc.nextInt();
			} while (no < 0);

			do {
				System.out.print("� ������ ��ȯ�ұ��? (2-36): ");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(no, cd, cno);

			System.out.println(cd + "������ ");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");

			System.out.println("�ٽ� �� �� �ұ��? (1... �� / 2... �ƴϿ�)");
			retry = sc.nextInt();
		} while (retry == 1);
	}
}