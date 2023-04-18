
public class Ex2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";
		
		
		System.out.println(str.charAt(0)-'0');
		System.out.println('3'-'0' + 1);	// 숫자로 바꾼 뒤 1 더하기
		System.out.println('3' + 1);		// 문자 3에다가 1 더하기
		System.out.println(Integer.parseInt(str) + 1);
		System.out.println("3" + 1);		// 문자열 31 이 출력됨
		System.out.println(3 + '0');		// '0'은 숫자로 48, 그래서 숫자 51이 출력됨
		System.out.println((char)(3 + '0'));	// 문자 '3'
	}

}
