import java.util.Scanner;

// �Է� ���� ������ ���ڿ� �迭�� �����. main �޼��� ���� args�� ����ϰ� �ȴ�.

class Ex5_7 {
	public static void main(String[] args) {
//		String[] Arr = new String[3];
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		for (int i =0;i<str.length;i++) {
//			Arr[i] = str[i]
//		}
//		���⸦ �������� ���ڿ��� �߶� Arr �迭�� �־��ֱ⸦ �ϸ� ���� ������?
		System.out.println("�Ű������� ����:"+args.length);
		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}
// �Ű������� ����:3
//args[0] = "abc"
//args[1] = "123"
//args[2] = "Hello world"