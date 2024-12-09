package 알고리즘문제풀이.그리디;

import java.io.*;

public class baekjoon27930 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String korea = "KOREA";
        String yonsei = "YONSEI";
        int intK = 0;
        int intY = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c==korea.charAt(intK)){
                intK++;
                if(intK==korea.length()){
                    System.out.println("KOREA");
                    return;
                }
            }
            if(c==yonsei.charAt(intY)){
                intY++;
                if(intY==yonsei.length()){
                    System.out.println("YONSEI");
                    return;
                }
            }
        }
    }
}
