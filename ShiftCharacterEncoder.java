package encryptdecrypt;

public class ShiftCharacterEncoder extends CharacterEncoder {

    private final static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private final static String alphabet2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public ShiftCharacterEncoder(int key) {
        super(key);
    }

    @Override
    public char encode(char ch) {
        if (alphabet.contains(Character.toString(ch))) {
            return encode(ch, 97, 122);
        } else if (alphabet2.contains(Character.toString(ch))) {
            return encode(ch, 65, 90);
        } else {
            return ch;
        }
    }

    private char encode(char ch, int left, int right) {
        int k = key;
        int inc = k > 0 ? 1 : -1;
        char result = ch;
        while (k != 0) {
            k -= inc;
            result = (char) (result + inc);
            if (result > right) {
                result = (char) left;
            } else if (result < left) {
                result = (char) right;
            }
        }
        return result;
    }
}
