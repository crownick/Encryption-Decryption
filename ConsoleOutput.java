package encryptdecrypt;

import java.io.PrintWriter;

public class ConsoleOutput extends Output {

    @Override
    public PrintWriter getWriter() {
        return new PrintWriter(System.out);
    }
}
