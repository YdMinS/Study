package 알고리즘문제풀이.수학;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon2581 {
    static int N, M;
    static LinkedList<Integer> primeNumber = new LinkedList<>();
    static HashMap<Integer, Boolean> notPrime = new HashMap<>();

    public static void main(String[] args) throws IOException{
        input();
        preSet();
        execute();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
    }

    private static void preSet(){
        for(int i=2; i<=M; i++){
            if(notPrime.get(i) != null) {
                continue;
            }
            primeNumber.add(i);
            int num = i*2;
            while(num <=M) {
                notPrime.put(num, true);
                num += i;
            }
        }
    }

    private static void execute(){
        int min = -1;
        int sum = 0;
        for(int i : primeNumber){
            if(i>=N){
                sum += i;
                if(min == -1) min = i;
            }
        }
        if(sum!=0){
            System.out.println(sum);
        }
        System.out.println(min);
    }
}
