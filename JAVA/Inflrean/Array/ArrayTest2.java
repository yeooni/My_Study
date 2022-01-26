package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5];//길이가 5인 배열 선언
		int size = 0;
		
		num[0] = 10.0; size++;//인덱스 1번값인 0에 10 삽입
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1;
		for(int i=0; i<size; i++) { //배열의 길이만큼 반복이 돌고 
			total *= num[i]; //total은 total + num[i] 배열길이
		}
		System.out.println("total = " + total);
	}

}
