package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon1620 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N, T;
    private static Map<String, Integer> byName = new HashMap<>();
    private static String[] byNumber;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        byNumber = new String[N+1];
        for(int i=1; i<=N; i++){
            String name = br.readLine();
            byName.put(name, i);
            byNumber[i] = name;
        }
    }

    private static void execute() throws IOException{
        for(int i=0; i<T; i++){
            String info = br.readLine();
            try {
                int num = Integer.parseInt(info);
                bw.write(byNumber[num]);
            } catch (NumberFormatException e){
                bw.write(String.valueOf(byName.get(info)));
            }
            if(i<T-1) bw.newLine();
        }
    }
}
