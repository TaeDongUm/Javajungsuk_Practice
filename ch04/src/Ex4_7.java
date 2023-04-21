class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// 괄호{} 안의 내용을 5번 반복한다.
		// Quiz1. 1~5 사이의 난수를 10개 출력하시오.
		// 1,2,3,4,5
		// Quiz2. -5~5 사이의 난수를 10개 출력하시오.
		// -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 = 11개
		for (int i = 1; i <= 10; i++) {
//			num = (int) (Math.random() * 6) + 1;
//			System.out.println(num);
//			System.out.println(Math.random()); // 0 <= x < 1.0
//			System.out.println(Math.random()*5); // 0 <= x < 5.0
//			System.out.println((int)(Math.random()*5)); // 0 <= x < 5.0, 0~4
//			System.out.println((int)(Math.random()*5) + 1); // 1 <= x < 6.0, 1~5
			System.out.println((int)(Math.random()*11)-5); // -5 <= x < 6, -5 ~ 5
		}
	}
}