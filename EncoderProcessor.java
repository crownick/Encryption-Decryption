package encryptdecrypt;

import java.io.InputStream;
import java.io.PrintWriter;

public class EncoderProcessor {

    private CharacterEncoder encoder;
    private Input input;
    private Output output;

    public void setEncoder(CharacterEncoder encoder) {
        this.encoder = encoder;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public void run() {
        try (InputStream from = input.getInputStream();
            PrintWriter to = output.getWriter()) {
            int ch = from.read();
            while (ch != -1) {
                to.print(encoder.encode((char) ch));
                ch = from.read();
            }
        } catch (Exception ex) {
            System.out.println("encode error: " + ex);
        }
    }
}
