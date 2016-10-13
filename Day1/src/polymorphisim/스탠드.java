package polymorphisim; // 다형성

public class 스탠드 {
	private 전구 bulb; // 백열등 bulb --> 전구 bulb
	
	public void install(전구 bulb) { // 백열등 bulb --> 전구 bulb
		this.bulb = bulb;
	}
	
	public void turnOn() {
		if (bulb != null)
		    bulb.lightOn();
		else
			System.out.println("먼저 설치 하세요(on)");
	}
	
	public void turnOff() {
		if (bulb != null)
		    bulb.lightOff();
		else
			System.out.println("먼저 설치 하세요(off)");
	}
}
