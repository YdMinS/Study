package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon11091 {
    private static final String PANGRAM = "pangram";
    private static final String MISSING = "missing ";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int[] alphabetCnt = new int['z'-'a'+1];
            String str = br.readLine().toLowerCase();
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(ch>='a' && ch<='z'){
                    alphabetCnt[ch-'a']++;
                }
            }
            int noneCnt = 0;
            StringBuilder stringBuilder = new StringBuilder();
            for(int j=0; j<alphabetCnt.length; j++){
                if(alphabetCnt[j]==0){
                    noneCnt++;
                    stringBuilder.append((char)(j+'a'));
                }
            }
            if(noneCnt == 0) bw.write(PANGRAM);
            else bw.write(MISSING+stringBuilder);
            if(i<N-1) bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
