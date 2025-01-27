package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon25641 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder st = new StringBuilder(br.readLine());
        if(st.length()%2==1){
            st = new StringBuilder(st.substring(1));
            N--;
        }
        while(N>0){
            int s = 0;
            int t = 0;
            for(int i=0; i<st.length(); i++){
                char ch = st.charAt(i);
                if(ch == 's') {
                    s++;
                } else {
                    t++;
                }
            }
            if(s==t) {
                System.out.println(st);
                return;
            } else {
                st = new StringBuilder(st.substring(2));
                N-=2;
            }
        }
    }
}
