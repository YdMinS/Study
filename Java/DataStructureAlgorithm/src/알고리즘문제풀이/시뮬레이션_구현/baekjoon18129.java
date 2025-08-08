package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon18129 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken().toLowerCase();
        int K = Integer.parseInt(st.nextToken());
        char previousChar = '-';
        int cnt = 0;
        Set<Character> presentedCharSet = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            if (i==0) {
                previousChar = currentChar;
                cnt++;
            } else {
                if(currentChar == previousChar) cnt++;
                else {
                    if (!presentedCharSet.contains(previousChar)) {
                        presentedCharSet.add(previousChar);
                        sb.append(cnt >= K ? 1 : 0);
                    }
                    previousChar = currentChar;
                    cnt = 1;
                }
            }
            if (i == str.length()-1 && !presentedCharSet.contains(currentChar)) {
                sb.append(cnt >= K ? 1 : 0);
            }
        }
        System.out.println(sb);
    }
}
