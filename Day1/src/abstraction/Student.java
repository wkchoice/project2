package abstraction;

public class Student {
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

class Teacher extends Student {
	private int salary;
	private String origin;
	
	public Teacher() {	}
	
	public Teacher(String studentNo, String name, int age, int salary, String origin) {
		super(studentNo, name, age);
		this.salary = salary;
		this.origin = origin;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("�� ��: " + salary + "��");
		System.out.println("�� ��: " + origin);
	}
	
}
