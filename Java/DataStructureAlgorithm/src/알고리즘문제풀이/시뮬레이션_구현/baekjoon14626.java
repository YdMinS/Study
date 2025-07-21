package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;

public class baekjoon14626 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ISBN = br.readLine();
        int parsedNum = 0;
        int indexOfAsterisk = 0;
        for (int i=0; i<ISBN.length(); i++) {
            char ch = ISBN.charAt(i);
            if (ch!='*') {
                parsedNum = (parsedNum + Character.getNumericValue(ch) * (i%2 == 1 ? 3 : 1)) % 10;
            } else {
                indexOfAsterisk = i;
            }
        }
        int need = (10 - parsedNum) % 10;
        if(indexOfAsterisk % 2 == 1){
            System.out.println((need * 7) % 10);
        } else {
            System.out.println(need);
        }
    }
}
