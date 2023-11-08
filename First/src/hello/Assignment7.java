package hello;

import java.util.Scanner;

public class Assignment7 {

	/*
	 * 7. 학점이 A, B이면 “Excellent”, 학점이 C, D이면 “Good”, 학점이 F이면 “Bye”라고 출력하 는 프로그램을
	 * 작성하라. switch와 break를 활용 [난이도 중] 학점을 입력하세요>>B Excellen
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하세요. >>");
		
		
		String mark = sc.next();
		String Value = "";

		switch (mark) {
		case "A": 
			Value = "Excellent";
			break;
		case "B":
			Value = "Excellent";
			break;
		case "C":
			Value = "Good";
			break;
		case "D":
			Value = "Good";
			break;
		case "F":
			Value = "Bye";
			break;
			
		}

		System.out.println("성적 등급은"+ Value + "입니다.");
	}
}
