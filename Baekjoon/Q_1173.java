package _2022_05_07;

import java.util.*;

public class Q_1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt(), min = sc.nextInt();

		if (min < 30) {
			if (hour == 0) {
				hour = 24;
			}
			hour -= 1;
			min = 30 + min;
		}
		else {
			min -= 30;
		}

		System.out.println(hour + " " + min);

	}

}