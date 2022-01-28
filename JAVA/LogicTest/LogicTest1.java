package logic.test1;

import java.util.Scanner;

public class LogicTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicTest1 tc = new LogicTest1();
		tc.test3();
	} 
	
	//합계 구하기
	public void test1() {
		//1~10까지 합계
		int number = 1;
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum = sum + number;
			System.out.println(number); 
			number = number + 1;
		}
		System.out.println(sum);	
	}
	
	//두개의 값 교환하기
	public void test2() {
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
	}
	
	//윤년여부 확인하기(연산자 주의해서 보기)
	public void test3() {
		//2020~2024
		int year = 2020;
		for(int i=0;i<5;i++) {
			if(year%400==0 || (year%4==0&&year%100!=0)){
				System.out.println(year + "는 윤년입니다. ");
			} else {
				System.out.println(year + "는 평년입니다. ");
			}
			year = year + 1;
			}
	}

	//구구단(가로) 2x1 3x1 4x1 5x1...처럼 바깥의 for는 바뀌고 안쪽의 for는 고정됨
	public void test5() {
		for(int i=2;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.print(j+"X"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	
	//숫자분리하기
	public void test6() {
		int number = 123456;
		int sum = 0;
		while(true) {
			if(number==0) {
				break;
			}
			int splitNumber = number % 10;
			sum = sum + splitNumber;
			System.out.println(splitNumber);
			number = number / 10;
		}
		System.out.println(sum);
	}
		
}

