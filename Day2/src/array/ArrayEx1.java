package array;

public class ArrayEx1 {
	public static void main(String[] args) {
		Student[] students; // 4bytes 참조변수
		students = new Student[5]; // 배열을 생성
		
		students[0] = new Student(); // 미선언시 Null point exception발생
		
		students[0].setStudentNo("S001");
		students[0].setName("홍길동");
		students[0].setAge(18);
		students[0].setGender(Student.GenderType.Male);
		
		students[1] = new Student("S002", "김삿갓", 30, Student.GenderType.Male);
		students[2] = new Student("S003", "도라이몽", 8, Student.GenderType.Female);
		
//		for(int i= 0; i < students.length;i++) {
//			if (students[i] != null)
//				students[i].displayInfo();
//		}
		
		for(Student s : students) { // 객체 변수 선언 : collection 선언
			if ( s != null)
				s.displayInfo();
		}
	}
}
