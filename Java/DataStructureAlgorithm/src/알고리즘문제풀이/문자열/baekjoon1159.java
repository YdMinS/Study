package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon1159 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder playerEntry = new StringBuilder();
        Map<Character, Integer> playerMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            char playerCh = br.readLine().charAt(0);
            playerMap.put(playerCh, playerMap.getOrDefault(playerCh, 0)+1);
        }
        List<Character> player = new ArrayList<>(playerMap.keySet());
        Collections.sort(player);
        for(char ch : player){
            if(playerMap.get(ch)>=5){
                playerEntry.append(ch);
            }
        }
        System.out.println(playerEntry.length() == 0 ? "PREDAJA" : playerEntry);
    }
}
