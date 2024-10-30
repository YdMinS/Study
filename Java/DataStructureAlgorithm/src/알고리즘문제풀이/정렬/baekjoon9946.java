package 알고리즘문제풀이.정렬;

import java.io.*;

public class baekjoon9946 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();
        String b = br.readLine();
        int index = 1;
        while(!a.equals("END") && !b.equals("END")){
            boolean isSame = true;
            if(a.length()!=b.length()){
                isSame = false;
            } else {
                int[] check = new int[26];
                for(int i=0; i<a.length(); i++){
                    check[a.charAt(i)-'a']++;
                    check[b.charAt(i)-'a']--;
                }
                for(int i : check){
                    if(i!=0){
                        isSame = false;
                        break;
                    }
                }
            }
            bw.write(String.format("Case %d: %s\n", index, isSame ? "same" : "different"));
            index++;
            a = br.readLine();
            b = br.readLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
