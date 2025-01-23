package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon32969 {
    static final Map<String, String> REF = new HashMap<>();
    static {
        REF.put("social", "digital humanities");
        REF.put("history", "digital humanities");
        REF.put("language", "digital humanities");
        REF.put("literacy", "digital humanities");
        REF.put("bigdata", "public bigdata");
        REF.put("public", "public bigdata");
        REF.put("society", "public bigdata");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] categoryQueries = REF.keySet().toArray(String[]::new);
        for(String category : categoryQueries){
            if(str.contains(category)){
                System.out.println(REF.get(category));
                return;
            }
        }
    }
}
