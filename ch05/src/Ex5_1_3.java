import java.util.Arrays; // ctrl + shift + o 누르면 자동으로 import문 추가

//import java.util.Arrays; // Arrays.toString 쓰기 위해서

class Ex5_1_3 {
	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};
		System.out.println(iArr);
		
		for (int i=0;i< iArr.length;i++) {
			System.out.println(iArr[i]);
		}
		System.out.println(Arrays.toString(iArr));
}
}