package algorithmProject2;

import java.util.Scanner;

public class Data {
	public static final int NO = 1;
	public static final int NAME = 2;

	private Integer no;
	private String name;
	private Scanner stdIn;

	public Data(Scanner stdIn) {
		this.stdIn = stdIn;
	}

	Integer keyCode() {
		return no;
	}

	public String toString() {
		return name;
	}

	void scanData(String guide, int sw) {
		System.out.println(guide);

		if ((sw & NO) == NO) {
			System.out.print("상품 번호 입력 : ");
			no = stdIn.nextInt();
		}
		if ((sw & NAME) == NAME) {
			System.out.print("상품명 입력 : ");
			name = stdIn.next();
		}
	}
}
