import java.util.Arrays; // ctrl + shift + o ??ë¥´ë©´ ?????¼ë? importë¬? ì¶?ê°?

class Ex5_1_4 {
	public static void main(String[] args) {
		// index: 0~3-1, 0~2
		String[] strArr = {"°¡À§", "¹ÙÀ§", "º¸"};
		System.out.println(Arrays.toString(strArr));
		for (int i=0; i<10;i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]); // 0~2
		}
}
}