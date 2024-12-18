package 알고리즘문제풀이.정렬;

import java.io.*;

public class baekjoon11536 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String prev = br.readLine();
        boolean dec=false, asc = false;
        for(int i=1; i<N; i++){
            String current = br.readLine();
            int n = current.compareTo(prev);
            if(n==0){
                dec = true;
                asc = true;
            } else {
                asc = n>0 ? true : asc;
                dec = n<0 ? true : dec;
            }
            prev = current;
        }
        if(dec && asc || !dec && !asc){
            System.out.println("NEITHER");
        } else if (dec){
            System.out.println("DECREASING");
        } else {
            System.out.println("INCREASING");
        }
    }
}
