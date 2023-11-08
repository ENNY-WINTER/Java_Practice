package fortest;

public class Gugudan {

	public static void main(String[] args) {
		//for 문을 이용하여 구구단 출력하기
		//2단에서 9단까지 

		
		for (int i =2; i <=9; i++) {
			System.out.println(i+"단");
			
			for (int j =1; j <=9; j++) {
				//System.out.println("j="+j);
				System.out.println(i+"*"+j+"="+ i*j );
			}
			
			System.out.println();
			
		
			}
		
		
		}
		
	}

