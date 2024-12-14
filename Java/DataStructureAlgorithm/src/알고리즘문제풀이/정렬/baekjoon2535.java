package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon2535 {
    static class Participant implements Comparable<Participant>{
        int nationality;
        int num;
        int score;

        public Participant(int nationality, int num, int score){
            this.nationality = nationality;
            this.num = num;
            this.score = score;
        }

        @Override
        public int compareTo(Participant other){
            return other.score - this.score;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Participant> pq = new PriorityQueue();
        Map<Integer, Integer> map = new HashMap();
        int cnt = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nationality = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            pq.offer(new Participant(nationality, num, score));
        }
        while(cnt<3){
            Participant p = pq.poll();
            int nationality = p.nationality;
            int prizedNum = map.containsKey(nationality) ? map.get(nationality) : 0;
            if(prizedNum<2){
                if(map.containsKey(nationality)) {
                    map.replace(nationality, prizedNum + 1);
                } else {
                    map.put(nationality, 1);
                }
                bw.write(String.format("%d %d\n", p.nationality, p.num));
                cnt++;
            }
        }
        bw.flush();
        bw.close();
    }
}
