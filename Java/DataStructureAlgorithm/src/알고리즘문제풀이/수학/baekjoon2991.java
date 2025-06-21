package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2991 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int A, B, C, D;
    static List<Integer> visitingTime = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        execute();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            visitingTime.add(Integer.parseInt(st.nextToken()));
        }
    }

    private static void execute() throws IOException{
        int length = visitingTime.size();
        for(int i=0; i<length; i++){
            bw.write(String.valueOf(howManyDogsAggressive(visitingTime.get(i))));
            if(i<length-1) bw.newLine();
        }
    }

    private static int howManyDogsAggressive(int time) {
        int result = 0;
        int forA = time%(A+B);
        int forB = time%(C+D);
        if(forA>0 && forA<=A){
            result++;
        }
        if(forB>0 && forB<=C){
            result++;
        }
        return result;
    }
}
