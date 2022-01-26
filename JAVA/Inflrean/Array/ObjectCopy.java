package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조점래");
		bookArray1[1] = new Book("태백산맥2", "조점래");
		bookArray1[2] = new Book("태백산맥3", "조점래");

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);//.arraycopy는 시스템이라는 클래스에 있는 스태틱 메서드이다
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		
		/*for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfor();
		}
		
		System.out.println("===============");
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfor();
		}
		*/
		
		//처음부터 끝까지 순회할때는 향샹된 for문을 사용하는게 편리하다
		String[] strArr = {"Java", "Android", "C"};
		
		for(String s : strArr) { //향샹된 for문, s는 변수이다
			System.out.println(s);
			
		}
		
		int[] arr = {1,2,3,4,5};
		for(int num : arr) { // num = arr[i];
			System.out.println(num);
		}
	}
	
	

}
