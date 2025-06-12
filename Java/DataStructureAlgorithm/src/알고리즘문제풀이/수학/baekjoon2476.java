package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2476 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int price = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> numList = new ArrayList<>();
            List<Integer> cntList = new ArrayList<>();
            int subTotalPrice = 0;
            int cntMax = 0;
            while(st.hasMoreTokens()){
                int n = Integer.parseInt(st.nextToken());
                if(numList.contains(n)){
                    int index = numList.indexOf(n);
                    int cnt = cntList.get(index)+1;
                    cntList.remove(index);
                    cntList.add(index, cnt);
                    cntMax = Math.max(cntMax, cnt);
                }
                numList.add(n);
                cntList.add(1);
            }
            if(cntMax == 3){
                subTotalPrice = 10000 + numList.get(0) * 1000;
            } else if (cntMax == 2){
                int index = cntList.indexOf(2);
                subTotalPrice = 1000 + numList.get(index) * 100;
            } else {
                Collections.sort(numList, Collections.reverseOrder());
                subTotalPrice = 100 * numList.get(0);
            }
            price = Math.max(price,subTotalPrice);
        }
        System.out.println(price);
    }
}
