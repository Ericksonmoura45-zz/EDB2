import java.util.*;

public class TreeTrie {

	private NodeTrie root;
	private List<String> wordList = new ArrayList<>();
	public TreeTrie() {
		root = new NodeTrie();
	}
	public boolean search(String word) {
		
		HashMap<CurrentChar, NodeTrie> child = root.getChild();

		NodeTrie nodeTrie = null;
		
		for(int i = 0; i < word.length(); i++) {
			char ActuallyChar = word.charAt(i);
			
			if(child.containsKey(ActuallyChar)) {
				node = child.get(ActuallyChar);
				child = node.getChild();
			} 
			else{ 
				nodeTrie = null;
				break;
			}
		}
		if(nodeTrie != null && nodeTrie.isWord()) {
			return true;
		} 
		else{
			return false;
		}
	}
    public List<String> autoComplete(String word) {
        NodeTrie NewNode = GotchaNode(word);
        List<String> HereIam;
        HereIam = getWords(NewNode);
        System.out.println(HereIam);
        return HereIam;
    }
    // I guess it's not work correctly
    /* public List<String> autoComplete(String word, int Completing) {
        NodeTrie BuildWords = GotchaNode(word);
        List<String> out;
        out = getWords(BuildWords);
        for (int i = Completing; i < out.size(); i++) {
            out.remove(i);
        }
        return out;
    }
    */
    public void insert(String word) {

        HashMap <CurrentChar, NodeTrie> child = root.getChild();

        for(int i = 0; i < word.length(); i++) {
            char ActuallyChar = word.charAt(i);

            NodeTrie nodeTrie;

            if(child.containsKey(ActuallyChar)) nodeTrie = child.get(ActuallyChar);
            else{
                nodeTrie = new TrieNode(ActuallyChar);
                child.put(ActuallyChar, nodeTrie);
            }
            child = nodeTrie.getChild();

            if(i == word.length() - 1) {
                nodeTrie.setWord(true);
                nodeTrie.setText(word);

            }
        }
    }
    public void insert(String[] wordList) {
        for (String word : wordList) {
            this.insert(word);
        }
    }
    public NodeTrie GotchaNode(String string) {
        NodeTrie currentNode = root;

        for (int i = 0; i < string.length(); i++) {
            currentChar currentCharacter;
            currentCharacter = string.charAt(i);
            NodeTrie currentCharacterNode = currentNode.getChild().get(currentCharacter);

            if (currentCharacterNode == null) {
                return null;
            }
            currentNode = currentCharacterNode;
        }
        return currentNode;
    }
    public List<String> getWords(NodeTrie currentNode) {
        List<String> results = new ArrayList<>();

        if (currentNode.isWord()) {
            results.add(currentNode.getText());
        }

        if (!currentNode.getChildren().isEmpty()) {
            for (TrieNode child: currentNode.getChild().values()) {
                results.addAll(getWords(child));
            }
        }
    	return results;
    }
    public boolean find(String word) {

        NodeTrie nodeTrie = this.root;
        boolean Gotcha = true;

        for (char ActuallyChar: word.toCharArray()) {
            if (!nodeTrie.getChildren().containsKey(ActuallyChar)) {
                Gotcha = false;
                break;
            }
            nodeTrie = nodeTrie.getChild().get(ActuallyChar);
        }
        return nodeTrie != null && nodeTrie.isWord() && Gotcha;
    }
    public void remove(String word) {

        NodeTrie nodeTrie = this.root;

        if (this.find(word)) {
            for (char character: word.toCharArray()) {
                nodeTrie = nodeTrie.getChild().get(character);
            }
            nodeTrie.setWord(false);
        }
    }
}


   