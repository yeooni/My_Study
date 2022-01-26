package Chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10; // 1byte
		int num = bNum; // 4byte

		System.out.println(num); // byte->int로 묵시적 형변환이 일어나서 int형으로 출력됨

		long lNum = 10; // 8byte
		float fNum = lNum; // 4byte 이지만 정수보다 실수가 더 정밀한 수 이기 떄문에 묵시적 형변환 발생

		System.out.println(fNum); // float형으로 묵시적 형변환

		double dNum = fNum + num; // 2번의 형변환 발생, num은 int형이고 fNum은 float형이기 때문에 float형으로 한번 바뀌고 다시 double형으로 바뀜
		System.out.println(dNum); // double형으로 출력
	}

}
