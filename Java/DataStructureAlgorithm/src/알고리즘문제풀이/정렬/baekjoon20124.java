package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon20124 {
    static int N;
    static PriorityQueue<Chef> pq = new PriorityQueue<>();

    static class Chef implements Comparable<Chef>{
        String name;
        int voted;

        public Chef(String name, int voted){
            this.name = name;
            this.voted = voted;
        }

        @Override
        public int compareTo(Chef o) {
            if(this.voted==o.voted){
                return this.name.compareTo(o.name);
            } else {
                return o.voted-this.voted;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(pq.poll().name);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            pq.offer(new Chef(st.nextToken(), Integer.parseInt(st.nextToken())));
        }
    }
}
