package operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// +=, -=, *=, /=, %= :복합 대입 연산자
		int i = 10;
		int j = 20;
		
		System.out.println(i+=j); 
		//i = i+j
		//i에다가 j 를 더해서 i에 저장한다.  
		//밑으로 가면서 i 의 값이 연산에 따라 달라짐. i=30
		System.out.println(i-=j);
		// i = i-j
		// i에다가 j를 빼서 저장한다 i=10
		System.out.println(i*=j);
		//i = i * j
		// i에 j 를 곱해서 저장한다.
		System.out.println(i/=j);
		// i = i / j
		// i에 J를 나누어 저장
		System.out.println(i%=j);
		//i = i % j 
		//i에 j를 나눈 나머지를 저장 
		//10 % 20은 아예 실행이 되지 않고 전의 연산값이 그대로 출력됨
		
		
		
		
		
	}

}
