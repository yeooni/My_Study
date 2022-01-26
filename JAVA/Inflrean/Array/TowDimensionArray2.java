package array;

public class TowDimensionArray2 {

	public static void main(String[] args) {

		char[][] alpabets = new char[13][2]; // 13행 2열의 이차원배열 선언
		char ch = 'A'; // 알파벳을 아스키 코드로 증가시키기 위한 변수 선언

		for (int i = 0; i < alpabets.length; i++) { // 바깥 for문 -> 개행
			for (int j = 0; j < alpabets[i].length; j++, ch++) {// 내부 for문 ->열
				alpabets[i][j] = ch; // 아스키값으로 각 요소에 저장
				System.out.print(alpabets[i][j]); // 열 출력 (i행의 j열)
			}
			System.out.println();
		}

	}

}
