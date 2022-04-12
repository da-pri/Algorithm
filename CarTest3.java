package Object;

import java.util.*;

class Carz {
	private String color;
	private int speed;
	private int gear;

	private int id;

	private static int numberOfCars = 0;

	public Carz(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;

		id = ++numberOfCars;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

// 오버라이딩 (1)
	public String toString() {
		return String.format("자동차 색 : %s, 자동차 속도 : %d, 자동차 기어 : %d", color, speed, gear);
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Carz c1 = new Carz("blue", 100, 1);
		Carz c2 = new Carz("white", 0, 1);
		int n = Carz.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " + n);
// 오버 라이딩 (2)
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
