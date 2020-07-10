public class TrieNode {
    TrieNode child[];
    static int childszise = 26;
    boolean isEnd;

    TrieNode(){
        this.child = new TrieNode[childszise];
        this.isEnd = false;
    }


}
