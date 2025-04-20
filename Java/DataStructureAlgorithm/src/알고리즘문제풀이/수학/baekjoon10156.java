package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon10156 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int breadPrice = Integer.parseInt(st.nextToken());
        int numOfBread = Integer.parseInt(st.nextToken());
        int possibleBudget = Integer.parseInt(st.nextToken());
        int neededPrice = breadPrice * numOfBread - possibleBudget;
        System.out.print(Math.max(neededPrice, 0));
    }
}
