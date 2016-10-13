package polymorphisim; // 다형성

//public class 백열등 extends 전구 {
public class 백열등 implements 전구 {
	public void lightOn() {
		System.out.println("백열등이 켜집니다.");
	}
	
	public void lightOff() {
		System.out.println("백열등이 꺼집니다.");
	}
}
