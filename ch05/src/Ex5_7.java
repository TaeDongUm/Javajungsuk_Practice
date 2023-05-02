import java.util.Scanner;

// 입력 받은 값으로 문자열 배열을 만든다. main 메서드 내의 args를 사용하게 된다.

class Ex5_7 {
	public static void main(String[] args) {
//		String[] Arr = new String[3];
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		for (int i =0;i<str.length;i++) {
//			Arr[i] = str[i]
//		}
//		띄어쓰기를 기준으로 문자열을 잘라서 Arr 배열에 넣어주기를 하면 되지 않을까?
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}
// 매개변수의 개수:3
//args[0] = "abc"
//args[1] = "123"
//args[2] = "Hello world"