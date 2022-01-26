package array;

public class ArrayTest3 {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A'; //65
		
		for(int i = 0; i < alphabets.length; i++, ch++) { //B를 넣으려면 ch값이 증가되어야함
			alphabets[i] = ch; //알파벳의 i번째에 ch를 넣는다
		}
		
		for(int i = 0; i <alphabets.length; i++, ch++) {
			System.out.println(alphabets[i]);
		}
	}

}
