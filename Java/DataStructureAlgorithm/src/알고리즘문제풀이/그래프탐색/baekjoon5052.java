package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon5052 {
    static class TrieNode{
        Map<Character, TrieNode> children;
        boolean isEndOfWord;

        TrieNode(){
            children = new HashMap();
            isEndOfWord = false;
        }
    }

    static class Trie{
        TrieNode root;

        Trie(){
            root = new TrieNode();
        }

        public boolean insert(String word){
            TrieNode current = root;
            for(int i=0; i<word.length(); i++){
                char ch = word.charAt(i);
                TrieNode node = current.children.get(ch);
                if(node == null){
                    node = new TrieNode();
                    current.children.put(ch, node);
                }
                current = node;
                if(current.isEndOfWord){
                    return false;
                }
            }
            current.isEndOfWord = true;
            return current.children.isEmpty();
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            String[] phoneNumbers = new String[n];
            for(int i=0; i<n; i++){
                phoneNumbers[i] = br.readLine();
            }
            Arrays.sort(phoneNumbers);
            Trie trie = new Trie();
            boolean isConsistent = true;
            for(String number : phoneNumbers){
                if(!trie.insert(number)){
                    isConsistent = false;
                    break;
                }
            }
            System.out.println(isConsistent ? "YES" : "NO");
        }
    }
}
