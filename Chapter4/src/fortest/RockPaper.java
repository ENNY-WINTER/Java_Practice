package fortest;

import java.util.Scanner;

public class RockPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보 게임 만들기
		// 가위 :1, 바위 :2 , 보:3

		Scanner sc = new Scanner(System.in);
		System.out.println("가위 :1, 바위 :2 , 보:3 중에 하나를 선택해 주세요.>>");
		int player = sc.nextInt();
		int computer = (int)(Math.random() * 3) + 1;
		
		 if(player==1 && computer== 1) {
			System.out.println("비겼습니다.");
			}else if(player==1 && computer== 2) {
			System.out.println("컴퓨터가 이겼습니다.");
			}else if(player==1 && computer== 3) {
				System.out.println("컴퓨터가 이겼습니다.");
				
			}else if(player==2 && computer== 1) {
				System.out.println("플레이어가 이겼습니다.");
			}else if(player==2 && computer== 3) {	
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(player==3 && computer== 1) {
				System.out.println("플레이어가 이겼습니다.");
			}else if(player==3 && computer== 2) {
				System.out.println("플레이어가 이겼습니다.");
			}else
				System.out.println("비겼습니다.");
				
				
			}
	
	 	
		

	}


