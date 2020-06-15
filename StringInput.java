package encryptdecrypt;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class StringInput extends Input {

    private final String text;

    public StringInput(String text) {
        this.text = text;
    }

    @Override
    public InputStream getInputStream() {
        return new ByteArrayInputStream(text.getBytes(UTF_8));
    }
}
