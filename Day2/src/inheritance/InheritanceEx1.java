package inheritance;

public class InheritanceEx1 {
	public static void main(String[] args) {
		BBB b1 = new BBB();
		AAA a1 = b1;
//		BBB b2 = a1; // needs type casting
		BBB b2 = (BBB)a1; // type casting
	}
}

class AAA {
	AAA() { }
	AAA(int a) { }
	
	public void m1() { }
}

class BBB extends AAA {
	BBB() {
		super(); // 명시적인 부모 생성자 호출. 부모 메소드 사용.
	}
	
	BBB(int a) {
		super(a); // 명시적인 부모 생성자 호출. 부모 메소드 사용
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void m1() {}
}