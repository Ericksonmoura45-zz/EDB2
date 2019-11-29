import java.util.*;

public class NodeTrie {
// Atributes
	private boolean isWord;
	private char currentChar;
	private String text;
	private HashMap<CurrentChar, NodeTrie> child = new HashMap();
	private String word;
// Methods
	public NodeTrie() {}
	public void setWord(boolean isWord){
		this.isWord = isWord;
	}
	public HashMap<CurrentChar, NodeTrie> getChild(){
		return child;
	}
	public void setChild(HashMap<CurrentChar, NodeTrie> child){
		this.child = child;
	}
	public boolean isWord(){
		return isWord;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public NodeTrie(char currentChar){
		this.currentChar = currentChar;
	}
	public String getWord() {
        return word;
    }
}