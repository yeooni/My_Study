package array;

public class ArrayTest {

	public static void main(String[] args) {

//		int[] numbers = {1,2,3} 한꺼번에 초기화 해줌	
		
//		int[] numbers = new int[3]; //배열 3개가 생성되고 초기화 됐다
//		numbers[0] = 1; //배열의 첫번째 인덱스를 의미
//		numbers[1] = 2; //배열의 첫번째 인덱스를 의미
//		numbers[2] = 3; //배열의 첫번째 인덱스를 의미
		
		int[] numbers = new int[] {0,1,2}; //배열 3개가 생성되고 초기화 됐다
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
