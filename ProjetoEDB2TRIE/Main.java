import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		TrieTree trieTree = new TrieTree();
        try {
            Scanner Test = new Scanner(new File(args[0]));
            while (Test.hasNextLine()) {
                trie.insert(Test.nextLine());
            }
            Test.close();
        }
        }
        if (args.length == 3) {
            trie.autoComplete(args[1], Integer.parseInt(args[2]));
        } 
        else{
            trie.autoComplete(args[1]);
        }
    }

}