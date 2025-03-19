package 알고리즘문제풀이.문자열;

import java.io.*;

public class baekjoon8949 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strBuilder = new StringBuilder();
        String[] nums = br.readLine().split(" ");
        int length0 = nums[0].length();
        int length1 = nums[1].length();
        int length = Math.max(length0, length1);
        int diff = Math.abs(length0 - length1);
        if(diff!=0){
            if(length0>length1) nums[1] = "0".repeat(diff) + nums[1];
            else nums[0] = "0".repeat(diff) + nums[0];
        }
        for(int i=0; i<length; i++){
            int a = Character.getNumericValue(nums[0].charAt(i));
            int b = Character.getNumericValue(nums[1].charAt(i));
            strBuilder.append(a+b);
        }
        System.out.print(strBuilder);
    }
}
