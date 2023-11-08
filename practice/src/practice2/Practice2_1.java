package practice2;

public class Practice2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요 사용 . (continue
/*
		for (int i = 2; i <= 9; i++) {
			
			
				if (i % 2 == 0) {
					System.out.println(i + "단");
					for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j + "=" + i * j);
					continue;
				}
			}

			System.out.println();
		}
		*/
		for(int i=2; i<=9; i+=2) {
			System.out.println(i + "단");
			
			for(int j=1; j<=9 ; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
				
			}
		
		}
		
		
		
		
	}

}
