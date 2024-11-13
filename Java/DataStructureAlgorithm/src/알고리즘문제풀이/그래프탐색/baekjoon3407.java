package 알고리즘문제풀이.그래프탐색;

import java.io.*;
import java.util.*;

public class baekjoon3407 {
    static Set<String> atomSet = new HashSet();
    static {
        String atoms = "H He Li Be B C	N O	F Ne Na	Mg Al Si P S Cl	Ar K Ca	Sc Ti "+
                       "V Cr Mn Fe Co Ni Cu Zn Ga Ge As Se Br Kr Rb Sr Y Zr	Nb Mo "+
                       "Tc Ru Rh Pd	Ag Cd In Sn	Sb Te I Xe Cs Ba Hf Ta W Re Os Ir "+
                       "Pt Au Hg Tl Pb Bi Po At Rn Fr Ra Rf Db Sg Bh Hs Mt Ds Rg Cn "+
                       "Fl Lv La Ce Pr Nd Pm Sm Eu Gd Tb Dy Ho Er Tm Yb Lu Ac Th Pa "+
                       "U Np Pu Am Cm Bk Cf Es Fm Md No Lr";
        StringTokenizer st = new StringTokenizer(atoms);
        while(st.hasMoreTokens()){
            atomSet.add(st.nextToken().toLowerCase());
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            sb.append(canPronounce(str) ? "YES\n" : "NO\n");
        }
        System.out.println(sb.toString());
        br.close();
    }

    private static boolean canPronounce(String str){
        int n = str.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i=1; i<=n; i++){
            if(i>=1 && dp[i-1] && atomSet.contains(str.substring(i-1, i))){
                dp[i] = true;
            } else if(i>=2 && dp[i-2] && atomSet.contains(str.substring(i-2, i))){
                dp[i] = true;
            }
        }
        return dp[n];
    }
}
