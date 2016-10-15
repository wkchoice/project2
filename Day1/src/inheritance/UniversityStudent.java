package inheritance;

public class UniversityStudent extends Student {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public UniversityStudent() {
	} // �⺻������

	public UniversityStudent(String studentNo, String name, int age, String major) {
		super(studentNo, name, age); // �θ��� ������ ȣ��� Ȱ��
		this.major = major;
	}

	public void displayInfo() {
		System.out.println();
		System.out.println("�й�:" + getStudentNo()); // private String
													// studentNo--> protected
													// String studentNo;
		System.out.println("�̸�:" + getName());
		System.out.println("����:" + getAge());
		System.out.println("����:" + major);
	}
}
