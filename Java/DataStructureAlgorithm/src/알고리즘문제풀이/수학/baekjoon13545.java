//package 알고리즘문제풀이.수학;
//
//import java.lang.*;
//import java.io.*;
//import java.util.*;
//
//public class baekjoon13545 {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static StringBuilder stringBuilder = new StringBuilder();
//    static StringTokenizer st;
//    static int N, Q;
//    static int[] map;
//    static int[][] sum, query;
//
//    public static void main(String[] args) throws IOException{
//        input();
//        execute();
//        System.out.println(stringBuilder);
//    }
//
//    private static void input() throws IOException{
//        N = Integer.parseInt(br.readLine());
//        map = new int[N+1];
//        sum = new int[N+1][N+1];
//        st = new StringTokenizer(br.readLine());
//        for(int i=1; i<=N; i++){
//            map[i] = Integer.parseInt(st.nextToken());
//            for(int j=i; i<=N; i++){
//                sum[i][j] += map[i];
//            }
//        }
//
//        Q = Integer.parseInt(br.readLine());
//        query = new int[Q][2];
//        for(int i=0; i<Q; i++){
//            st = new StringTokenizer(br.readLine());
//            query[i][0] = Integer.parseInt(st.nextToken());
//            query[i][1] = Integer.parseInt(st.nextToken());
//        }
//    }
//
//    private static void execute(){
//        for(int i=0; i<Q; i++) {
//            int from = query[i][0];
//            int to = query[i][1];
//            int max = 0;
//            for(int k=to; k>from; k--) {
//                for (int j = from; j < to; j++) {
//                    if (sum[k] - sum[j - 1] == 0) {
//                        max = Math.max(max, k - j + 1);
//                    }
//                }
//            }
//            stringBuilder.append(max+"\n");
//        }
//    }
//}
