package 알고리즘문제풀이.그리디;

import java.util.*;
import java.io.*;

public class baekjoon27951 {
    static int N, U, D;
    static int restU, restD;
    static int[] hangerNum = new int[4];
    static char[] result;
    static List<Integer> hangerList = new ArrayList();
    static StringBuilder strBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        if(execute()){
            System.out.println("YES");
            output();
        } else {
            System.out.print("NO");
        }
    }

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        result = new char[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int hanger = Integer.parseInt(st.nextToken());
            hangerNum[hanger]++;
            hangerList.add(hanger);
        }
        st = new StringTokenizer(br.readLine());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        restU = U;
        restD = D;
    }

    private static boolean execute(){
        searchFor1and2();
        searchFor3();
        return restU==0 && restD==0;
    }

    private static void searchFor1and2(){
        for(int i=0; i<N; i++){
            int hanger = hangerList.get(i);
            if(hanger == 3) continue;
            if(hanger==1){
                result[i] = 'U';
                restU--;
            } else {
                result[i] = 'D';
                restD--;
            }
        }
    }

    private static void searchFor3(){
        for(int i=0; i<N; i++){
            int hanger = hangerList.get(i);
            if(hanger == 3) {
                if(restU>restD){
                    result[i] = 'U';
                    restU--;
                } else {
                    result[i] = 'D';
                    restD--;
                }
            }
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++){
            bw.write(result[i]+"");
        }
        bw.flush();
        bw.close();
    }
}
