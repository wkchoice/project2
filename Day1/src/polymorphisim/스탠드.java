package polymorphisim; // ������

public class ���ĵ� {
	private ���� bulb; // �鿭�� bulb --> ���� bulb
	
	public void install(���� bulb) { // �鿭�� bulb --> ���� bulb
		this.bulb = bulb;
	}
	
	public void turnOn() {
		if (bulb != null)
		    bulb.lightOn();
		else
			System.out.println("���� ��ġ �ϼ���(on)");
	}
	
	public void turnOff() {
		if (bulb != null)
		    bulb.lightOff();
		else
			System.out.println("���� ��ġ �ϼ���(off)");
	}
}
