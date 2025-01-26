package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon26264 {
    static final String SECURITY = "security!";
    static final String BIGDATA = "bigdata?";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String memo = br.readLine();
        int index = 0;
        int numSecurity = 0;
        int numBigdata = 0;
        while(numSecurity + numBigdata < N){
            char ch = memo.charAt(index);
            if(ch == 's'){
                numSecurity++;
                index += 8;
            } else {
                numBigdata++;
                index += 7;
            }
        }
        System.out.println(numSecurity==numBigdata ? BIGDATA+" "+SECURITY : (numSecurity>numBigdata ? SECURITY : BIGDATA));
    }
}
