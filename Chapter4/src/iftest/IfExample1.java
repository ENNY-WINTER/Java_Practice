package iftest;

public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tab 키로 들여쓰기 {}중괄호 안에는 반드시 한칸 들여쓰기를 할 것!
		// shift + tab : 반대로 들여쓰기
		// 자동정리기능 Ctrl + Shift + F
		/*
		 * if(조건식: 출력값으로 true , false가 출력되는 내용) { 실행문(System.out.println();) }
		 */
		/*
		 * }else{ 실행문 } if문이 실행되지 않으면 else문이 나온다.
		 */
		// false 일때는 출력값이 아무것도 안나온다.

		int i = 1;
		int j = 1;
		if (i < j) {
			String str = "i는 j보다 작습니다.";
			System.out.println(str);
		} else if (i > j) {
			String str = "i는 j보다 큽니다.";
			System.out.println(str); // 여기서 실행이 되면 다음 else는 실행되지 않는다.
		} else if (i > j) {
			String str = "i는 j보다 큽니다.";
			System.out.println(str);
		} else if (i > j) {
			String str = "i는 j보다 큽니다.";
			System.out.println(str);
		} else if (i > j) {
			String str = "i는 j보다 큽니다.";
			System.out.println(str);
		} else {
			String str = "i와  j는 같습니다.";
			System.out.println(str);
		}
		System.out.println("프로그램이 종료 되었습니다.");
		// 반드시 if문으로 시작해서 else/ else if를 생성가능. else if는 여러개 생성 가능 else if문이 여러개가 있어도 if나
		// else가 한번 실행되면 다음은 실행되지 않음.
		// else문을 적으면 if/else문은 종료된다.
	}

}
