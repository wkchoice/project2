package polymorphisim;

public class Consumer {
	public static void main(String[] args) {
		�鿭�� b1 = new �鿭��();
		���ĵ� s1 = new ���ĵ�();
		
		
		s1.install(b1);
		
		s1.turnOn();
		s1.turnOff();
		
		������ b2 = new ������();
		s1.install(b2); // ����� ��ġ ������.
		
		s1.turnOn();
		s1.turnOff();
	}
}
