package polymorphisim;

//public class LED등 extends 전구 { // LED등 + Ctrl+1하여 add~~하여 아래 method를 자동 생성 by eclipse
public class LED등 implements 전구 { // LED등 + Ctrl+1하여 add~~하여 아래 method를 자동 생성 by eclipse

	@Override
	public void lightOn() {
		System.out.println("LED등이 밝게 켜집니다");
	}

	@Override
	public void lightOff() {
		System.out.println("LED등이 꺼집니다");
	}


	
}
