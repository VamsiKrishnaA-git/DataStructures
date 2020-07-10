public class Trie {

    private TrieNode root;
    Trie(){
        root = new TrieNode();
    }

    public TrieNode getNode(){
        return root;
    }
    public void insert(String key){
        if(key == "null"){
            return;
        }

        key = key.toLowerCase();
        TrieNode currNode = this.root;
        if(key != null){
            for(int i=0;i<key.length();i++){
                int index = key.charAt(i)-'a';
                if(currNode.child[index] == null){
                    TrieNode newNode = new TrieNode();
                    currNode.child[index] = newNode;
                }
                currNode = currNode.child[index];
            }
            currNode.isEnd = true;
        }

    }

    public boolean search(String key){
        if(key == null){
            return false;
        }
        key = key.toLowerCase();
        TrieNode currNode = this.root;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i)-'a';
            if(currNode.child[index] == null)
                return false;
            currNode = currNode.child[index];
        }
        return (currNode != null && currNode.isEnd);
    }

    public TrieNode delete(TrieNode root,String key,int i){

        //TrieNode node = root;
        if(key == null || search(key)!=true)
            return null;
        if(i == key.length()){
            root.isEnd = false;
            if(isEmpty(root)){
                root = null;
            }
            return root;
        }
        int index = key.charAt(i) - 'a';
        root.child[index] = delete(root.child[index],key,i+1);
        if(isEmpty(root) && !root.isEnd)
            root = null;

        return root;
    }

    public boolean isEmpty(TrieNode root){
        for(int i=0;i<26;i++){
            if(root.child[i] == null)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        Trie obj = new Trie();
        obj.insert("geeks");
        obj.insert("geek");
        obj.insert("ball");
        System.out.println(obj.search("geeks"));
        System.out.println(obj.search("ball"));System.out.println(obj.search("geek"));
        System.out.println(obj.search("ge"));
        TrieNode node = obj.root;
        System.out.println(obj.delete(node,"ball",0));
        System.out.println(obj.search("ball"));



    }
}
