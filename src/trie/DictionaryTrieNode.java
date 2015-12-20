package trie;

/**
 * Created by safwanx on 12/20/15.
 */
public class DictionaryTrieNode<V> {

        private V value;
        private DictionaryTrieNode[] child = new DictionaryTrieNode[26];
        private boolean isAWord;

    public DictionaryTrieNode(V value)
    {
        this.value = value;
        this.isAWord = false;
    }

    public void setIsAWord(boolean isAWord)
    {
        this.isAWord = isAWord;
    }

    public boolean isAWord()
    {
        return isAWord;
    }

    public void setValue(V value)
    {
        this.value = value;
    }

    public V getValue()
    {
        return value;
    }

    protected DictionaryTrieNode setChild(Character label)
    {
        short index = (short)(label - 'a');

        if(child[index] == null)
        {
            child[index] = new DictionaryTrieNode(null);
        }
        return child[index];
    }

    protected DictionaryTrieNode getChild(Character label)
    {
        short index = (short)(label - 'a');
        return child[index];
    }
}
