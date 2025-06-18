package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2959 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> numList = new ArrayList<>();
        while(st.hasMoreTokens()){
            numList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(numList);
        System.out.println(numList.get(0) * (Math.min(numList.get(3), numList.get(2))));
    }
}
