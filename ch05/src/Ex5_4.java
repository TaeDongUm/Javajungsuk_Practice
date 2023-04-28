import java.util.Arrays;

class Ex5_4 {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
//		for (int i=0; i < numArr.length; i++) 간단하게 해당 배열의 길이만큼의 횟수로 바꾼다면
		for (int i=0; i < 100; i++ ) {
			int n = (int)(Math.random() * 10);  // 0~9 중의 한 값을 임의로 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	} // main의 끝
}