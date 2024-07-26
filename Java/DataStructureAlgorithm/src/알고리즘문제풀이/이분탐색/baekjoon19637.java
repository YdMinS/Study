package 알고리즘문제풀이.이분탐색;

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon19637 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder stb = new StringBuilder();
    static int N, M;
    static String[] strMap;
    static int[] numMap;

    static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        strMap = new String[N];
        numMap = new int[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            strMap[i] = st.nextToken();
            numMap[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void execute() throws IOException{
        int power;
        for(int i=0; i<M; i++){
            power = Integer.parseInt(br.readLine());
            stb.append(strMap[findIndex(power)]+"\n");
        }
        System.out.println(stb.toString());
    }

    static int findIndex(int power){
        int left = 0;
        int right = numMap.length;
        while(left < right){
            int mid = (left + right)/2;
            if(numMap[mid] >= power){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) throws IOException {
        input();
        execute();
    }
}
