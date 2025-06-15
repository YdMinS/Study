package 알고리즘문제풀이.수학;

import java.util.*;
import java.io.*;

public class baekjoon2712 {
    private static final Map<String, Double> UNIT_CONVERTER = new HashMap<>();
    private static final Map<String, String> UNIT_MAPPER = new HashMap<>();
    static{
        UNIT_CONVERTER.put("kg", 2.2046);
        UNIT_CONVERTER.put("lb", 0.4536);
        UNIT_CONVERTER.put("l", 0.2642);
        UNIT_CONVERTER.put("g", 3.7854);
        UNIT_MAPPER.put("kg", "lb");
        UNIT_MAPPER.put("lb", "kg");
        UNIT_MAPPER.put("l", "g");
        UNIT_MAPPER.put("g", "l");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();
            bw.write(String.format("%.4f", num * UNIT_CONVERTER.get(unit))+" "+UNIT_MAPPER.get(unit)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
