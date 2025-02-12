package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon7568 {
    private static class Spec implements Comparable<Spec> {
        int weight;
        int height;

        Spec(int weight, int height){
            this.weight = weight;
            this.height = height;
        }

        @Override
        public int compareTo(Spec other){
            if(this.weight - other.weight > 0 && this.height - other.height>0){
                return 1;
            } else if (this.weight - other.weight <0 && this.height - other.height<0){
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Spec[] list = new Spec[N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            list[i] = new Spec(weight, height);
        }
        for(int i=0; i<N; i++){
            int rank = 1;
            Spec me = list[i];
            for(int j=0; j<N; j++){
                if(i==j) continue;
                Spec you = list[j];
                if(you.compareTo(me)>0) rank++;
            }
            bw.write(rank+(i<N-1 ? " ": ""));
        }
        bw.close();
    }
}
