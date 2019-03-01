package lecture_06;

/*
 * Program to test RandomCharacter class to print randomly generated lowercase letters
 */
public class TestRandomCharacter {
	// main method
	public static void main(String[] args) {
		// do-while loop randomly prints lowercase characters until character = 'q'
		do {
			char ch = RandomCharacter.getRandomLowerCaseLetter();
			if (ch == 'q') {
				System.out.println("\n\nSuccess! Computer has correctly choose: " + ch);
				break;
			}
			else {
				System.out.print(ch + ",  ");
			}
		} while (true);
	}

}
