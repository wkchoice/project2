package polymorphisim;

//public class 형광등 extends 전구 {
public class 형광등 implements 전구 {
	@Override // 부모 method 재정의(부모가 미완성이므로)
	public void lightOn() {
		System.out.println("형광등이 깜빡거리며 켜집니다.");
	}
	
	@Override // 부모 메소드 재정의해서 자식 클래스에서 사용
	public void lightOff() {
		System.out.println("형광등이 파르르 꺼집니다.");
	}
}
