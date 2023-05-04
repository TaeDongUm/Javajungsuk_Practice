import java.util.Arrays; // ctrl + shift + o 자동으로 import문을 작성

class Ex5_1_5 {
	public static void main(String[] args) {
	int[] arr = {0,1,2,3,4};		// 1차원
	int[][] arr2D = {{11,12},{21,22}};		//2차원 다차원
	
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.deepToString(arr2D));
	
	String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
	String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
	
	// 배열은 메모리의 비어있는 공간에다가 만드는 것이기 때문, 주소값이 같을 수 없다
	System.out.println(str2D==str2D2); // 참조변수 값을 비교하는 것 false( 두 배열이 같은 메모리상의 공간에 존재할 수 없기 때문
	System.out.println(Arrays.deepEquals(str2D,str2D2));
	
	int[] arr2 = Arrays.copyOf(arr, arr.length);
	System.out.println(Arrays.toString(arr2));
	
	int[] arr3 = Arrays.copyOfRange(arr, 2, 6);
	System.out.println(Arrays.toString(arr3));
	
	//배열 정렬
	int [] arr4 = {4,3,6,2,1};
	Arrays.sort(arr4);
	System.out.println(Arrays.toString(arr4));
	}
	
}