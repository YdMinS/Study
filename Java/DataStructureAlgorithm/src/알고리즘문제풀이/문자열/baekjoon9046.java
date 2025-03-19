package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon9046 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String encodedSt = br.readLine();
            int[] alphabetCnt = new int['z'-'a'+1];
            int max = Integer.MIN_VALUE;
            boolean isExecuted = false;
            for(int j=0; j<encodedSt.length(); j++){
                char ch = encodedSt.charAt(j);
                if(ch == ' ') continue;
                int index = encodedSt.charAt(j)-'a';
                alphabetCnt[index]++;
                max = Math.max(alphabetCnt[index], max);
            }
            int resultIndex = -1;
            for(int j=0; j<alphabetCnt.length; j++){
                if(max == alphabetCnt[j]){
                    if(resultIndex == -1) {
                        resultIndex = j;
                    } else {
                        bw.write("?");
                        isExecuted = true;
                        break;
                    }
                }
            }
            if(!isExecuted) bw.write((char)(resultIndex+'a'));
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
