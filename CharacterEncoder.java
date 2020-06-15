package encryptdecrypt;

public abstract class CharacterEncoder {

    protected int key;

    public CharacterEncoder(int key) {
        this.key = key;
    }

    abstract char encode(char ch);

}
