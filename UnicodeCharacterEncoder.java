package encryptdecrypt;

public class UnicodeCharacterEncoder extends CharacterEncoder {

    public UnicodeCharacterEncoder(int key) {
        super(key);
    }

    @Override
    public char encode(char ch) {
        int ech = ch + key;
        return (char) ech;
    }
}
