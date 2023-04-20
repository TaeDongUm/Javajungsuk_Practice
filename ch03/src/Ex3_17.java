class Ex3_17 {
	public static void main(String args[]) { 
		int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x;  // x가 양수이면 x를, 거짓이면 -x를 absX에 저장
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // 부호값을 저장하는 과정
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 	// 각 변수가 0보다 크면 + 부호를,
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 	// 거짓일 때, 각 변수가 0이면 빈 문자를, 거짓이면 - 부호를 저장

		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}
}