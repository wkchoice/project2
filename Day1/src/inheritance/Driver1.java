package inheritance;

public class Driver1 {
	public static void main(String[] args) {
		UniversityStudent u1 = new UniversityStudent();
		UniversityStudent u2 = new UniversityStudent("U0001","전두환",25,"쿠테타학과");
		u2.displayInfo();
	}
}
