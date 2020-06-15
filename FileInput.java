package encryptdecrypt;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInput extends Input {

    private final String filePath;

    public FileInput(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public InputStream getInputStream() {
        try {
            return new FileInputStream(filePath);
        } catch (Exception ex) {
            throw new RuntimeException("error during get source from file: " + filePath);
        }
    }
}
