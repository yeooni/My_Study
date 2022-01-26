package array;

public class TowDimensionArray {

	public static void main(String[] args) {

//		int[][] arr = new int[2][3];
		int[][] arr = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length); //행의 길이를 나타내서 2가 출력
		System.out.println(arr[0].length);//행을 기준으로 0번쨰 엘리먼트가 출력(열 전부)
		System.out.println(arr[1].length);//행을 기준으로 1번쨰 엘리먼트가 출력(열 전부)
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);//0,0 ~ 0,2까지 한번 돌고 -> i++니까 1,0 ~ 1,2까지 돈다
			}
		}
		
	}

}
