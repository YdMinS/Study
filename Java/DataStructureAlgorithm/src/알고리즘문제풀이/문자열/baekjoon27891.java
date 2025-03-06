package 알고리즘문제풀이.문자열;

import java.util.*;
import java.io.*;

public class baekjoon27891 {
    private static final Map<String, String> schoolMap = new HashMap<>();
    static {
        schoolMap.put("northlondo", "NLCS");
        schoolMap.put("branksomeh", "BHA");
        schoolMap.put("koreainter", "KIS");
        schoolMap.put("stjohnsbur", "SJA");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String encryptedName = br.readLine();
        for(int shift = 0; shift<26; shift++){
            String decrypted = decrypt(encryptedName, shift);
            if(schoolMap.containsKey(decrypted)){
                System.out.println(schoolMap.get(decrypted));
                return;
            }
        }
    }

    private static String decrypt(String encrypted, int shift){
        StringBuilder result = new StringBuilder();
        for(char ch : encrypted.toCharArray()){
            char encryptedChar = (char)('a' + (ch - 'a' - shift + 26) % 26);
            result.append(encryptedChar);
        }
        return result.toString();
    }
}
