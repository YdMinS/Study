package 알고리즘문제풀이.기하;

import java.util.*;
import java.lang.*;
import java.io.*;

public class baekjoon5073 {
    static List<int[]> list = new ArrayList();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        execute();
        bw.flush();
        bw.close();
    }

    private static void execute() throws IOException{
        int[] map = readNumbers();
        while(map[0]!=0 && map[1]!=0 && map[2]!=0){
            int a = map[0];
            int b = map[1];
            int c = map[2];
            if(c<a+b){
                if(a==b && b==c && c==a){
                    bw.append("Equilateral\n");
                } else if(a==b || b==c || c==a){
                    bw.append("Isosceles\n");
                } else {
                    bw.append("Scalene\n");
                }
            } else {
                bw.append("Invalid\n");
            }
            map = readNumbers();
        }
    }

    private static int[] readNumbers() throws IOException{
        st = new StringTokenizer(br.readLine());
        int[] result = new int[3];
        result[0] = Integer.parseInt(st.nextToken());
        result[1] = Integer.parseInt(st.nextToken());
        result[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(result);
        return result;
    }
}
