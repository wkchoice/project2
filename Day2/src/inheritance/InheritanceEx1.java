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
		super(); // ������� �θ� ������ ȣ��. �θ� �޼ҵ� ���.
	}
	
	BBB(int a) {
		super(a); // ������� �θ� ������ ȣ��. �θ� �޼ҵ� ���
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void m1() {}
}