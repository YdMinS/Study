package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon30034 {
    static Set<Character> separator = new HashSet();
    static Set<Character> connector = new HashSet();
    static List<String> strList = new ArrayList();
    static List<String> result = new ArrayList();

    public static void main(String[] args) throws IOException {
        input();
        execute();
        output();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            separator.add(st.nextToken().charAt(0));
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            separator.add(st.nextToken().charAt(0));
        }
        int K = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            connector.add(st.nextToken().charAt(0));
        }
        br.readLine();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            strList.add(st.nextToken());
        }
    }

    private static void execute(){
        for(int i=0; i<strList.size(); i++){
            String str = strList.get(i);
            int lastIndex = 0;
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(separator.contains(ch) && !connector.contains(ch)){
                    String strToAdd = str.substring(lastIndex, j);
                    if(!strToAdd.isEmpty()) {
                        result.add(str.substring(lastIndex, j));
                    }
                    lastIndex = j+1;
                }
            }
            if(lastIndex!= str.length()) {
                result.add(str.substring(lastIndex));
            }
        }
    }

    private static void output() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i< result.size(); i++){
            bw.write(result.get(i));
            if(i<result.size()-1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}