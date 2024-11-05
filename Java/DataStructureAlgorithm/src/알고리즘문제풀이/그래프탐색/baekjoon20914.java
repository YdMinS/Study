package 알고리즘문제풀이.그래프탐색;

import java.util.*;
import java.io.*;

public class baekjoon20914 {
    private static final int ALPHABET_SIZE = 26;
    private static final int ASCII_A = 'A';
    private static final int[][] distances = new int[ALPHABET_SIZE][ALPHABET_SIZE];
    private static final List<Integer>[] keyBoard = new ArrayList[ALPHABET_SIZE];

    static {
        initializeKeyboard();
        calculateDistances();
    }

    private static void initializeKeyboard() {
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            keyBoard[i] = new ArrayList<>();
        }

        String[] rows = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        for (String row : rows) {
            for (int i = 0; i < row.length(); i++) {
                int current = row.charAt(i) - ASCII_A;
                if (i > 0) addEdge(current, row.charAt(i-1) - ASCII_A);
                if (i < row.length() - 1) addEdge(current, row.charAt(i+1) - ASCII_A);
            }
        }

        String[][] verticals = {
                {"QAZ", "WSX", "EDC", "RFV", "TGB", "YHN", "UJM"},
                {"IK", "OL", "PL", "OKM", "IJN", "UHB", "YGV", "TFC", "RDX", "ESZ", "WA"}
        };
        for (String[] column : verticals) {
            for (String pair : column) {
                for (int i = 0; i < pair.length() - 1; i++) {
                    addEdge(pair.charAt(i) - ASCII_A, pair.charAt(i+1) - ASCII_A);
                }
            }
        }
    }

    private static void addEdge(int a, int b) {
        if (!keyBoard[a].contains(b)) keyBoard[a].add(b);
        if (!keyBoard[b].contains(a)) keyBoard[b].add(a);
    }

    private static void calculateDistances() {
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            Arrays.fill(distances[i], Integer.MAX_VALUE);
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            distances[i][i] = 0;

            while (!q.isEmpty()) {
                int current = q.poll();
                for (int next : keyBoard[current]) {
                    if (distances[i][next] > distances[i][current] + 2) {
                        distances[i][next] = distances[i][current] + 2;
                        q.offer(next);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            bw.write(search(str)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static int search(String str){
        int totalTime = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            int from = str.charAt(i) - ASCII_A;
            int to = str.charAt(i+1) - ASCII_A;
            if(from==to){
                totalTime++;
            } else {
                totalTime += distances[from][to] + 1;
            }
        }
        return totalTime;
    }
}
