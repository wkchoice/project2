package inheritance;

class Student {
	private String studentNo;
	private String name;
	private int age;
	
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	public String getStudentNo() {
		return this.studentNo;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		if (age < 0) age = 0;
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student() { } // �⺻������ �߰�
	
	public Student(String studentNo, String name, int age) {
		this.studentNo = studentNo;
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println();
		System.out.println("�й�:"+studentNo);
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
}
