
class Ex5_1_2 {
	public static void main(String[] args) {
		// index 범위: 0~9
		int[] arr = new int[9];
		System.out.println("arr.length="+arr.length);
		
//		for(int i=0;i<10;i++) { // index 범위를 벗어나서 에러남
//			System.out.println("arr["+i+"]=" + arr[i]);
		for(int i=0;i<arr.length;i++) { // index 범위를 벗어나서 에러남
			System.out.println("arr["+i+"]=" + arr[i]);
		}
	}
}