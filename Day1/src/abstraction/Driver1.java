package abstraction;

public class Driver1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("S0001","�ڱ׳�",30);
//		Student s3 = new Student();
		
//		s1.setStudentNo = "S0001";
//		s1.setName = "�̸��";
//		s1.setAge = 18;
		
		s1.setStudentNo("S0001");
		s1.setName( "�̸۹�");
		s1.setAge( 18);
		
//		s2.studentNo = "S0002";
//		s2.name = "�ڱ���";
//		s2.age = 30;
		
//		System.out.println("�й�:"+s1.studentNo);
//		System.out.println("�̸�:"+s1.name);
//		System.out.println("����:"+s1.age);
//		System.out.println();
//		System.out.println("�й�:"+s2.studentNo);
//		System.out.println("�̸�:"+s2.name);
//		System.out.println("����:"+s2.age);
//		System.out.println();
		
		s1.displayInfo();
		s2.displayInfo();
	}
}
