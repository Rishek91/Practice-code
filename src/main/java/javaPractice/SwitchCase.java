package javaPractice;

public class SwitchCase {

	public static void main(String[] args) {
		
		char ch='w';
		switch (ch) {
		case 'a':
			System.out.println(ch + ": is a vowel");
			break;
		case 'e':
			System.out.println(ch + ": is a vowel");
			break;
		case 'i':
			System.out.println(ch + ": is a vowel");
			break;
		case 'o':
			System.out.println(ch + ": is a vowel");
			break;
		case 'u':
			System.out.println(ch + ": is a vowel");
			break;

		default:
			System.out.println(ch + ": is a constant");
			break;
		}
	

}
}