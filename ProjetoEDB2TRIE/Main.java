import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// open e close vistos aqui: https://www.cs.colostate.edu/~cs160/.Spring15/programs/FileInputOutput.html
public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        try {
            Scanner scanner = new Scanner(new File(args[0]));

            while (scanner.hasNextLine()) {
                trie.insert(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        if (args.length == 3) {
            trie.autocomplete(args[1], Integer.parseInt(args[2]));
        } else {
            trie.autocomplete(args[1]);
        }
    }
}