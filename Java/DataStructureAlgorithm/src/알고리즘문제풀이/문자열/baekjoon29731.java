package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon29731 {
    static Set<String> set = new HashSet();
    static {
        set.add("Never gonna give you up");
        set.add("Never gonna let you down");
        set.add("Never gonna run around and desert you");
        set.add("Never gonna make you cry");
        set.add("Never gonna say goodbye");
        set.add("Never gonna tell a lie and hurt you");
        set.add("Never gonna stop");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            if(!set.contains(br.readLine())){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
