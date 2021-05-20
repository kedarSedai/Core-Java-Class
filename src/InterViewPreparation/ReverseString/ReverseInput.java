package InterViewPreparation.ReverseString;

/**
 * Created by kedar on 5/20/2021.
 */
public class ReverseInput {
    public String reverseString(String text) throws IllegalArgumentException {
        if (text == null)
            throw new IllegalArgumentException("Argument Cannot be null");

        StringBuilder sb = new StringBuilder();
        char[] chars = text.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
