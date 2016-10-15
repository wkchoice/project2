package inheritance;

//- StudentDTO의 경우 SchoolDTO와 Composition관계이므로 
//객체 생성시 반드시 SchoolDTO의 값이 유효해야함
//- 따라서 모든 생성자에 SchoolDTO 객체 값을 받도록 작성
public class StudentDTO {
	private String studentId;
	private String studentName;
	private int studentAge;
	private int studentGrade;
	private int studentNumber;
	private int studentClass;
	private SchoolDTO schoolTO; // 반드시 객체에 값 할당.

	public StudentDTO(String studentId, String studentName, int studentAge, int studentGrade, int studentNumber,
			int studentClass, SchoolDTO schoolTO) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentGrade = studentGrade;
		this.studentNumber = studentNumber;
		this.studentClass = studentClass;
		this.schoolTO = schoolTO; // 반드시 객체에 값 할당.
	}

	public StudentDTO(String studentId, String studentName, int studentAge, SchoolDTO schoolTO) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.schoolTO = schoolTO; // 반드시 객체에 값 할당.
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public SchoolDTO getSchoolTO() {
		return schoolTO;
	}

	public void setSchoolTO(SchoolDTO schoolTO) {
		this.schoolTO = schoolTO;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentGrade=" + studentGrade + ", studentClass=" + studentClass + ", studentNumber="
				+ studentNumber + ", schoolTO=" + schoolTO + "]";
	}
}

// SchoolDTO.java
// - SchoolDTO의 경우 AddressDTO와 Aggregation관계이므로
//   AddressDTO 객체 값을 정해주지 않는 생성자를 만들어 줌
class SchoolDTO {
	private String schoolId;
	private String schoolName;
	private String schoolTelNo;
	private int enrolment;
	private AddressDTO addressTO;

	public SchoolDTO(String schoolId, String schoolName, String schoolTelNo, int enrolment, AddressDTO addressTO) {
		this(schoolId, schoolName, schoolTelNo, enrolment);
		this.addressTO = addressTO;
	}

	public SchoolDTO(String schoolId, String schoolName, String schoolTelNo, int enrolment) {
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolTelNo = schoolTelNo;
		this.enrolment = enrolment;
	}

	public SchoolDTO() {
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolTelNo() {
		return schoolTelNo;
	}

	public void setSchoolTelNo(String schoolTelNo) {
		this.schoolTelNo = schoolTelNo;
	}

	public int getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(int enrolment) {
		this.enrolment = enrolment;
	}

	public AddressDTO getAddressTO() {
		return addressTO;
	}

	public void setAddressTO(AddressDTO addressTO) {
		this.addressTO = addressTO;
	}

	@Override
	public String toString() {
		return "SchoolDTO [schoolId=" + schoolId + ", schoolName=" + schoolName + ", schoolTelNo=" + schoolTelNo
				+ ", enrolment=" + enrolment + ", addressTO=" + addressTO + "]";
	}

}

// - AddessDTO의 경우 생성시 반드시 모든 값을 정해 주지 않아도 되므로
// 기본생성자와 모든 값을 받아 생성하는 생성자 두개를 작성
// AddressDTO.java
class AddressDTO {
	private String zipcode;
	private String addressDetail;

	public AddressDTO(String zipcode, String addressDetail) {
		this.zipcode = zipcode;
		this.addressDetail = addressDetail;
	}

	public AddressDTO() {
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	@Override
	public String toString() {
		return "AddressDTO [zipcode=" + zipcode + ", addressDetail=" + addressDetail + "]";
	}
}
