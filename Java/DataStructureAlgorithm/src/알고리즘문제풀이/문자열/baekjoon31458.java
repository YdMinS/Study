package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon31458 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String message = br.readLine();
            bw.write(String.valueOf(calculate(message)));
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static int calculate(String message){
        int frontExclamation = 0;
        boolean existBackExclamation = false;
        int num = 0;
        boolean isFront = true;
        for(int i=0; i<message.length(); i++){
            char ch = message.charAt(i);
            if(ch!='!'){
                isFront = false;
                num = ch-'0';
            } else if(isFront){
                frontExclamation++;
            } else {
                existBackExclamation = true;
                break;
            }
        }
        if(existBackExclamation){
            num=1;
        }
        if(frontExclamation%2==0){
            return num;
        } else {
            return num==0 ? 1 : 0;
        }
    }
}
