package abstraction;

public class Driver1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("S0001","박그네",30);
//		Student s3 = new Student();
		
//		s1.setStudentNo = "S0001";
//		s1.setName = "이명박";
//		s1.setAge = 18;
		
		s1.setStudentNo("S0001");
		s1.setName( "이멍박");
		s1.setAge( 18);
		
//		s2.studentNo = "S0002";
//		s2.name = "박근혜";
//		s2.age = 30;
		
//		System.out.println("학번:"+s1.studentNo);
//		System.out.println("이름:"+s1.name);
//		System.out.println("나이:"+s1.age);
//		System.out.println();
//		System.out.println("학번:"+s2.studentNo);
//		System.out.println("이름:"+s2.name);
//		System.out.println("나이:"+s2.age);
//		System.out.println();
		
		s1.displayInfo();
		s2.displayInfo();
	}
}
