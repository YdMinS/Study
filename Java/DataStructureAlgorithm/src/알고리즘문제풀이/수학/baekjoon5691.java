package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon5691 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] numInput = br.readLine().split(" ");
        while(!numInput[0].equals("0") || !numInput[1].equals("0")){
            int A = Integer.parseInt(numInput[0]);
            int B = Integer.parseInt(numInput[1]);
            int C = findC(A, B);
            bw.write(C+"\n");
            numInput = br.readLine().split(" ");
        }
        bw.flush();
        bw.close();
    }

    private static int findC(int A, int B){
        List<Integer> cList = new ArrayList<>();
        int average;
        int middle;
        // average == C
        int C1 = (A + B)/2;
        average = C1;
        middle = findMiddle(A, B, C1);
        if(middle == average) cList.add(C1);
        // average == A
        int C2 = 2 * A - B;
        average = A;
        middle = findMiddle(A, B, C2);
        if(middle == average) cList.add(C2);
        // average == B
        int C3 = 2 * B - A;
        average = B;
        middle = findMiddle(A, B, C3);
        if(middle == average) cList.add(C3);
        Collections.sort(cList);
        return cList.get(0);
    }

    private static int findMiddle(int A, int B, int C){
        return A > B ? Math.max(B, C) : Math.max(A, C);
    }
}
