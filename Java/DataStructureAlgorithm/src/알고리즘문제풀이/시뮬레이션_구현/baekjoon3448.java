package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;

public class baekjoon3448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int totalCnt = 0;
            int recognizedCnt = 0;

            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                for (int j = 0; j < line.length(); j++) {
                    char ch = line.charAt(j);
                    totalCnt++;
                    if (ch != '#') {
                        recognizedCnt++;
                    }
                }
            }

            double ratio = (double) recognizedCnt * 100.0 / totalCnt;

            ratio = Math.round(ratio * 10.0) / 10.0;

            if (ratio == (int) ratio) {
                bw.write("Efficiency ratio is " + (int) ratio + "%.\n");
            } else {
                bw.write("Efficiency ratio is " + String.format("%.1f", ratio) + "%.\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}