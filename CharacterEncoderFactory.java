package encryptdecrypt;

public class CharacterEncoderFactory {

    public static CharacterEncoder createEncoder(String alg, int key) {
        switch (alg) {
            case "unicode":
                return new UnicodeCharacterEncoder(key);
            case "shift":
            default:
                return new ShiftCharacterEncoder(key);
        }
    }
}
