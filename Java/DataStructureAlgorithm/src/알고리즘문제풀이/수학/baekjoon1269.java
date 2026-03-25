package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon1269 {
    static HashSet<Integer> setA = new HashSet<>(), setB = new HashSet<>();

    public static void main(String[] args) throws IOException {
        input();
        int result = execute();
        System.out.println(result);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            setA.add(n);
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            int n = Integer.parseInt(st.nextToken());
            setB.add(n);
        }
    }

    private static int execute() {
        int numOfElementsOnlyInA = 0;
        int numOfElementsOnlyInB = 0;

        for (int n : setA) {
            if (!setB.contains(n)) numOfElementsOnlyInA++;
        }

        for (int n: setB) {
            if (!setA.contains(n)) numOfElementsOnlyInB++;
        }

        return numOfElementsOnlyInA + numOfElementsOnlyInB;
    }
}
