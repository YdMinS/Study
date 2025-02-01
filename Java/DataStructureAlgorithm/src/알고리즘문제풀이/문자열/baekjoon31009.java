package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon31009 {
    static final String JINJU = "jinju";

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> priceList = new ArrayList<>();
        int priceToJinju = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cityName = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            if(cityName.equals(JINJU)){
                priceToJinju = price;
            }
            priceList.add(price);
        }
        Collections.sort(priceList);
        int indexOfJinju = priceList.indexOf(priceToJinju);
        int cnt = N - indexOfJinju - 1;
        for(int i=indexOfJinju+1; i<N; i++){
            int price = priceList.get(i);
            if(price>priceToJinju){
                break;
            }
            cnt--;
        }
        System.out.println(priceToJinju+"\n"+cnt);
    }
}
