package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayListTest at = new ArrayListTest();
		at.test2();

	}

	public void test1() {
		ArrayList<String> list = new ArrayList<String>(); // ArrayList의 String타입으로 배열을 만들것이다

		list.add("aaa"); // list에 내용추가
		list.add("bbb");
		list.add("ccc");

		for (String s : list) { // 향상된 for문 String s에 list값을 넣어준다
			System.out.println(s);
		}

	}
	
	public void test2() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa"); 
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size(); i++) { //for문을 그냥 사용했을때
			System.out.println(list.get(i));
			//String s = list.get(i);
		}
		
	}

}
