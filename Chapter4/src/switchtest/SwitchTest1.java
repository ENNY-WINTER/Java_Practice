package switchtest;

public class SwitchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*switch (변수) {
		case  변수와 비교하고 싶은 값:
			 실행문;
			 break; //1번이 실행되고 break가 없으면 계속 실행된다.
		case  변수와 비교하고 싶은 값:
			 실행문;
			 break;
		default :
			실행문;
			break; 			
		}*/
		int ranking = 1;
		char medalColor;
		switch(ranking) { //괄호 안의 값(ranking) 과 case값을 비교
			case 1 : 
				medalColor = 'G';
				break;
			case 2 : 
				medalColor = 'S';
				break;
			case 3 : 
				medalColor = 'B';
				break;
			default :
				medalColor = 'A';
				break; //break가 없으면 계속 실행되다가 default의 값이 나온다.
		}
		System.out.println(ranking + "등의 메달 색은" + medalColor + "입니다.");

	}

}
