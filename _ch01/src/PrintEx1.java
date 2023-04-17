
public class PrintEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/3);  // 정수 나누기 정수 = 정수
//		System.out.println(10.0/3);		// 실수로 출력하려면 
//		
//		System.out.printf("%d", 15);
//		System.out.printf("%o", 15);
//		System.out.printf("%x", 15);
//		System.out.print("\n");
//		System.out.printf("%d%n", 15);
//		System.out.printf("%o%n", 15);
//		System.out.printf("%x%n", 15);
//		
//		float f = 123.456789f;
//		System.out.println("%f%n", f);  //오류 이유: 지시자 f가 소주점 포함 7자리 출력이므로
//		System.out.printf("%f%n", f);
//		
//		double f1 = 123.456789;
//		System.out.printf("%f%n", f1);
//		System.out.printf("%e%n", f1);
//		System.out.printf("%g%n", f1); // 소수점 포함해서 7자리
		
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%5d]%n", 1234567);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d);
		System.out.printf("%.6f%n", d);	// 전체자리를 생략할 수 있다. 
		System.out.printf("%12.6f", d); // 소수점 6자리 제외 나머지 6자리를 채우려고 빈공간 4자리 존재
		
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com"); // 전체자리 생략함33
		
	}

}
