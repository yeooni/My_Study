package logic.test1;

public class LogicTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1:2021년 8월 달력 만들기(일요일부터 시작 31일로 끝남)->기본 제어문과 연산자연습
		System.out.println("2021년 8월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day = 1;
		for(int i=0;i<31;i++) {
			System.out.print(day+"\t");
			if(day%7==0) {
				System.out.println();
			}
			day = day + 1;
		}
			
	}
}
