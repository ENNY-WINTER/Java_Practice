package switchtest;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5층 건물의 층수를 받아 어떤층인지 알려주는 프로그램
		// 1층 : 약국, 2층 : 정형외과, 3층 : 피부과, 4층 : 치과 , 5층 : 헬스 클럽
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("층 수 입력>>");
		int floor = sc.nextInt();
		
		switch(floor) {
		case 1 :
			System.out.println(floor + " 층은 약국 입니다.");
			break;
		case 2 :
			System.out.println(floor + " 층은 정형외과 입니다.");
			break;
		case 3 :
			System.out.println(floor + " 층은 피부과 입니다.");
			break;
		case 4 :
			System.out.println(floor + " 층은 치과 입니다.");
			break;
		case 5 :
			System.out.println(floor + " 층은 헬스 클럽 입니다.");
			break;
		default :
			System.out.println("오류입니다.");
		break;
		
		}
	----------------------------------------------------------------------------------------*/
		Scanner sc = new Scanner(System.in);
		System.out.println("층 수를 입력 하세요.>>");
		int floor = sc.nextInt();
		String floorName = "" ;
		
		switch(floor) {
		case 1 :
			floorName = "약국";
			break;
		case 2 :
			floorName = "정형외과";
			break;
		case 3 :
			floorName = "피부과";
			break;
		case 4 :
			floorName = "치과";
			break;
		case 5 :
			floorName = "헬스클럽";
			break;
		default :
			floorName = "없는 층";
			break;
			
		}
			
		System.out.println(floor + "층은 " + floorName + "입니다.");
		
	
		
		
		
				
}
}
