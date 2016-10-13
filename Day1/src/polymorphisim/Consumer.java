package polymorphisim;

public class Consumer {
	public static void main(String[] args) {
		백열등 b1 = new 백열등();
		스탠드 s1 = new 스탠드();
		
		
		s1.install(b1);
		
		s1.turnOn();
		s1.turnOff();
		
		형광등 b2 = new 형광등();
		s1.install(b2); // 형광등도 설치 가능함.
		
		s1.turnOn();
		s1.turnOff();
	}
}
