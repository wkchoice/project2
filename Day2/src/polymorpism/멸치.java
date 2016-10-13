package polymorpism;

public class 멸치 implements fish{ // interface

	@Override
	public void 알낳다() {
		System.out.println("멸치가 알을 낳습니다.");
	}

	@Override
	public void 수중호흡하다() {
		System.out.println("멸치가 물속에서 숨을 쉽니다.");
	}

}
