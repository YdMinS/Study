package 알고리즘문제풀이.정렬;

import java.util.*;
import java.io.*;

public class baekjoon2628 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        List<Integer> xCut = new ArrayList();
        List<Integer> yCut = new ArrayList();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(st.nextToken());
            int cut = Integer.parseInt(st.nextToken());
            if(direction==0){
                yCut.add(cut);
            } else {
                xCut.add(cut);
            }
        }
        xCut.add(0);
        yCut.add(0);
        xCut.add(N);
        yCut.add(M);
        Collections.sort(xCut);
        Collections.sort(yCut);
        int max = 0;
        for(int i=1; i<xCut.size(); i++){
            for(int j=1; j<yCut.size(); j++){
                int x = xCut.get(i)-xCut.get(i-1);
                int y = yCut.get(j)-yCut.get(j-1);
                max = Math.max(max, x*y);
            }
        }
        System.out.println(max);
    }
}
