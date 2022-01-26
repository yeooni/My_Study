package classpart;

public class FuntionExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = addNum(num1, num2); //addNum함수를 호출하고 ()안에 값을 넣어주고 반환값인 int sum에 값이 들어간다, int sum에는 result가 들어 있는것
		System.out.println(sum);
	}

	public static int addNum(int n1, int n2) { //addNum이 함수이고 (int n1, int n2)가 addNum이 새로 만든 매개변수
											   //n1과 n2는 main의 num1=10, num2=20의 값을 가져온다
		int result = n1 + n2;
		return result; //result는 n1+n2값을 반환해준다
	
	}
}
