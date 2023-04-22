class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
				continue;
			System.out.println(i);
		} // continue를 통해 작업을 수행하지 않고, 괄호 끝으로 간다.
	}
}