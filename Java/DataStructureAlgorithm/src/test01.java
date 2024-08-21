import java.io.*;
import java.util.*;
import java.lang.*;

public class test01 {

    public static void main(String[] args) throws IOException{
        String hashedSentence = hashSentence("pokari sweat is just sweet and nike is nice");
        System.out.println(hashedSentence);
    }

    private static String hashSentence(String str){
        String[] wordList = str.split(" ");
        StringBuilder st = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        for (String refStr : wordList) {
            if(map.containsKey(refStr)){
                st.append(map.get(refStr)+" ");
            } else {
                String tempStr = refStr;
                boolean isAccepted = false;
                while (!isAccepted) {
                    String result = hashWord(tempStr);
                    if(map.containsValue(result)){
                        String firstChar = tempStr.substring(0, 1);
                        tempStr = tempStr.substring(1, tempStr.length());
                        st.append(firstChar);
                    } else {
                        map.put(refStr, result);
                        st.append(result + " ");
                        isAccepted = true;
                    }
                }
            }
        }
        return st.toString();
    }

    private static String hashWord(String str){
        if(str.length()>2) {
            str = str.charAt(0) + (str.length()-2+"") + str.charAt(str.length()-1);
        }
        return str;
    }
}
