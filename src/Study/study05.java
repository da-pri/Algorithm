package Study;

import java.util.Random;
import java.util.Scanner;

public class study05 {
	private static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[count++] = i;
			}	
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 100;
		int[] array = new int[num + 1];
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			array[i] = random.nextInt(101);
			System.out.print("a[" + i + "]=" + array[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}
		}
		System.out.println();
		
		int[] idx = new int[num];
		
		System.out.println("�˻� ��: ");
		int ky = sc.nextInt();

		int count = searchIdx(array, array.length-1, ky, idx);
		System.out.println("�˻� ����: "+count+"���Դϴ�.");
		
		if(count == 0) {
			System.out.println("�� ���� ��Ҵ� �������� �ʽ��ϴ�.");
		}
		else {
			for(int i = 0; i < count; i++)
				System.out.println("�� ����"+"x["+idx[i]+"]�� �ֽ��ϴ�.");
		}
	}

}
