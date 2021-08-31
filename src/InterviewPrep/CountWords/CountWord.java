package InterviewPrep.CountWords;

/**
 * Created by kedar on 8/31/2021.
 */
public class CountWord {
    public int countWord(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        CountWord countWord = new CountWord();
        System.out.println(countWord.countWord("This is temple"));
    }
}

