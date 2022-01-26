package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;

	public Student() {}//디폴트 생성자가 생성되었기 때문에 stdent클래스의 Student studentKim = new Student(); 는 오류가 아니다
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void shouStudentInfor() {
		System.out.println(studentName + "," + address);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

}
