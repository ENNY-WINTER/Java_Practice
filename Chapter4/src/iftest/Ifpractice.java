package iftest;

public class Ifpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int m = 2000;
		int i = 10;
		int j = 11;
		
		if (m > 4000) {
			
			String str = "택시를 타고 가라";
			System.out.println(str);
			
		}else if(m == 4000){
			String str = "버스를 타라";
				System.out.println(str);
		}else {
			String str = "걸어가라";
			System.out.println(str);
		}
		
	
		System.out.println("귀가 안내는 종료되었습니다.");
		
		
		
		if (i > 10) {
			System.out.println("i는 10보다 크다");
		}
		if (j > 10) {
			System.out.println("j는 10보다 크다");
		}
		if (i < j) {
			String str = "i는 보다 작습니다.";
			System.out.println(str);
		
		}
		
		
		
	}

}
