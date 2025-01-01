package 알고리즘문제풀이.데이터구조;

import java.util.*;
import java.io.*;

public class baekjoon31562 {
    static Map<String, String> musicN = new HashMap();
    static Set<String> notRecognizable = new HashSet();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            String musicName = st.nextToken();
            StringBuilder sb = new StringBuilder(3);
            sb.append(st.nextToken()).append(st.nextToken()).append(st.nextToken());
            String threeSound = sb.toString();
            if(notRecognizable.contains(threeSound)) continue;
            if(musicN.containsKey(threeSound)){
                musicN.remove(threeSound);
                notRecognizable.add(threeSound);
            } else {
                musicN.put(threeSound, musicName);
            }
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder(3);
            sb.append(st.nextToken()).append(st.nextToken()).append(st.nextToken());
            String threeSound = sb.toString();
            if(musicN.containsKey(threeSound)){
                bw.write(musicN.get(threeSound));
            } else {
                if(notRecognizable.contains(threeSound)){
                    bw.write("?");
                } else {
                    bw.write("!");
                }
            }
            if(i<M-1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
