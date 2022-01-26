package Chapter2;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100; //상수는 관용적으로 '대문자'를 많이씀
		final float PI = 3.14f; 
		//PI = 3.15f; final은 상수이기 때문에 값이 변할 수 없음
		
		/*상수의 좋은점? -> 학생의 수가 30명으로 상수를 지정해놓고 나중에 전학생이 와서 31명이 되어도 num에 상수만 집어넣어주면 자동으로 들어가지기
		때문에 좋다.*/ 
		final int STUDENT_NUM = 30;
		
		int num = 0;
		if( num == STUDENT_NUM) {}
		
		System.out.println(STUDENT_NUM);
	}

}
