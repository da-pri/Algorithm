package Study;

public class study04 {
	public static void main(String[] args) {
		PhyscData[] x = { 
				new PhyscData("������", 162, 0.3),
				new PhyscData("������", 173, 0.7),
				new PhyscData("���ؼ�", 175, 2.0),
				new PhyscData("������", 171, 1.5),
				new PhyscData("�̼���", 168, 0.4),
				new PhyscData("����", 174, 1.2),
				new PhyscData("Ȳ����", 169, 0.8),
		};

		// ��ü ������ ���
		for (int i = 0; i < x.length; i++)
			System.out.printf("%-6s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

		System.out.printf("\n��� Ű %5.1fcm\n", aveHeight(x));
	}

	private static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for (int i = 0; i < dat.length; i++)
			sum += dat[i].height;

		return sum / dat.length;
	}
}
