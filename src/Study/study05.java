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
		/* 100개의 랜덤한 정수값을 가진 배열을 생성하고 여기에서 5가 들어간 배열의 index를 검색하시오.
		 * 찾을 수 없으면 찾을 수 없다고 출력하시오. */
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[101];
		
		for(int i = 0; i < 100; i++) {
			num[i] = (int)(Math.random()*100);
		}
		int key = 5;
		
		int idx = seqSearch(num, num.length, key);
		
		if(idx == -1)
			System.out.println("검색 값의 요소가 없습니다.");
		else
			System.out.println("검색 값은 num[" + idx +"]에 있습니다.");
	}

}
