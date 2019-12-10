import java.util.*;

public class TrieNode{
	private boolean isWord;
	private char character;
	private HashMap<Character, TrieNode> children = new HashMap();
	private String text;


	public TrieNode() {} //Construtor padrão
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public TrieNode(char character){
		this.character = character;
	} // Construtor parametrizado
	public HashMap<Character, TrieNode> getChildren(){
		return children;
	}
	public void setChildren(HashMap<Character, TrieNode> children){
		this.children = children;
	} //Árvore
	public boolean isWord(){
		return isWord;
	}
	public void setWord(boolean isWord){
		this.isWord = isWord;
	}


}