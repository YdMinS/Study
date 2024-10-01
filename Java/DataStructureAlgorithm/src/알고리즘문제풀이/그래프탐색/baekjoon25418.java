package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon25418 {
    static int A, K;

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(execute());
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    private static int execute() {
        Queue<Integer> q = new LinkedList<>();
        int[] depth = new int[K+1];
        Arrays.fill(depth, -1);

        q.offer(A);
        depth[A] = 0;

        while(!q.isEmpty()){
            int current = q.poll();

            if(current == K){
                return depth[K];
            }

            if(current+1 <=K && depth[current+1] ==-1){
                q.offer(current+1);
                depth[current+1] = depth[current]+1;
            }

            if(current*2 <=K && depth[current*2] == -1){
                q.offer(current*2);
                depth[current*2] = depth[current]+1;
            }
        }
        return -1;
    }
}
