// �Է� ���� ������ ���ڿ� �迭�� �����. main �޼��� ���� args�� ����ϰ� �ȴ�.
class Ex5_7 {
	public static void main(String[] args) {
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