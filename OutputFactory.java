package encryptdecrypt;

public class OutputFactory {

    public static Output create(String filePath) {
        if (filePath != null) {
            return new FileOutput(filePath);
        } else {
            return new ConsoleOutput();
        }
    }

}
