package polymorpism;

public class PolymorpismEx1 {
	public static void main(String[] args) {
		인어 m1 = new 인어(); 
		상어 f1 = new 상어(); 
		멸치 f2 = new 멸치(); 
		
		fish f3 = new fish() {
			@Override
			public void 수중호흡하다() {
				System.out.println("미지의 수중생물이 물 속에서 숨을 쉽니다");
			}
		};
		
		dowork(m1); System.out.println();
		dowork(f1); System.out.println();
		dowork(f2); System.out.println();
		dowork(f3); System.out.println();
		dowork(new fish() {
			@Override
			public void 수중호흡하다() {
				System.out.println("또다른 수중생물이 물 속에서 숨을 쉽니다");
			}
		});
		
	} // main
	
	static void dowork(fish f) {
		f.수중호흡하다();
		f.알낳다();
		
		if (f instanceof 인어)
			((인어)f).말하다(); // 위의 if조건없이 단독 사용시 runtime시 ClassCastException 발생됨. -> instanceof 사용하여 해결.
	}
}
