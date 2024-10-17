package 알고리즘문제풀이.정렬;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon27522 {
    static int[] scoreArr = {0, 10, 8, 6, 5, 4, 3, 2, 1};
    static PriorityQueue<Racer> pq = new PriorityQueue<Racer>();
    static Team redTeam, blueTeam;

    static class Racer implements Comparable<Racer>{
        int time;
        String team;

        public Racer(int time, String team){
            this.time = time;
            this.team = team;
        }

        @Override
        public int compareTo(Racer other){
            return this.time-other.time;
        }
    }

    static class Team implements Comparable<Team>{
        int score = 0;
        int bestRank = Integer.MAX_VALUE;

        public Team(){}

        public void addScore(int rank){
            this.score += scoreArr[rank];
            this.bestRank = Math.min(this.bestRank, rank);
        }

        @Override
        public int compareTo(Team other){
            if(this.score == other.score){
                return Integer.compare(other.bestRank, this.bestRank);
            }
            return Integer.compare(this.score, other.score);
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
        output();
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0; i<8; i++){
            st = new StringTokenizer(br.readLine());
            String record = st.nextToken();
            String team = st.nextToken();
            String time = record.replace(":", "");
            int calculatedTime = Integer.parseInt(time);
            pq.offer(new Racer(calculatedTime, team));
        }
    }

    private static void execute(){
        redTeam = new Team();
        blueTeam = new Team();
        int index = 1;
        while(!pq.isEmpty()){
            Racer racer = pq.poll();
            if(racer.team.equals("R")){
                redTeam.addScore(index);
            } else {
                blueTeam.addScore(index);
            }
            index++;
        }
    }

    private static void output(){
        if(redTeam.compareTo(blueTeam)>0){
            System.out.println("Red");
        } else {
            System.out.println("Blue");
        }
    }
}
