public class HuffmanDecoder {
    private final HuffmanNode root;

    public HuffmanDecoder(HuffmanTree huffmanTree) {
        this.root = huffmanTree.getRoot();
    }

    public String decode(String encodedText) {
        StringBuilder decodedText = new StringBuilder();
        HuffmanNode current = root;

        for (int i = 0; i < encodedText.length(); i++) {
            char bit = encodedText.charAt(i);
            current = (bit == '0') ? current.left : current.right;

            if (current.left == null && current.right == null) {
                decodedText.append(current.character);
                current = root;
            }
        }

        return decodedText.toString();
    }
}