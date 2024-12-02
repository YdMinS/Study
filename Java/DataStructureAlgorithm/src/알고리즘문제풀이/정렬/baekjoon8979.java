package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon8979 {

    static class Country{
        int country;
        int gold;
        int silver;
        int bronze;

        public Country(int country, int gold, int silver, int bronze){
            this.country = country;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Country> ranking = new ArrayList();
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ranking.add(new Country(c,g,s,b));
        }
        Collections.sort(ranking, (a,b)->{
            if(a.gold != b.gold) return b.gold - a.gold;
            if(a.silver != b.silver) return b.silver - a.silver;
            return b.bronze - a.bronze;
        });
        int rank = 1;
        int sameRankCount = 1;
        for(int i=0; i<N; i++){
            if(i>0) {
                Country prev = ranking.get(i-1);
                Country curr = ranking.get(i);
                if(prev.gold==curr.gold && prev.silver==curr.silver && prev.bronze==curr.bronze){
                    sameRankCount++;
                } else {
                    rank += sameRankCount;
                    sameRankCount = 1;
                }
            }
            if(ranking.get(i).country == K){
                System.out.println(rank);
                return;
            }
        }
    }
}
