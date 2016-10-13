package singleton;

public class SingletonEx1 {
	public static void main(String[] args) {
		AAA a1 = AAA.getInstance();
		AAA a2 = AAA.getInstance();
		
		System.out.println(a1 == a2);
		
//		AAA a3 = new AAA(); // �ܺο��� ��ü�� �������� ���ϵ��� ����
//		AAA a4 = new AAA();
//		
//		System.out.println(a3 == a4);
	}
}

class AAA {
	private AAA() {} //�ܺο��� ��ü�� �������� ���ϵ��� ����.
	
	private static AAA a = new AAA();
	
	public static AAA getInstance() {
		return a;
	}
}
