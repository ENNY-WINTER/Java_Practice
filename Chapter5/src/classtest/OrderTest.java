package classtest;

class Order {
//멤버변수: 주문번호, 주문자 아이디 , 주문 날짜 ,주문자 이름, 주문 상품번호 ,배송 주소
	// 201803120001 abc123 2018년3월12일 홍길동 PDO345-12, 서울시 영등포구 여의도동 20번지
	// 기능: 모든 내용을 출력하는 기능 (showOrderInfo)
	String ordernumber;
	String customerID;
	String date;
	String customerName;
	String productNum;
	String address;

	// 생성자 만들기
	public Order() {
	} // 기본생성자 :작성하지 않더라도 실행이 가능(프로그램이 생성될 때 컴퓨터가 생성해주기 때문에 )
	// 생성자 : 인스턴스를 생성할 때 사용하는 메서드
	// 반드시 클래스 이름으로 만들어야 하며 생성자를 작성하면 기본 생성자는 없어지게 됨.
	// 여러개의 생성자 작성 방법(생성자 오버로드)
	// 생성자의 매개변수의 갯수를 다르게 한다.
	// 생성자의 매개변수 자료형을 다르게 한다.(같은 자료형에 매개변수의 이름만 다른것을 만드는 것은 불가능)

	public Order(String ordernumber, String customerID, String date, String customerName, String productNum,
			String address) {
		this.ordernumber = ordernumber;
		this.customerID = customerID;
		this.date = date;
		this.customerName = customerName;
		this.productNum = productNum;
		this.address = address;

	}

	void showOrderInfo() {
		System.out.println("주문 번호: " + ordernumber);
		System.out.println("주문자 아이디: " + customerID);
		System.out.println("주문 날짜: " + date);
		System.out.println("주문자 이름: " + customerName);
		System.out.println("주문 상품번호: " + productNum);
		System.out.println("배송 주소: " + address);
		System.out.println();
	}

	// 여러개의 메서드 작성 방법(메서드 오버로드)
	// 생성자의 매개변수의 갯수를 다르게 한다.
	// 생성자의 매개변수 자료형을 다르게 한다.(같은 자료형에 매개변수의 이름만 다른것을 만드는 것은 불가능)
	int add(int x, int y) {
		return x + y;
	}

	int add(int x) {
		return x + x;
	}

	long add(long x, int y) {
		return x + y;
	}

	long add(int x, int y, int z) {
		return x + y + z;
	}
}
public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//여기에 인스턴스를 만들기 
		Order num1 = new Order();
		
		num1.ordernumber = "201803120001";
		num1.customerID = "abc123";
		num1.date = "2018년 3월 12일";
		num1.customerName = "홍길동";
		num1.productNum = "PDO345-12";
		num1.address = "서울시 영등포구 여의도동 20번지";
		
		
		num1.showOrderInfo();
		
		Order num2 = new Order
				("201803120002", "def123", "2023년 11월 03일", "이순신", "PD7890-54", "부산시 부산진구");

		num2.showOrderInfo();
		//ctrl + 메서드 이름 클릭 : 메서드가 선언되어있는 코드로 이동 
	
		
		
		
	}

}
