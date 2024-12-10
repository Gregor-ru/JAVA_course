import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Main <encode/decode> <input file> <output file>");
            return;
        }

        String command = args[0];
        String inputFilePath = args[1];
        String outputFilePath = args[2];

        try {
            HuffmanFileIO fileIO = new HuffmanFileIO();
            String content = fileIO.readFile(inputFilePath);
            HuffmanTree huffmanTree = new HuffmanTree();
            huffmanTree.buildTree(content);

            if (command.equalsIgnoreCase("encode")) {
                HuffmanEncoder encoder = new HuffmanEncoder(huffmanTree);
                String encodedText = encoder.encode(content);
                String serializedTree = huffmanTree.serialize();

                fileIO.writeFile(outputFilePath, serializedTree + "\n" + encodedText);
                System.out.println("File encoded successfully.");

            } else if (command.equalsIgnoreCase("decode")) {
                String encodedContent = fileIO.readFile(inputFilePath);
                String[] parts = encodedContent.split("\n", 2);
                String serializedTree = parts[0];
                String encodedText = parts[1];

                huffmanTree.deserialize(serializedTree);

                HuffmanDecoder decoder = new HuffmanDecoder(huffmanTree);
                String decodedText = decoder.decode(encodedText);
                fileIO.writeFile(outputFilePath, decodedText);
                System.out.println("File decoded successfully.");

            } else {
                System.out.println("Unknown command: " + command);
            }

        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }
}