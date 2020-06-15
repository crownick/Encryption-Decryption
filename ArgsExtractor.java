package encryptdecrypt;

import java.util.Objects;

public class ArgsExtractor {

    private final String[] args;

    public ArgsExtractor(String[] args) {
        this.args = args;
    }

    public int getArgValue(String key, int defaultValue) {
        return Integer.parseInt(getArgValue(key, "" + defaultValue));
    }

    public String getArgValue(String key, String defaultValue) {
        String result = defaultValue;
        for (int i = 0; i < args.length; i++) {
            if (Objects.equals(args[i], key)) {
                result = args[i + 1];
                break;
            }
        }
        return result;
    }
}
