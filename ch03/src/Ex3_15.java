import java.util.*;  // Scanner

class Ex3_15 {
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';

		System.out.printf("");

		String input = scanner.nextLine();
		ch = input.charAt(0);

		if('0' <= ch && ch <= '9') {
			System.out.printf(".%n");
		}

		if(('a' <= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
			System.out.printf(".%n");
		}
		scanner.close();
	} // main1
}