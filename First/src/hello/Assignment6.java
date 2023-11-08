package hello;

import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원 짜리 동전, 1원짜리 동전 각 몇 개로
		 * 변환되는지 출력하라. 힌트 참조.
		 *  [난이도 중] 돈의 액수를 입력하세요>>65245 오만원1개, 만원1개, 천원5개, 500원0개,
		 * 100원2개, 10원4개, 1원5개 
		 * 힌트)정수 n의 값이 36이라고 할 때 정수 3과 6을 분리하는 방법은 다음 코드를 참고하 라.
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하세요. >>");
		int n = sc.nextInt();
		
		
		int oManwon = n / 50000;
		int manwon = (n - 50000*oManwon)/10000;
		int cheonwon = (n - 50000*oManwon - 10000*manwon)/1000;
		int obaekwon = (n - 50000*oManwon - 10000*manwon - 1000*cheonwon)/500;
		int baekwon = (n - 50000*oManwon - 10000*manwon - 1000*cheonwon - 500*obaekwon)/100;
		int shipwon = (n - 50000*oManwon - 10000*manwon - 1000*cheonwon - 500*obaekwon - 100*baekwon)/10;
		int ilwon = (n - 50000*oManwon - 10000*manwon - 1000*cheonwon - 500*obaekwon - 100*baekwon- 10*shipwon )%10;
		
		
		System.out.println("50,000원권: " + oManwon +"개");
		System.out.println("10,000원권: " + manwon +"개");
		System.out.println("1,000원권: " + cheonwon +"개");
		System.out.println("500원: " + obaekwon +"개");
		System.out.println("100원: " + baekwon +"개");
		System.out.println("10원: " + shipwon +"개");
		System.out.println("1원: " + ilwon +"개");

		
		/*
		int first = n / 10; // 10으로 나눈 몫 = 3
		int second = n % 10; // 10으로 나눈 나머지 = 6
		int third = n / 100;
		int fourth = n / 500; //
		int fifth = n / 1000; //천원권
		int sixth = (n % 50000)/10000; //만원권
		int seventh = n / 50000; // 5만원권
		
		System.out.println(seventh);
		
		if (seventh >= 1 ) {
			System.out.println("오만원권" + seventh + "장 ");
		if (sixth >= 6 ) 
			System.out.println("만원권" + (sixth - 5) + "장 ");
		if (fifth >= 1 )
			System.out.println("천원권" + fifth+ "장 ");
		if (fourth >= 1 )
			System.out.println("500원" + fourth + "개 ");
		if (third >= 6 )
			System.out.println("100원" + (third - 5) + "개 ");
		if (second >= 1)
			System.out.println("10원" + second + "개 ");
		if (first >=1)
			System.out.println("1원" + second + "개 ");
		}else {
			System.out.println("오류입니다.");
		
		}
		
		/*
		num = money/50000;
        money%=50000;
        if(num>0)   System.out.println("오만원권 "+num+"매");

        num = money/10000;
        money%=10000;
        if(num>0)   System.out.println("만원권 "+num+"매");

        num = money/5000;
        money%=5000;
        if(num>0)   System.out.println("오천원권 "+num+"매");

        num = money/1000;
        money%=10000;
        if(num>0)   System.out.println("천원권 "+num+"매");

        num = money/500;
        money%=500;
        if(num>0)   System.out.println("오백원 "+num+"개");

        num = money/100;
        money%=100;
        if(num>0)   System.out.println("백원 "+num+"개");

        num = money/50;
        money%=50;
        if(num>0)   System.out.println("오십원 "+num+"개");

        num = money/10;
        money%=10;
        if(num>0)   System.out.println("십원 "+num+"개");

        num = money;
        if(num>0)   System.out.println("일원 "+num+"개");

		*/
		
	}
}
