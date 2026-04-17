package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> wordCounter = new HashMap<>();
        for (int i=0; i<N; i++) {
            String word = br.readLine();
            if (word.length() < M) continue;
            if(wordCounter.containsKey(word)) {
                wordCounter.put(word, wordCounter.get(word) + 1);
            } else {
                wordCounter.put(word, 1);
            }
        }
        List<String> wordList = new ArrayList<>(wordCounter.keySet());
        wordList.sort((a, b) -> {
            if (!wordCounter.get(a).equals(wordCounter.get(b))) {
                return wordCounter.get(b) - wordCounter.get(a);
            }
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });
        for (String s : wordList) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
