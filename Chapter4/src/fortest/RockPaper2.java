package fortest;

import java.util.Scanner;

public class RockPaper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보 게임 만들기
		// 가위 :1, 바위 :2 , 보:3

		Scanner sc = new Scanner(System.in);
		System.out.println("가위 :1, 바위 :2 , 보:3 중에 하나를 선택해 주세요.>>");
		int player = sc.nextInt();
		int computer = (int) (Math.random() * 3) + 1;

		if (player > computer) {
			System.out.println("플레이어가 이겼습니다.");
			
		} else if (computer > player) {
			System.out.println("컴퓨터가 이겼습니다.");

		} else {
			System.out.println("비겼습니다.");
	
		System.out.println("컴퓨터는 "+ computer +"을(를) 냈습니다.");
	
	}
	}
	
}
