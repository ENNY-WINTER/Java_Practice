package classtest;

public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//새로운 객체를 만들때마다 new로(new person)으로 인스턴스 생성 kim,ahn,lee들이 인스턴스임 
		Person kim = new Person();
		kim.name = "김유신";
		Person lee = new Person();
		lee.name = "이순신";
		Person ahn = new Person();
		lee.name = "안연수";
		Person song = new Person();
		lee.name = "송치원";
		kim.showPersonInfo();
		lee.showPersonInfo();
		ahn.showPersonInfo();
		song.showPersonInfo();
		Person lim = new Person("임꺽정", 180, 80, 'M' , true);
		lim.showPersonInfo();
		//생성자를 이용해서 간단하게 입력하는게 좋음
		
		//Scanner sc = new Scanner(System.in);
		
		


	}

}
