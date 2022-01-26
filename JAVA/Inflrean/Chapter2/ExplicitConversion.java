package Chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum = 1000;
		byte bNum = (byte) iNum;

		System.out.println(iNum); // 명시적 형변환시 iNum의 값이 변하는것은 아니다
		System.out.println(bNum); // 큰수->작은수로 값을 대입하게 되면 데이터가 유실되고 오류가 날 수 있다

		double dNum = 3.14;
		iNum = (int) dNum;

		System.out.println(iNum); // 정수 부분만 나오게되고 소수점 부분은 유실됨

		float fNum = 0.9F;

		int num1 = (int) dNum + (int) fNum; // dNum을 int로 바꾸면 3, fNum을 int로 바꾸면 0, 3+0=3
		int num2 = (int) (dNum + fNum); // dNum과 fNum을 한꺼번에 바꾸게 되면 3.14+0.9=4.04

		System.out.println(num1); // 3출력
		System.out.println(num2); // 4출력
	}

}
