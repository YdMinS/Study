package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon11256 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int boxCase = Integer.parseInt(st.nextToken());
            int boxCnt = 0;
            List<Integer> list = new ArrayList();
            for(int j=0; j<boxCase; j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list.add(a*b);
            }
            Collections.sort(list, Collections.reverseOrder());
            for(int j=0; j<boxCase; j++){
                candy -= list.get(j);
                boxCnt++;
                if(candy<=0){
                    bw.write(boxCnt+"\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
