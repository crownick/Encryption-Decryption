package encryptdecrypt;

public class InputFactory {

    public static Input create(String data, String filePath) {
        if (data != null) {
            return new StringInput(data);
        } else if (filePath != null) {
            return new FileInput(filePath);
        } else {
            return new StringInput("");
        }
    }

}
