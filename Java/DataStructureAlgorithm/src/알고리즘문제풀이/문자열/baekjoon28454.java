package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon28454 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] today = parseDate(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int validCouponNumber = 0;
        for(int i=0; i<N; i++){
            int[] validDate = parseDate(br.readLine());
            if(compareDate(today, validDate)){
                validCouponNumber++;
            }
        }
        System.out.println(validCouponNumber);
    }

    private static int[] parseDate(String date){
        int[] result = new int[3];
        result[0] = Integer.parseInt(date.substring(0, 4));
        result[1] = Integer.parseInt(date.substring(5, 7));
        result[2] = Integer.parseInt(date.substring(8));
        return result;
    }

    private static boolean compareDate(int[] refDate, int[] compareDate){
        if(refDate[0]<compareDate[0]){
            return true;
        } else if(refDate[0] > compareDate[0]){
            return false;
        }
        if(refDate[1]<compareDate[1]){
            return true;
        } else if(refDate[1]>compareDate[1]){
            return false;
        }
        return refDate[2]<=compareDate[2];
    }
}
