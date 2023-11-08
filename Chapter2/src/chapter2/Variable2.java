package chapter2;

public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 자료형 (0,1,2,3,4 같은 정수를 표현)
		byte b = -128; //1바이트 : - 128~ +127까지 표현
		short s = -32768; //2바이트 : -32768 ~ + 32767 
		int i = 3; // 4바이트(Integer) : -2147483648 ~ +2147483647
		long l = 2147483655L; // 8바이트 : -923372036854775808 ~ + 923372036854775807
		
		// Ctrl+ space :자동완성 syso
		/*System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l); */
		
		//문자 자료형 Character
		char c = 65; // 한 글자만 표시하는 자료형 char(character) 실제로는 숫자로 이루어져 있다(아스키코드)
		System.out.println(c);
		char k = '가'+1 ; //한글 변환
		System.out.println(k);
		
		// 여러 글자를 표시하는 자료형 String (Class 자료형임. 기본 자료형 X )
		String str = "String자료형은 문자열을 저장합니다."; // String은 반드시 첫자가 대문자!
		System.out.println(str);
		
		//실수 자료형
		float f = 0F; // 4 바이트 자료형
		double d = 1; // 8 바이트 자료형
		System.out.println(f);
		System.out.println(d);
		
		for (int i2 =0; i2<10000; i2++) {
			d = d + 0.1;
					
		}
		
		System.out.println(d);
		
		
		// 논리 자료형 불린
		boolean bo = false; // 논리 자료형 불린 : true(참), false(거짓) 저장 가능
		System.out.println(bo);
		
		// var 자료형 들어가는 타입에 따라서 값을 바꿔준다 자동으로 자료형을 설정가능
		// 한번 선언된 자료형은 고정된다. 사용을 권장하지 않음!
		
		var v1 = 10;
		var v2 = 10.2;
		var v3 = 'a';
		var v4 = true;
		var v5 = 1.12f;
		var v6 = 100012345654L;
		var v7 = "string 자료형";
		v3 = 65;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		
	

		
	}

	
}







