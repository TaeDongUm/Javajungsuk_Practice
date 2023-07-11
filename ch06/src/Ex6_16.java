public class Ex6_16 {
	public static void main(String[] args) {
		
	}
}

// 선언 위치에 따른 변수의 종류

class Variables{
	// instance value
	int iv;
	
	// class value
	static int cv;
	
	// local value
	void method() {
		int lv = 0;
	}
}