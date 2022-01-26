package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		for (num = 1, sum = 0; num <= 10; num++) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
