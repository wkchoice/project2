package polymorpism;

public interface fish {
	void ����ȣ���ϴ�();
	
	default void �˳���() {
		System.out.println("fish : ���� �������� ����");
	}
}
