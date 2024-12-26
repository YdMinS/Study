package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon31746 {
    static final String SCI_COM_LOVE = "SciComLove";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N%2==0){
            System.out.println(SCI_COM_LOVE);
        } else {
            System.out.println(new StringBuilder(SCI_COM_LOVE).reverse());
        }
    }
}
