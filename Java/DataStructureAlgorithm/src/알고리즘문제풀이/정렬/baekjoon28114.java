package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon28114{
    static PriorityQueue<Member> memberQueue= new PriorityQueue<>();
    static PriorityQueue<Integer> yearQueue = new PriorityQueue<>();

    static class Member implements Comparable<Member>{
        int score;
        String firstLetter;

        public Member(int score, String firstLetter){
            this.score = score;
            this.firstLetter = firstLetter;
        }

        @Override
        public int compareTo(Member other){
            return other.score-this.score;
        }

    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int score = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken())%100;
            String firstLetter = st.nextToken().substring(0,1);
            memberQueue.offer(new Member(score, firstLetter));
            yearQueue.offer(year);
        }
    }

    private static void execute(){
        int nameFromYear = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<3; i++){
            nameFromYear = nameFromYear*100+yearQueue.poll();
            stringBuilder.append(memberQueue.poll().firstLetter);
        }
        System.out.println(nameFromYear);
        System.out.println(stringBuilder);
    }
}
