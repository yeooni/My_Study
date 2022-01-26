package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];//Book의 주소자리 5개를 만들어 놓은것이지 Book이 5개 생긴것이 아니다
		
		library[0] = new Book("태백산맥1", "조점래");
		library[2] = new Book("태백산맥3", "조점래");
		library[1] = new Book("태백산맥2", "조점래");
		library[3] = new Book("태백산맥4", "조점래");
		library[4] = new Book("태백산맥5", "조점래");//주소값이 생김
		
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfor(); //showBookInfor 메소드 호출
		}
	}
}

