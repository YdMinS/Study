package 알고리즘문제풀이.데이터구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class backjoon10866 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
    }

    static void execute() throws IOException{
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str){
                case "push_front" :
                    int frontNum = Integer.parseInt(st.nextToken());
                    dq.addFirst(frontNum);
                    break;
                case "push_back" :
                    int backNum = Integer.parseInt(st.nextToken());
                    dq.addLast(backNum);
                    break;
                case "pop_front" :
                    if(dq.size()>0){
                        System.out.println(dq.getFirst());
                        dq.removeFirst();
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "pop_back" :
                    if(dq.size()>0){
                        System.out.println(dq.getLast());
                        dq.removeLast();
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size" :
                    System.out.println(dq.size());
                    break;
                case "empty" :
                    if(dq.isEmpty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front" :
                    if(dq.size()>0){
                        System.out.println(dq.peekFirst());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "back" :
                    if(dq.size()>0){
                        System.out.println(dq.peekLast());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        execute();
    }
}
