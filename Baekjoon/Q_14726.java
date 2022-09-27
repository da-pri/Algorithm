package Baekjoon;

import java.util.*;

public class Q_14726 {

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int Tcase = sc.nextInt();
		int [] CardNum = new int [16];
		
		int sum = 0;
		
		for(int i = 0; i < Tcase; i++) {
			String str = sc.next();
			for(int j = 0; j < 16; j++) {
				CardNum[j] = str.charAt(j) - '0';
			}
			for(int k = 0; k < 16; k++) {
				if(CardNum[k] % 2 == 0) {
					CardNum[k] *= 2;
					if(CardNum[k] >= 10) {
					int temp = CardNum[k] % 10;
					CardNum[k] /= 10;
					CardNum[k] += temp;
				}
			}
				sum += CardNum[k];
			}
			System.out.println();
			if(sum % 10 == 0) {
				System.out.println("T");
			}else {
				System.out.println("F");
			}
		}
    }
}
