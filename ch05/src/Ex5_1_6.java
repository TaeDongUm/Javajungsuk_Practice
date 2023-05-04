import java.util.Arrays; // ctrl + shift + o 자동으로 import문을 작성

class Ex5_1_6 {
	public static void main(String[] args) {
		//			  01234
		String str = "ABCDE";
		char ch = str.charAt(4); // 문자열에서 하나 꺼내서 출력하기
		String str2 = str.substring(1,4);
		String str3 = str.substring(1); // 2번쨰를 생략하면 1부터 끝까지(아래줄과 같다)
//		String str3 = str.substring(1,str.length());
		System.out.println(ch);
		System.out.println(str2); //BCD
		System.out.println(str3); //BCDE
}
}