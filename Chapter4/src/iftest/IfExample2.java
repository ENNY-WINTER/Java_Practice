package iftest;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tab 키로 들여쓰기 {}중괄호 안에는 반드시 한칸 들여쓰기를 할 것!
		// shift + tab : 반대로 들여쓰기
		// 자동정리기능 Ctrl + Shift + F 
		
		// 입장료 계산 프로그램 만들기
		// 나이를 기준으로 8살 이하는 1000원
		// 14살 이하는 2000원
		// 20살 이하는 2500
		// 그 외는 4000원
		
		// Ctrl + shift + o : 자동 임포트 단축키
		System.out.println("나이를 입력해 주세요 >>");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		int cost = 0;
		if (age <= 8) {
			cost = 1000;
			
		}else if (age <= 14) {
			cost = 2000;
			
		}else if (age <= 20) {
			cost = 2500;
			
		}else {
			cost = 4000;
		}
		
		
		System.out.println( "입장료는 " + cost + "원 입니다." );
		
		
		
		
		
	}

}
