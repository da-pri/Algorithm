package Study;

import java.util.Scanner;

public class study05 {
		static int seqSearch(int[] a, int n, int key) {
			int i = 0;
			
			while(true) {
				if(i == n) return -1;
				if(a[i] == key) return i;
				i++;
			}
		}
	public static void main(String[] args) {
		/* 100���� ������ �������� ���� �迭�� �����ϰ� ���⿡�� 5�� �� �迭�� index�� �˻��Ͻÿ�.
		 * ã�� �� ������ ã�� �� ���ٰ� ����Ͻÿ�. */
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[101];
		
		for(int i = 0; i < 100; i++) {
			num[i] = (int)(Math.random()*100);
		}
		int key = 5;
		
		int idx = seqSearch(num, num.length, key);
		
		if(idx == -1)
			System.out.println("�˻� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println("�˻� ���� num[" + idx +"]�� �ֽ��ϴ�.");
	}

}
