import java.util.*;

class Ex4_14 {
	public static void main(String[] args) { 
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요.(예:12345)>");
		System.out.println();
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();  // 입력받은 값을 tmp에 저장
//		num = Integer.parseInt(tmp);      // 입력받은 문자열tmp을 실수로 바꿈
//
//		while(num!=0) {    
//			// num을 10으로 나눈 나머지를 sum에 더함
//			sum += num%10; 	// sum = sum + num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//
//			num /= 10;   // num = num / 10;  num을 10으로 나눈 값을 num에 저장
//		}
		for (num=12345;num>0;num = num/10) {
			System.out.println(num%10);
			sum += num % 10;
		}
		// while문으로 바꾸기
//		num = 12345;
//		while(num>0) {
//			sum += num%10;
//			System.out.println("sum=" + sum + ", num%10=" + num%10);
//			num = num/10;
//		}
		System.out.println("각 자리수의 함:"+sum);
	}
}