package polymorpism;

public class PolymorpismEx1 {
	public static void main(String[] args) {
		�ξ� m1 = new �ξ�(); 
		��� f1 = new ���(); 
		��ġ f2 = new ��ġ(); 
		
		fish f3 = new fish() {
			@Override
			public void ����ȣ���ϴ�() {
				System.out.println("������ ���߻����� �� �ӿ��� ���� ���ϴ�");
			}
		};
		
		dowork(m1); System.out.println();
		dowork(f1); System.out.println();
		dowork(f2); System.out.println();
		dowork(f3); System.out.println();
		dowork(new fish() {
			@Override
			public void ����ȣ���ϴ�() {
				System.out.println("�Ǵٸ� ���߻����� �� �ӿ��� ���� ���ϴ�");
			}
		});
		
	} // main
	
	static void dowork(fish f) {
		f.����ȣ���ϴ�();
		f.�˳���();
		
		if (f instanceof �ξ�)
			((�ξ�)f).���ϴ�(); // ���� if���Ǿ��� �ܵ� ���� runtime�� ClassCastException �߻���. -> instanceof ����Ͽ� �ذ�.
	}
}
