package 알고리즘문제풀이.시뮬레이션_구현;

import java.util.*;
import java.io.*;

public class baekjoon1672 {
    // A G C T
    private static final char[][] DNA_MAP= new char[4][4];
    private static final Map<Character, Integer> INDEX_MAP = new HashMap<>();
    static {
        DNA_MAP[0] = new char[]{'A', 'C', 'A', 'G'};
        DNA_MAP[1] = new char[]{'C', 'G', 'T', 'A'};
        DNA_MAP[2] = new char[]{'A', 'T', 'C', 'G'};
        DNA_MAP[3] = new char[]{'G', 'A', 'G', 'T'};
        INDEX_MAP.put('A', 0);
        INDEX_MAP.put('G', 1);
        INDEX_MAP.put('C', 2);
        INDEX_MAP.put('T', 3);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String DNA = br.readLine();
        Stack<Character> dnaStack = new Stack<>();
        for(int i=0; i<N; i++){
            dnaStack.add(DNA.charAt(i));
        }
        char result = dnaStack.pop();
        while (!dnaStack.isEmpty()) {
            char next = dnaStack.pop();
            int rowIndex = INDEX_MAP.get(next);
            int columnIndex = INDEX_MAP.get(result);
            result = DNA_MAP[rowIndex][columnIndex];
        }
        System.out.println(result);
    }
}
