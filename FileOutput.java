package encryptdecrypt;

import java.io.PrintWriter;

public class FileOutput extends Output {

    private final String filePath;

    public FileOutput(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public PrintWriter getWriter() {
        try {
            return new PrintWriter(filePath);
        } catch (Exception ex) {
            throw new RuntimeException("error during create target writer for file: " + filePath);
        }
    }
}
