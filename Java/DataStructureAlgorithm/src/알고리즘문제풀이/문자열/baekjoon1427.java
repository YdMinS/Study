package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;
import java.lang.*;

public class baekjoon1427 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        String str = br.readLine();
        int N = str.length();
        List<Integer> numList = new ArrayList<>();
        for(int i=0; i<N; i++){
            numList.add(Character.getNumericValue(str.charAt(i)));
        }
        Collections.sort(numList, Collections.reverseOrder());
        for(int i: numList){
            st.append(i);
        }
        System.out.println(st);
    }
}
