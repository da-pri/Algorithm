package CodeUp;

import java.util.*;

public class Q_1382 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 9; i++) { // 열
			for(int j = 2; j <= 5; j++) { // 행
				System.out.printf("%d x %d = %2d\t", j,i,j*i);
			}
			System.out.println();
		}
	}
}


