package polymorpism;

public interface fish {
	void 수중호흡하다();
	
	default void 알낳다() {
		System.out.println("아직 구현되지 않음");
	}
}
