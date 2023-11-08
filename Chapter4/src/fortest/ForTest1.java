package fortest;

public class ForTest1 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for (i=0; i<=10; i++) {
			//(초기화식; 조건식; 증감식)
			sum += i; //실행문;
		}
		//System.out.println(sum);
		
		
		//초기화식 생략 : 초기화식을 반드시 위의 다른곳에 적어 두어야함.
		for( ; i<=10; i++) {
			sum += i;	
			
		}
		//조건식 생략 : 반복문 안에서 break문을 이용하여 종료
		for (int j=0; ; j++ ) {
			if(j>10) {
				break;
			}
			sum += j;
			}
		
		
		// 증감식 생략 : 중괄호 안의 실문을 적는 공간에 증감식을 적어 반복문을 완성해야 함.
			for(int k =0; k<=10; ) {
				sum += k;
				k++;
				
			}
			System.out.println(sum);
			
		}
		
	}

