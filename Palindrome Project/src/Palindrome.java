import java.util.Scanner;

/**
 * @author Elvin Widjaja
 * @date 5/3/2016 Palindrome program: will check if a word is a palindrome.
 *
 */

public class Palindrome {
	public static void main(String[] args) {
		boolean keepPlaying = true;

		System.out.println("Welcome to the palindrome program!");

		// program will keep asking for input until the user wants to quit
		while (keepPlaying == true) {
			// get the word via scanner
			String word = getWord();

			// see if the word is a palindrome
			checkWord(word);

			// check if the user wants to keep playing, if not then the program
			// will quit
			if (keepPlaying() == false) {
				keepPlaying = false;
			}
		}

	}

	// get the word via scanner
	public static String getWord() {
		System.out.println("Please enter a word: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return input;
	}

	/**
	 * 
	 * @param word
	 * @return true if it is a palindrome false if it is not
	 */
	public static boolean checkWord(String word) {
		int begin = 0;
		int end = word.length() - 1;

		while (begin < end) {
			if (word.charAt(begin) != word.charAt(end)) {
				System.out.println(word + " is not a palindrome!");
				return false;
			}
			// move points to check
			begin++;
			end--;
		}
		System.out.println(word + " is a palindrome!");
		return true;
	}

	/**
	 * asks user if they want to keep playing
	 * 
	 * @return boolean
	 */
	@SuppressWarnings("resource")
	public static boolean keepPlaying() {
		boolean correct = true;

		while (correct) {
			// asks for user input
			System.out.println("Would you like to keep playing? (Y/N)");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String play = scan.nextLine();

			if (play.trim().equals("Y") || play.trim().equals("y")) {
				correct = false;
				return true;
			} else if (play.trim().equals("N") || play.trim().equals("n")) {
				System.out.println("Thank you for playing!");
				return false;
			} else {
				System.out.println("That is not a recognized response.");
			}
		}
		return false;
	}
}
