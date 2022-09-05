package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))){
                System.out.println("wrong alphabet!");
            } else {
                if (character == 'a' || character == 'e' ||
                        character == 'o' || character == 'i' ||
                        character == 'u' || character == 'y'
                || character == 'A' || character == 'E' ||
                        character == 'O' || character == 'I' ||
                        character == 'U' || character == 'Y') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            }
    }
}
