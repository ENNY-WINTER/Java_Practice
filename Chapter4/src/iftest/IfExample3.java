package iftest;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적에 따라 학점 부여하기
		// 100 ~ 90 : A
		// 89 ~ 80 : B
		// 79 ~ 70 : C
		// 69 ~ 60 : D
		// 그외 : F
		
		
		System.out.println("점수를 입력해 주세요. >>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();// 점수를 입력받을 점수.
			String grade = "A" ; 
	
		if (90 <= score) {
			 grade = "A" ; 
			
		} else if  (80 <= score ) {
			 grade = "B" ; 
			
		} else if (70 <= score) {
			grade = "C" ; 
			
		} else if (60 <= score) {
			grade = "D" ; 
		
		} else {
			grade = "F" ; 
		} 
		
		System.out.println(score == 70);
		System.out.println("학점은" + grade + "입니다.");
		if(grade.equals("F")) {
		 System.out.println("열공이 필요합니다.");
		}
		String f = new String("F");
		 System.out.println(grade == f); //false 가 나오는 경우가 있기 때문에
		System.out.println(grade.equals("F"));// String을 비교할때는 equals()로 입력할것
		
		
		}
	}


