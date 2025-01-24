package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon10205 {
    static final String DATA_SET = "Data Set %d:\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            bw.write(String.format(DATA_SET, i));
            int num = Integer.parseInt(br.readLine());
            String fights = br.readLine();
            for (int j = 0; j < fights.length(); j++) {
                char fight = fights.charAt(j);
                if (fight == 'c') {
                    num += 1;
                } else if (fight == 'b') {
                    num--;
                }
            }
            bw.write((num >= 0 ? num : 0) + "\n");
            if (i != N) {
                bw.newLine();
            }
        }
        bw.close();
    }
}
