package polymorphisim;

//public class 전구 {
//	public void lightOn() {
//		System.out.println("전구가 켜집니다.");
//	}
//	
//	public void lightOff() {
//		System.out.println("전구가 꺼집니다.");
//	}

// 부모class에서 미완성 class와 method로 선언만하고, 자식 class에서 재정의해서 사용함.
//public abstract class 전구 {
//	public abstract void lightOn();
//	
//	public abstract void lightOff();
//	
//}

// 자바 interface는 약속이다. class(객체)가 할 수 있는것을 정의한 것이다.
public interface 전구 { // 자식class에서 extends 대신 implements로 변경함.
	
	public void lightOn();
	public void lightOff();
	
}

public interface handLight {
	public void handOn();
	public void HandOff();
}