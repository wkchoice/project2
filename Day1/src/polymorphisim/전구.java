package polymorphisim;

//public class ���� {
//	public void lightOn() {
//		System.out.println("������ �����ϴ�.");
//	}
//	
//	public void lightOff() {
//		System.out.println("������ �����ϴ�.");
//	}

// �θ�class���� �̿ϼ� class�� method�� �����ϰ�, �ڽ� class���� �������ؼ� �����.
//public abstract class ���� {
//	public abstract void lightOn();
//	
//	public abstract void lightOff();
//	
//}

// �ڹ� interface�� ����̴�. class(��ü)�� �� �� �ִ°��� ������ ���̴�.
public interface ���� { // �ڽ�class���� extends ��� implements�� ������.
	
	public void lightOn();
	public void lightOff();
	
}

public interface handLight {
	public void handOn();
	public void HandOff();
}