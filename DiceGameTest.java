package Object;

import java.util.*;

class DiceGame {
	int diceFace;
	int userGuess;
	int userScore = 0;
	int userLife = 5;

	// �ֻ��� ������
	private void RollDice() {
		diceFace = (int) (Math.random() * 6) + 1;
	}

	// �ֻ��� �� Ȯ��
	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	// �ֻ��� �� Ȯ���ϱ�
	private void checkUserGuess() {
			if (diceFace == userGuess) {
				userScore += 10;
				System.out.printf("�¾ҽ��ϴ�. 10�� �߰�, ���� ������ %d�� ", userScore);
			}
			else {
				userLife -= 1;
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ 1�� ����, ���� ������ %d�� ", userLife);
			}
		System.out.println("�ֻ��� ���� " + diceFace + "�Դϴ�.");
		System.out.println("");
	}

	public void startPlaying() {
		for( ; ; ) {
			userGuess = getUserInput("������ �Է��Ͻÿ�: ");
			RollDice();
			checkUserGuess();
			if(userLife == 0) {
				System.out.println("���� ����, ������ "+userScore+"��");
				break;
			}
		}
	}
}

public class DiceGameTest {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.startPlaying();
	}
}