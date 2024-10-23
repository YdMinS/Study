package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon1296 {
    static int N;
    static int[] baseCount = new int[4];
    static PriorityQueue<Name> pq = new PriorityQueue<>();

    static class Name implements Comparable<Name>{
        String name;
        int score;

        public Name(String name){
            this.name = name;
            calculateScore(name);
        }

        private void calculateScore(String name){
            int[] count = baseCount.clone();
            for (char c : name.toCharArray()) {
                switch(c){
                    case 'L': count[0]++; break;
                    case 'O': count[1]++; break;
                    case 'V': count[2]++; break;
                    case 'E': count[3]++; break;
                }
            }
            long score = 1;
            for(int i=0; i<3; i++){
                for(int j=i+1; j<4; j++){
                    score *= (count[i]+count[j]);
                }
            }
            this.score = (int)(score%100);
        }

        @Override
        public int compareTo(Name other){
            if(this.score == other.score){
                return this.name.compareTo(other.name);
            }
            return other.score-this.score;
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(pq.poll().name);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String refName = br.readLine();
        countLOVE(refName);
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            pq.offer(new Name(br.readLine()));
        }
    }

    private static void countLOVE(String name) {
        for (char c : name.toCharArray()) {
            switch(c){
                case 'L': baseCount[0]++; break;
                case 'O': baseCount[1]++; break;
                case 'V': baseCount[2]++; break;
                case 'E': baseCount[3]++; break;
            }
        }
    }
}
