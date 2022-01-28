package logic.test1;

import java.util.Scanner;

public class LogicTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4.기본 달력 만드는 엔진->이것을 이용하는 사용자 인터페이스 만들기=달력사용로직을 만들어라
			LogicTest5 cm = new LogicTest5(); 
			cm.start(); 
		}
		
		public void start() { 
			Scanner scan = new Scanner(System.in); 
			boolean flag = false; 
			while(!flag) {
				System.out.print("input month please >>> ");
				int cmd = scan.nextInt(); 
			
				makeCalendar(cmd);
				
				System.out.print("be continue? [Yes:1, No:0] >>> ");
				cmd = scan.nextInt();
				if(cmd==0) {
					System.out.println("Calendar Service is Stop!!");
					flag = true; 
				}
			}
			scan.close(); 
	}
		void makeCalendar(int mon) { 
			int year = 2021;
			int month = mon;
			int[] spaces = new int[12];
			int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
			spaces[0] = (2+31)%7; //->2021년도만 출력
			for(int i=1;i<12;i++) {
				spaces[i] = (spaces[i-1]+lastDays[i-1])%7;
			}
			
			int space = spaces[month-1];
			//윤년판단 로직
			int lastDay = lastDays[month-1];
			if(year%400==0 || (year%4==0&&year%100!=0)) {
				lastDay = 29;
			} 
			
			System.out.printf("%d년 %d월 %n",year,month);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for(int i=0;i<space;i++) {
				System.out.print("\t");
			}
			int day = 1;
			for(int i=0;i<lastDay;i++) { 
				System.out.print(day+"\t");
				if((space+day)%7==0) {
					System.out.println();
				}
				day = day + 1;
			}
			
			System.out.println("\n"); 
		}
		
	}
