package logic.test1;

import java.util.Calendar;

public class LogicTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3:만년달력 만들기 -> 클래스 추가
		LogicTest4 ct = new LogicTest4();
		ct.viewMonthFinalVersion(1996,2); 
}
	
		public void viewMonthFinalVersion(int year,int month) {
			Calendar cal = Calendar.getInstance();
			cal.set(year, month-1, 1); 
			
			int space = cal.get(Calendar.DAY_OF_WEEK)-1; 
			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
			System.out.printf("%d년 %d월 \n", year, month);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			int day = 1; 
			for(int i=0;i<space;i++) {
				System.out.print("\t");
			}
			for(int i=0;i<lastDay;i++) {
				System.out.print(day+"\t"); 
				if((space+day)%7==0) {
					System.out.println();
				}
				day = day + 1;

			}

		}
		
}