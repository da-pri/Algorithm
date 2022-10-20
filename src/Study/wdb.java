package Study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class wdb {

	static class PhyscData {
		private String name; // 이름
		int height; // 키
		double vision; // 시력

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}
	}

	static class NameOrderComparator implements Comparator<PhyscData> {
		public int compare(PhyscData d1, PhyscData d2) {
			if (d1.name.equals(d2.name)) {
				return 0;
			} else if (d1.name.charAt(0) > d2.name.charAt(0)) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = {
				new PhyscData("강신성", 162, 0.3), 
				new PhyscData("고건호", 173, 0.7),
				new PhyscData("박준홍", 171, 1.5), 
				new PhyscData("유다연", 175, 2.0), 
				new PhyscData("조현주", 168, 0.4), 
				new PhyscData("진솔미", 174, 1.2),
				new PhyscData("하영수", 169, 0.8),
		};

		System.out.print("이름이 어떤 사람을 찾고 있나요?: ");
		String name = sc.next();
		NameOrderComparator name_order = new NameOrderComparator();
		int idx = Arrays.binarySearch(x, new PhyscData(name, 0, 0.0), name_order);

		if (idx < 0) {
			// 값을 찾지 못했을 때
			System.out.println(" 그 값의 요소가 없습니다.");
		} else { // 값을 찾았을 때
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터: " + x[idx]);
		}
	}
}