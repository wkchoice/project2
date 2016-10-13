package polymorpism;

public class 인어 extends 사람 
  				  implements fish {

	@Override // 재정의
	public void 수중호흡하다() {
		System.out.println("인어가 물속에서 숨을 쉽니다");
	}
	
	@Override // 재정의
	public void 말하다() {
		System.out.println("인어가 헤엄치면서 말을 합니다");
	}
}
