package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon25325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] surveyArr = new String[N][3];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++) {
                surveyArr[i][j] = st.nextToken();
            }
        }
        for (int i=0; i<M; i++) {
            String[] reference = br.readLine().split(" ");
            int cnt = 0;
            for (String[] surveyResult : surveyArr) {
                boolean allCorrect = true;
                for (int j=0; j<3; j++) {
                    if(reference[j].equals("-")) continue;
                    if(!surveyResult[j].equals(reference[j])) {
                        allCorrect = false;
                        break;
                    }
                }
                if(allCorrect) cnt++;
            }
            bw.write(cnt+"");
            if (i<M-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
