package staticex;

public class StaticEx1 {
	public static void main(String[] args) {
		new MyClass();
		new MyClass();
		new MyClass();
		
		new ChildClass();
		new ChildClass();
		new ChildClass();
	}
}

class MyClass {
	static int latestNum = 10; // c�� static�� ����
	int serialNum;
	
	static { // static�� class���� �� ���� ����
		System.out.println("static ����� ����Ǿ����ϴ�");
	}
	
	MyClass() {
		serialNum = ++latestNum;
		System.out.println(serialNum+"�� �����ڰ� ����Ǿ����ϴ�");
	}
}

class ChildClass extends MyClass {
	ChildClass() {
		super(); // �θ�����ڸ� ȣ��
		System.out.println(" �ڽİ�ü �����ڰ� ����Ǿ����ϴ�");
	}
}
