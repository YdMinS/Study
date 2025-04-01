package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon11094 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] cmd = br.readLine().split(" ");
            if(cmd[0].equals("Simon") && cmd[1].equals("says")){
                for(int j=2; j<cmd.length; j++){
                    bw.write(" ");
                    bw.write(cmd[j]);
                }
                if(i<N-1) bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
