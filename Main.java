package encryptdecrypt;

public class Main {

    public static void main(String[] args) {
        ArgsExtractor argsExtractor = new ArgsExtractor(args);

        String text = argsExtractor.getArgValue("-data", null);
        String inputFilePath = argsExtractor.getArgValue("-in", "");
        String outputFilePath = argsExtractor.getArgValue("-out", "");
        String mode = argsExtractor.getArgValue("-mode", "enc");
        int key = argsExtractor.getArgValue("-key", 0);
        String alg = argsExtractor.getArgValue("-alg", "");

        EncoderProcessor encoderProcessor = new EncoderProcessor();
        encoderProcessor.setEncoder(CharacterEncoderFactory.createEncoder(alg, "enc".equals(mode) ? key : -key));
        encoderProcessor.setInput(InputFactory.create(text, inputFilePath));
        encoderProcessor.setOutput(OutputFactory.create(outputFilePath));
        encoderProcessor.run();
    }
}
