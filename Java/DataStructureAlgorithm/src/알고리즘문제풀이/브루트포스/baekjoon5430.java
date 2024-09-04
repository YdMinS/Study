package 알고리즘문제풀이.브루트포스;

import java.lang.*;
import java.io.*;
import java.util.*;

public class baekjoon5430 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            ac();
        }
    }

    private static void ac() throws IOException{
        String cmd = br.readLine();
        boolean fromFront = true;
        int l = Integer.parseInt(br.readLine());
        String mapInString = br.readLine();
        String[] map;
        if(l>0) {
            map = mapInString.substring(1, mapInString.length() - 1).split(",");
        } else{
            map = new String[0];
        }
        Deque<String> dq = new LinkedList<>();
        for(int i=0; i<map.length; i++){
            dq.add(map[i]);
        }
        for(int i=0; i<cmd.length(); i++){
            switch(cmd.charAt(i)){
                case 'R':
                    fromFront = !fromFront;
                    break;
                case 'D':
                    if(dq.size()>0){
                        if(fromFront){
                            dq.pollFirst();
                        } else {
                            dq.pollLast();
                        }
                    } else {
                        System.out.println("error");
                        return;
                    }
            }
        }
        StringBuilder sb = new StringBuilder("[");
        while(!dq.isEmpty()) {
            sb.append(fromFront ? dq.pollFirst() : dq.pollLast());
            if(!dq.isEmpty()) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}