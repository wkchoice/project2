package array;

public class ArrayEx1 {
	public static void main(String[] args) {
		Student[] students; // 4bytes ��������
		students = new Student[5]; // �迭�� ����
		
		students[0] = new Student(); // �̼���� Null point exception�߻�
		
		students[0].setStudentNo("S001");
		students[0].setName("ȫ�浿");
		students[0].setAge(18);
		students[0].setGender(Student.GenderType.Male);
		
		students[1] = new Student("S002", "���", 30, Student.GenderType.Male);
		students[2] = new Student("S003", "�����̸�", 8, Student.GenderType.Female);
		
//		for(int i= 0; i < students.length;i++) {
//			if (students[i] != null)
//				students[i].displayInfo();
//		}
		
		for(Student s : students) { // ��ü ���� ���� : collection ����
			if ( s != null)
				s.displayInfo();
		}
	}
}
