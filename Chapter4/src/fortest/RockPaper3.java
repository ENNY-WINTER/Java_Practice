package fortest;

import java.util.Scanner;

public class RockPaper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보 게임 만들기
		// 가위 :1, 바위 :2 , 보:3

		Scanner sc = new Scanner(System.in);
		System.out.println("가위 :1, 바위 :2 , 보:3 중에 하나를 선택해 주세요.>>");
		int player = sc.nextInt();
		int computer = (int) (Math.random() * 3) + 1;

		if (player == computer) {
			System.out.println("비겼습니다.");

		} else if (player == 1 && computer == 3 || player == 2 && computer == 1 || player == 3 && computer == 2) {
			System.out.println(" 이겼습니다.");

		} else {
			System.out.println("졌습니다.");

			System.out.println("컴퓨터는 " + computer + "을(를) 냈습니다.");

		}
		int result = player - computer;
		if (result == 0) {
			System.out.println("비겼습니다.");
		} else if (result == -2 || result == 1) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}
	}
}
