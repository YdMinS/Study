package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2997 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int ab = list.get(1)-list.get(0);
        int bc = list.get(2)-list.get(1);
        if(ab == bc) {
            System.out.println(list.get(2) + ab);
        } else {
            if(ab > bc){
                System.out.println(list.get(0) + bc);
            } else {
                System.out.println(list.get(1) + ab);
            }
        }
    }
}
