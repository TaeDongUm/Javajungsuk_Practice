class Ex4_8 {
	public static void main(String args[]) {
//		for (int i = 1; i <= 3; i++) { // 괄호{} 안의 문장을 3번 반복
//			System.out.println("Hello");
//		}
//		 for (int i = 1; i <= 10; i=i+2) { // +2씩 증가 1,3,5,7,9
//			 System.out.println("Hello");
//		}
//		 for (int y = 1; y <= 10; y=y*2) { // +2씩 증가 1,2,4,8
//			 System.out.println("Hello");
//		
//		}
//		 for (int z = 1; z <= 1; z--) { // 무한 루프
//			 System.out.println("Hello");
//		
//		}
//		int i; // 이 i는 가장 바깥 괄호에서 쓸 수 있도록 선언된 i이다.
				// scope(범위)라고 하는데 좁을수록 좋다. 
				// 선언위치부터 선언된 블록의 끝까지
				// 나중에 문제 생겼을 때 확인해야 할 범위가 좁기 때문
		 for (int i = 1, j = 10; i <= 10; i++, j--) { // i와 j를 같이 넣을 수 있다.
			 System.out.println("i=" + i + ",j=" + j); // i와 j는 for문 안에서만 선언된 것.
		
		}
//		 // 조건식 생략하면, true로 간주되어서 무한반복문이 됨
//		 for (; ;) {
//			 
//		 }

}
}