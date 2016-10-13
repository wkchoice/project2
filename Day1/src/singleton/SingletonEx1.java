package singleton;

public class SingletonEx1 {
	public static void main(String[] args) {
		AAA a1 = AAA.getInstance();
		AAA a2 = AAA.getInstance();
		
		System.out.println(a1 == a2);
		
//		AAA a3 = new AAA(); // 외부에서 객체를 생성하지 못하도록 제한
//		AAA a4 = new AAA();
//		
//		System.out.println(a3 == a4);
	}
}

class AAA {
	private AAA() {} //외부에서 객체를 생성하지 못하도록 제한.
	
	private static AAA a = new AAA();
	
	public static AAA getInstance() {
		return a;
	}
}
