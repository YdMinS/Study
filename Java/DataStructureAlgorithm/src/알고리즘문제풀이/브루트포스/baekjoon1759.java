package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon1759 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, C;
    static char[] letters;
    static boolean[] visited;
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        input();
        dfs(0,0);
        output();
    }

    private static void input() throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        letters = new char[C];
        visited = new boolean[C];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<C; i++){
            letters[i]= st.nextToken().charAt(0);
        }
        Arrays.sort(letters);
    }

    private static void dfs(int x, int depth){
        if(depth==N){
            String password = getPassword();
            if(isValid(password)){
                result.add(password);
            }
            return;
        }
        for(int i=x; i<C; i++){
            visited[i] = true;
            dfs(i+1, depth+1);
            visited[i] = false;
        }
    }

    private static String getPassword(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<C; i++){
            if(visited[i]){
                sb.append(letters[i]);
            }
        }
        return sb.toString();
    }

    private static boolean isValid(String password) {
        int vowels = 0;
        int consonants = 0;
        for (char c : password.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        return vowels >= 1 && consonants >= 2;
    }

    private static void output() {
        for(String str: result) {
            System.out.println(str);
        }
    }
}
