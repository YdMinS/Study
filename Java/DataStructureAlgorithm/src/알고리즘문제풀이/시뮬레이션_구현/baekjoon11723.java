package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon11723 {
    private static Set<Integer> S = new HashSet<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operator = st.nextToken();
            if(operator.equals("all")){
                for(int j=1; j<=20; j++){
                    S.add(j);
                }
                continue;
            } else if(operator.equals("empty")){
                S.clear();
                continue;
            }
            int n = Integer.parseInt(st.nextToken());
            switch (operator){
                case "add":
                    S.add(n);
                    break;
                case "remove":
                    S.remove(n);
                    break;
                case "check":
                    bw.write(S.contains(n) ? "1" : "0");
                    if(i<N-1) bw.newLine();
                    break;
                case "toggle":
                    if(S.contains(n)){
                        S.remove(n);
                    } else {
                        S.add(n);
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
