class Ex3_9 {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만 = 10의 6제곱
		int b = 2_000_000;    // 2,000,000   2백만 = 10의 6제곱

		// 10의 12제곱. 	int의 범위는 10의 9제곱. 범위를 벗어남
		// 그래서, long으로 바꾸려 했는데 결과(a*b)가 int이다
		// 오버플로우 발생
		// 그래서 결과가 엉뚱하게 나옴 -1454759936
		// 올바르게 나오기 위해서는?
		// a나 b 중 하나를 long 형변환해주면 된다.
		long c = a * b;       // a * b = 2,000,000,000,000 ?
		long c1 = a * (long)b;

		System.out.println(c);
		System.out.println(c1);
	}
}