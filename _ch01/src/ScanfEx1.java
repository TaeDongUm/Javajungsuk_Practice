import java.util.*; // java의 util 패키지에 있는 Scanner를 쓰겠다. *를 써도 되고(이 뜻은 util 패키지를 이용하겠다)
//import java.util.Scanner;

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // scanner라는 객체 생성 및 화면 입력 받겠다
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println(num);
;	}

}
