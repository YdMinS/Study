package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon11170 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(""+countZerosBetween(A, B));
            if (i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static int countZerosBetween(int A, int B) {
        int result = 0;
        for(int i=A; i<=B; i++){
            int num = i;
            if(num == 0) {
                result++;
                continue;
            }
            while(num!=0){
                int rest = num % 10;
                if (rest == 0) result++;
                num /= 10;
            }
        }
        return result;
    }
}
