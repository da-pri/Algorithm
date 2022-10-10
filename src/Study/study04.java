package Study;

public class study04 {
	public static void main(String[] args) {
		PhyscData[] x = { 
				new PhyscData("강민하", 162, 0.3),
				new PhyscData("김찬우", 173, 0.7),
				new PhyscData("박준서", 175, 2.0),
				new PhyscData("유서범", 171, 1.5),
				new PhyscData("이수연", 168, 0.4),
				new PhyscData("장경오", 174, 1.2),
				new PhyscData("황지안", 169, 0.8),
		};

		// 신체 데이터 출력
		for (int i = 0; i < x.length; i++)
			System.out.printf("%-6s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

		System.out.printf("\n평균 키 %5.1fcm\n", aveHeight(x));
	}

	private static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for (int i = 0; i < dat.length; i++)
			sum += dat[i].height;

		return sum / dat.length;
	}
}
