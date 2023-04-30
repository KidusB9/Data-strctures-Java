import java.util.Scanner;

public class Dictionary {
    private Node root;

    // inner class to represent a node in the tree
    private class Node {
        String word;
        String definition;
        Node left;
        Node right;
        public Node(String word, String definition) {
            this.word = word;
            this.definition = definition;
        }
    }

    // method to add a new word and definition to the dictionary
    public void addWord(String word, String definition) {
        root = addWordRecursive(root, word, definition);
    }

    private Node addWordRecursive(Node current, String word, String definition) {
        if (current == null) {
            return new Node(word, definition);
        }
        if (word.compareTo(current.word) < 0) {
            current.left = addWordRecursive(current.left, word, definition);
        } else if (word.compareTo(current.word) > 0) {
            current.right = addWordRecursive(current.right, word, definition);
        } else {
            // word already exists in the dictionary, update the definition
            current.definition = definition;
        }
        return current;
    }

    // method to search for a word in the dictionary
    public String searchWord(String word) {
        Node result = searchWordRecursive(root, word);
        if (result == null) {
            return "Word not found";
        }
        return result.definition;
    }

    private Node searchWordRecursive(Node current, String word) {
        if (current == null) {
            return null;
        }
        if (word.compareTo(current.word) == 0) {
            return current;
        }
        if (word.compareTo(current.word) < 0) {
            return searchWordRecursive(current.left, word);
        } else {
            return searchWordRecursive(current.right, word);
        }
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("cat", "a small domestic animal");
        dictionary.addWord("dog", "a domestic animal kept for companionship or protection");
        dictionary.addWord("bird", "a warm-blooded egg-laying vertebrate distinguished by the possession of feathers");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to search for in the dictionary: ");
        String word = scanner.nextLine();
        String definition = dictionary.searchWord(word);
        System.out.println(definition);

        // check if a word is spelled correctly
        if (definition.equals("Word not found")) {
            System.out.println("Incorrect spelling");
        } else {
            System.out.println("Correct spelling");
        }
    }
}
