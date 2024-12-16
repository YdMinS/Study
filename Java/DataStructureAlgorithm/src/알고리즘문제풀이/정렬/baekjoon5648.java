package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon5648 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<Long> list = new ArrayList();
        while(list.size()<N){
            if (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            if (st.hasMoreTokens()) {
                String reversed = new StringBuilder(st.nextToken()).reverse().toString();
                list.add(Long.parseLong(reversed));
            }
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
