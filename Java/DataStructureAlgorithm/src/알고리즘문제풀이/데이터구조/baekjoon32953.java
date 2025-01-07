package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon32953 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> attendMap = new HashMap();
        for(int i=0; i<N; i++){
            int numOfStudent = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<numOfStudent; j++){
                String studentId = st.nextToken();
                if(attendMap.containsKey(studentId)){
                    int cnt = attendMap.get(studentId);
                    attendMap.replace(studentId, cnt+1);
                } else {
                    attendMap.put(studentId, 1);
                }
            }
        }
        Set<String> keySet = attendMap.keySet();
        int K = 0;
        for(String key : keySet){
            int n = attendMap.get(key);
            if(n>=M) K++;
        }
        System.out.println(K);
    }
}
