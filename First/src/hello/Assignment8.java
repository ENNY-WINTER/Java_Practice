package hello;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. 음료수 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램을 작성하라. 에스프레소 는 2000원, 아메리카노 2500원,
		 * 카푸치노3000원, 카페라떼 3500원이다. [난이도 중] 커피 주문하세요>>카푸치노 3 9000원입니다. (1) if문을 활용하라.
		 * (2)switch문을 활용하라. 힌트) if문으로 문자열을 비교할 때는 반드시 equals() 메소드를 이용하라. 예를 들면 다음 과
		 * 같다. String coffee; if(coffee.equals(“에스프레소”)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("음료수의 종류와 잔 수를 입력하세요. >>");
		String coffee = sc.next();
		int num = sc.nextInt();

		int cost = 0;
		switch (coffee) {
		case "에스프레소":
			if (coffee.equals("에스프레소"))
			cost = num * 2000;
			
		case "아메리카노":
			if (coffee.equals("아메리카노"))
			cost = num * 2500;
			
		case "카푸치노":
			if (coffee.equals("카푸치노"))
			cost = num * 3000;
			
		case "카페라떼":
			if (coffee.equals("카페라떼"))
			cost = num * 3500;
			
		default:
			break;

		}

		System.out.println(coffee + num + " 잔은 " + cost +"원 입니다." );

	}

}
