package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon5586 {
    private static final String JOI = "JOI";
    private static final String IOI = "IOI";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numJoi = 0;
        int numIoi = 0;
        String str = br.readLine();
        for(int i=0; i<str.length()-2; i++){
            String strToSearch = str.substring(i, i+3);
            switch(strToSearch){
                case JOI :
                    numJoi++;
                    continue;
                case IOI :
                    numIoi++;
            }
        }
        System.out.println(numJoi+"\n"+numIoi);
    }
}
