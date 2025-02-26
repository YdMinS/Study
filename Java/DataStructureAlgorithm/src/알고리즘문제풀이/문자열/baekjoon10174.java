package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon10174 {
    private static final String yes = "Yes";
    private static final String no = "No";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine().toLowerCase();
            boolean isNo = false;
            for (int j = 0; j < str.length() / 2; j++) {
                char frontCh = str.charAt(j);
                char backCh = str.charAt(str.length() - 1 - j);
                if (frontCh != backCh) {
                    isNo = true;
                    bw.write(no);
                    break;
                }
            }
            if (!isNo) {
                bw.write(yes);
            }
            if (i < N - 1) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
