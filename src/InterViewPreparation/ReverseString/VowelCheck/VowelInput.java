package InterViewPreparation.ReverseString.VowelCheck;

/**
 * Created by kedar on 5/20/2021.
 */
public class VowelInput {

    public boolean checkVowel(String text) {
        if (text == null)
            throw new IllegalArgumentException("Cannot be null");

        return text.toLowerCase().matches(".*[aeiou].*");
    }
}
