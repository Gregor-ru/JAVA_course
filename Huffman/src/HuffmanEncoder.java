import java.util.Map;

public class HuffmanEncoder {
    private final Map<Character, String> huffmanCodes;

    public HuffmanEncoder(HuffmanTree huffmanTree) {
        this.huffmanCodes = huffmanTree.getHuffmanCodes();
    }

    public String encode(String text) {
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(huffmanCodes.get(c));
        }
        return encodedText.toString();
    }
}