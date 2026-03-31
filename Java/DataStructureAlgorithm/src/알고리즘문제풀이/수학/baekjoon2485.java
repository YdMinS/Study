package 알고리즘문제풀이.수학;

import java.io.*;

public class baekjoon2485 {
    static int[] treeLocation, treeLocationGap;
    static int GCD;
    static int neededTreeNumber = 0;

    public static void main(String[] args) throws IOException {
        input();
        execute();
        System.out.println(neededTreeNumber);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        treeLocation = new int[N];
        treeLocationGap = new int[N-1];
        for(int i=0; i<N; i++) {
            int a = Integer.parseInt(br.readLine());
            treeLocation[i] = a;
            if (i > 0) {
                int currentGap = Math.abs(a - treeLocation[i-1]);
                treeLocationGap[i-1] = currentGap;
                if (i > 1) {
                    int currentGCD = findGCD(treeLocationGap[i-2], treeLocationGap[i-1]);
                    GCD = i > 2 ? findGCD(GCD, currentGCD) : currentGCD;
                }

            }
        }
    }

    private static int findGCD(int num1, int num2) {
        int a = Math.min(num1, num2);
        int b = Math.max(num1, num2);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    private static void execute() {
        for (int j : treeLocationGap) {
            neededTreeNumber += j / GCD - 1;
        }
    }
}
