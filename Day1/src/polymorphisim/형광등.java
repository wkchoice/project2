package polymorphisim;

//public class ������ extends ���� {
public class ������ implements ���� {
	@Override // �θ� method ������(�θ� �̿ϼ��̹Ƿ�)
	public void lightOn() {
		System.out.println("�������� �����Ÿ��� �����ϴ�.");
	}
	
	@Override // �θ� �޼ҵ� �������ؼ� �ڽ� Ŭ�������� ���
	public void lightOff() {
		System.out.println("�������� �ĸ��� �����ϴ�.");
	}
}
