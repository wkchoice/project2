package array;


class Student {
	public enum GenderType { Male, Female }
	
	private String studentNo;
	private String name;
	private int age;
	private GenderType gender;
	
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

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public Student() { } // 기본생성자 추가
	
	public Student(String studentNo, String name, GenderType gender) {
		this.studentNo = studentNo;
		this.name = name;
		this.gender = gender;
	}
	
//	public Student(String studentNo, String name, int age, GenderType gender) {
//		this.studentNo = studentNo;
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}
	
	public Student(String studentNo, String name, int age, GenderType gender) {
		this(studentNo, name, gender);
		this.age = age;
	}
		
	public void displayInfo() {
		System.out.println();
		System.out.println("학번:"+studentNo);
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("성별:"+gender);
		System.out.printf("성별:%d\n", gender.ordinal());
	}
}
