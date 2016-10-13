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
	static int latestNum = 10; // c의 static과 동일
	int serialNum;
	
	static { // static은 class에서 한 번만 수행
		System.out.println("static 블록이 수행되었습니다");
	}
	
	MyClass() {
		serialNum = ++latestNum;
		System.out.println(serialNum+"번 생성자가 수행되었습니다");
	}
}

class ChildClass extends MyClass {
	ChildClass() {
		super(); // 부모생성자를 호출
		System.out.println(" 자식객체 생성자가 수행되었습니다");
	}
}
