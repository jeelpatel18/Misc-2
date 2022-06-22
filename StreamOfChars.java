//Tc : O(N*K) for insert() for Trie and O(1) for query()
//Sc : O(1) as length if stringBuilder will be maxLength of word in words so..

class StreamChecker {
    //We are using suffixes in th TrieNodes means storing the words in reverese in Trie
    
    TrieNode root;
    StringBuilder s;
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        
        public TrieNode(){
            children = new TrieNode[26];
        }        
    }
    public void insert(String s){//Inserting word in Trie in reverese as we have to check for suffixes
        TrieNode curr = root;
        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(curr.children[ch - 'a'] == null) 
                curr.children[ch - 'a'] = new TrieNode();
            
            curr = curr.children[ch - 'a'];
        }
        curr.isEnd = true;
    }
    public StreamChecker(String[] words) {
        root = new TrieNode();
        s = new StringBuilder();
        for(String s : words)   insert(s);
    }
    
    public boolean query(char letter) {
        s.append(letter);
        TrieNode curr = root;
        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(curr.children[ch - 'a'] == null)     return false;
            
            if(curr.children[ch - 'a'].isEnd)   return true;
            
            curr = curr.children[ch - 'a'];
        }
        return false;
    }
}
