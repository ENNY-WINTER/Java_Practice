package fortest;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// continue문
		// 반복문을 중간에 끊고 다음 반복문을 시작할 때
		// 반복문 안에서 continue 만나면 나머지 코드를 실행하지 않고 다음 반복을 실행
		// 2의 배수를 제외하고 출력하는 반복문
		/*for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue; //continue를 만나면 증감식으로 넘어가게 됨

			}
			System.out.println(i);
		}
		*/
		//if 연습문제 윤년확인 프로그램 (2월이 29년인 해)
		// 4로 나누어 떨어지는 연도는 윤년입니다.
		//100로 나누어 떨어지는 연도는 윤년이 아닙니다.
		//400으로 나누어 떨어지는 연도는 윤년입니다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력해 주세요. >> ");
		int year = sc.nextInt();
		
			/*if(year % 400== 0 || (year % 4 == 0 &&  year % 100 !=0) ) {
			System.out.println(year + "년은 윤년입니다.");
			
		}else {
			System.out.println(year + "년은 윤년이 아닙니다.");	
			
		}*/
			
		if(year%400==0) {
			System.out.println(year + "년은 윤년입니다.");
		}else if(year%100== 0) {
			System.out.println(year + "년은 윤년이 아닙니다.");	
			
		}else if(year%4 == 0) {
			System.out.println(year + "년은 윤년입니다.");
			
		}else {
			System.out.println(year + "년은 윤년이 아닙니다.");	
			
		}
			
			
	}
	
}

			
	
	
	


