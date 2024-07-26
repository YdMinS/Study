package 알고리즘문제풀이.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2512 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int[] map;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            map[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
    }

    static void execute(){
        if(isAllPossible()){
            return;
        }
        int middleValue = M/N;
        if(isAllImpossible(middleValue)){
            return;
        }
        if(isAllImpossible(middleValue+1)){
            return;
        }
        int middleSum = M;
        int size = N;
        for(int i: map){
            if(i<=middleValue){
                middleSum -= i;
                size--;
            }
        }
        System.out.println(middleSum/size);
    }

    static boolean isAllPossible(){
        int sum = 0;
        for(int i: map){
            sum+=i;
        }
        if(sum <= M){
            printMax();
            return true;
        }
        return false;
    }

    static void printMax(){
        int max = Integer.MIN_VALUE;
        for(int i:map){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }

    static boolean isAllImpossible(int middleValue){
        for(int i: map){
            if(i < middleValue){
                return false;
            }
        }
        System.out.println(M/N);
        return true;
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
