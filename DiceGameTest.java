package Object;

import java.util.*;

class DiceGame {
	int diceFace;
	int userGuess;
	int userScore = 0;
	int userLife = 5;

	// 주사위 굴리기
	private void RollDice() {
		diceFace = (int) (Math.random() * 6) + 1;
	}

	// 주사위 눈 확인
	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	// 주사위 눈 확인하기
	private void checkUserGuess() {
			if (diceFace == userGuess) {
				userScore += 10;
				System.out.printf("맞았습니다. 10점 추가, 현재 점수는 %d점 ", userScore);
			}
			else {
				userLife -= 1;
				System.out.printf("틀렸습니다. 생명이 1개 감소, 현재 생명은 %d개 ", userLife);
			}
		System.out.println("주사위 값은 " + diceFace + "입니다.");
		System.out.println("");
	}

	public void startPlaying() {
		for( ; ; ) {
			userGuess = getUserInput("예상값을 입력하시오: ");
			RollDice();
			checkUserGuess();
			if(userLife == 0) {
				System.out.println("게임 종료, 점수는 "+userScore+"점");
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