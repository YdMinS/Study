package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon15819 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int o = Integer.parseInt(st.nextToken());
        String[] strArr = new String[N];
        for(int i=0; i<N; i++){
            strArr[i] = br.readLine();
        }
        Arrays.sort(strArr);
        System.out.println(strArr[o-1]);
    }
}
