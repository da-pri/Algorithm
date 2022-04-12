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

// �������̵� (1)
	public String toString() {
		return String.format("�ڵ��� �� : %s, �ڵ��� �ӵ� : %d, �ڵ��� ��� : %d", color, speed, gear);
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Carz c1 = new Carz("blue", 100, 1);
		Carz c2 = new Carz("white", 0, 1);
		int n = Carz.getNumberOfCars();
		System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);
// ���� ���̵� (2)
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
