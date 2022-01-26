package array;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList; //학생이 수강하게 되는 과목의 배열로 관리해준다
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	public void addSubject(String name, int score) { //학생이 과목을 추가하면 서브젝트리스트에 추가를 해줘야한다
													//어떠한 과목에 몇점이 들어가는지에 대한 메소드
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		for(Subject subject : subjectList) {
			total+= subject.getScorePoint();
			System.out.println("학생" + studentName + "님의 " + subject.getName() + " 과목의 성적은 " 
								+ subject.getScorePoint() + "점 입니다.");
		}
		System.out.println("학생" + studentName + "님의 총점은 " + total + "점 입니다.");
	}
}
