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
	} // 기본생성자

	public UniversityStudent(String studentNo, String name, int age, String major) {
		super(studentNo, name, age); // 부모의 생성자 호출시 활용
		this.major = major;
	}

	public void displayInfo() {
		System.out.println();
		System.out.println("학번:" + getStudentNo()); // private String
													// studentNo--> protected
													// String studentNo;
		System.out.println("이름:" + getName());
		System.out.println("나이:" + getAge());
		System.out.println("전공:" + major);
	}
}
