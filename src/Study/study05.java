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
		
		System.out.println("검색 값: ");
		int ky = sc.nextInt();

		int count = searchIdx(array, array.length-1, ky, idx);
		System.out.println("검색 개수: "+count+"개입니다.");
		
		if(count == 0) {
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		}
		else {
			for(int i = 0; i < count; i++)
				System.out.println("그 값은"+"x["+idx[i]+"]에 있습니다.");
		}
	}

}
