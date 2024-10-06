package 알고리즘문제풀이.기하;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon3009 {
    static Map<Integer, Integer> x = new HashMap();
    static Map<Integer, Integer> y = new HashMap();
    static int X, Y;

    public static void main(String[] args) throws IOException{
        input();
        execute();
        System.out.println(X+" "+Y);
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(x.containsKey(a)){
                x.remove(a);
                x.put(a, 2);
            } else {
                x.put(a, 1);
            }
            if(y.containsKey(b)){
                y.remove(b);
                y.put(b, 2);
            } else {
                y.put(b, 1);
            }
        }
    }

    private static void execute() {
        for(int xKey : x.keySet()){
            int value = x.get(xKey);
            if(value==1) {
                X=xKey;
                break;
            }
        }
        for(int yKey : y.keySet()){
            int value = y.get(yKey);
            if(value==1){
                Y=yKey;
                break;
            }
        }
    }
}
