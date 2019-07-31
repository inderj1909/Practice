package practice;

public class StringReverse {
	
	public void reverseLetters() {
		String[] letters = { " Hello", " my", " name", " is", " Inder" };
		String reverse = " ";

		for (int i = 0; i < letters.length; i++) {
			String word = letters[i];

			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverse = reverseWord + reverse ;
		}
		System.out.println(reverse);
	}

	public void reverseWords() {
		String[] words = { " Hello", " my", " name", " is", "Inder" };
		String reverse = " ";

		for (int i = words.length - 1; i >= 0; i--) {
			reverse = reverse + words[i];
		}

		System.out.println(reverse);
	}

	public static void main(String[] args) {

		StringReverse x = new StringReverse();
		x.reverseLetters();
		x.reverseWords();
	}
}
