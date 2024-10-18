package 알고리즘문제풀이.그리디;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon17224 {
    static PriorityQueue<Problem> pq = new PriorityQueue<>();
    static int N, L, K;

    static class Problem implements Comparable<Problem>{
        int easyScore;
        int hardScore;

        public Problem(int easyScore, int hardScore){
            this.easyScore = easyScore;
            this.hardScore = hardScore;
        }

        @Override
        public int compareTo(Problem other){
            if(this.hardScore == other.hardScore){
                return this.easyScore-other.easyScore;
            }
            return this.hardScore-other.hardScore;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            pq.offer(new Problem(a, b));
        }
     }

     private static int execute(){
        int sum = 0;
        int cnt = 0;
        while(cnt<K && !pq.isEmpty()){
            Problem currentProblem = pq.poll();
            int easyScore = currentProblem.easyScore;
            int hardScore = currentProblem.hardScore;
            if(easyScore<=L){
                sum += 100;
                cnt++;
            }
            if(hardScore<=L){
                sum += 40;
            }
        }
        return sum;
     }
}
