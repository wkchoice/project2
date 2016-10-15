package polymorphisim;

public class Consumer {
	public static void main(String[] args) {
		�鿭�� b1 = new �鿭��();
		���ĵ� s1 = new ���ĵ�();
		handLight h1 = new handLight() {
			
			@Override
			public void handOn() {
				System.out.println("Turn On Hand Light");
			}
			
			@Override
			public void HandOff() {
				System.out.println("Turn Off Hand Light");
			}
		};
		
		s1.install(b1);
		
		s1.turnOn();
		s1.turnOff();
		
		������ b2 = new ������();
		s1.install(b2); // ����� ��ġ ������.
		
		s1.turnOn();
		s1.turnOff();
		
		h1.handOn();
		h1.HandOff();
	}
}
