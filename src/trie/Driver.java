package trie;

import java.io.*;

/**
 * Created by safwanx on 12/20/15.
 */
public class Driver {

    private static DictionaryTrieNode root = new DictionaryTrieNode("root");

    public static void main(String ...args)
    {
        String fileName = null;
        FileInputStream fi = null;

        //Check if a file name is passed in the argument
        if(args.length == 2)
        {
            fileName = args[1];

            //Open the file to read out the data

            try {
                fi = new FileInputStream(fileName);

                //Read the file line by line
                BufferedReader br = new BufferedReader(new InputStreamReader(fi));

                String word;

                while( (word = br.readLine()) != null)
                {
                    addWordToTrie(word);
                }
            }
            catch(IOException ex)
            {
                System.out.print("File Not Found!");
            }


        }
    }

    private static void addWordToTrie(String word) {

        for(int i = 0; i < word.length(); i++)
        {
            root.setChild(word.charAt(i));
        }
    }
}
