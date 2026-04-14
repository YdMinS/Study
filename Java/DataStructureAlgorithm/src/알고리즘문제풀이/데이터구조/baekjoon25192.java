package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String ENTER = "ENTER";
        HashSet<String> enteredMemberList = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        int numOfGomgomti = 0;
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            if (input.equals(ENTER)) {
                numOfGomgomti += enteredMemberList.size();
                enteredMemberList.clear();
                continue;
            }
            enteredMemberList.add(input);
        }
        numOfGomgomti += enteredMemberList.size();
        System.out.println(numOfGomgomti);
    }
}
