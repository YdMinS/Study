package 알고리즘문제풀이.시뮬레이션_구현;

import java.io.*;
import java.util.*;

public class baekjoon17406 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, K, min = Integer.MAX_VALUE;
    static int[][] originalMap, map, play;
    static boolean[] visited;
    static List<int[]> permutationList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        input();
        generatePermutations(new int[K], 0);
        execute();
        System.out.println(min);
    }

    private static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        originalMap = new int[N][M];
        map = new int[N][M];
        play = new int[K][3];
        visited = new boolean[K];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                originalMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            play[i][0] = Integer.parseInt(st.nextToken()) - 1;  // r
            play[i][1] = Integer.parseInt(st.nextToken()) - 1;  // c
            play[i][2] = Integer.parseInt(st.nextToken());      // s
        }
    }

    private static void generatePermutations(int[] permutation, int depth) {
        if (depth == K) {
            permutationList.add(permutation.clone());
            return;
        }
        for (int i = 0; i < K; i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutation[depth] = i;
                generatePermutations(permutation, depth + 1);
                visited[i] = false;
            }
        }
    }

    private static void execute() {
        for (int[] perm : permutationList) {
            copyMap();
            for (int idx : perm) {
                int r = play[idx][0];
                int c = play[idx][1];
                int s = play[idx][2];
                for (int j = 1; j <= s; j++) {
                    rotate(r - j, c - j, r + j, c + j);
                }
            }
            calculateMin();
        }
    }

    private static void rotate(int startX, int startY, int endX, int endY) {
        int temp = map[startX][startY];
        for (int i = startX; i < endX; i++) {
            map[i][startY] = map[i + 1][startY];
        }
        for (int i = startY; i < endY; i++) {
            map[endX][i] = map[endX][i + 1];
        }
        for (int i = endX; i > startX; i--) {
            map[i][endY] = map[i - 1][endY];
        }
        for (int i = endY; i > startY; i--) {
            map[startX][i] = map[startX][i - 1];
        }
        map[startX][startY + 1] = temp;
    }

    private static void calculateMin() {
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += map[i][j];
            }
            min = Math.min(min, sum);
        }
    }

    private static void copyMap() {
        for (int i = 0; i < N; i++) {
            System.arraycopy(originalMap[i], 0, map[i], 0, M);
        }
    }
}

