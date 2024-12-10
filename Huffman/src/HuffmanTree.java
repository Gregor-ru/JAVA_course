import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanTree {
    private HuffmanNode root;
    private Map<Character, String> huffmanCodes = new HashMap<>();

    public void buildTree(String text) {
        Map<Character, Integer> frequencyMap = calculateFrequency(text);

        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (queue.size() > 1) {
            HuffmanNode left = queue.poll();
            HuffmanNode right = queue.poll();
            int sum = left.frequency + right.frequency;
            queue.add(new HuffmanNode('\0', sum, left, right));
        }

        root = queue.poll();
        buildCodes(root, "");
    }

    private Map<Character, Integer> calculateFrequency(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

    private void buildCodes(HuffmanNode node, String code) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.character, code);
        }

        buildCodes(node.left, code + '0');
        buildCodes(node.right, code + '1');
    }

    public Map<Character, String> getHuffmanCodes() {
        return huffmanCodes;
    }

    public HuffmanNode getRoot() {
        return root;
    }

    public String serialize() {
        StringBuilder builder = new StringBuilder();
        serializeHelper(root, builder, new StringBuilder());
        return builder.toString();
    }

    private void serializeHelper(HuffmanNode node, StringBuilder builder, StringBuilder code) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            builder.append(node.character).append(':').append(code.toString()).append(';');
        }

        if (node.left != null) {
            code.append('0');
            serializeHelper(node.left, builder, code);
            code.deleteCharAt(code.length() - 1);
        }

        if (node.right != null) {
            code.append('1');
            serializeHelper(node.right, builder, code);
            code.deleteCharAt(code.length() - 1);
        }
    }

    public void deserialize(String data) {
        root = new HuffmanNode('\0', 0);

        for (String entry : data.split(";")) {
            if (entry.isEmpty()) continue; // Игнорировать пустые строки

            String[] parts = entry.split(":");
            if (parts.length < 2) continue; // Убедитесь, что у нас есть оба элемента

            char character = parts[0].charAt(0);
            String path = parts[1];
            insert(character, path);
        }
    }

    private void insert(char character, String path) {
        HuffmanNode current = root;
        for (char direction : path.toCharArray()) {
            if (direction == '0') {
                if (current.left == null) {
                    current.left = new HuffmanNode('\0', 0);
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new HuffmanNode('\0', 0);
                }
                current = current.right;
            }
        }
        current.character = character;
    }
}