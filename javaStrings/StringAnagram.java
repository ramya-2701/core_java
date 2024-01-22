package javaStrings;

import java.util.Arrays;


public class StringAnagram {
    static String s="The Morse Code";
    static String s1="Here come dots";

    public boolean findAnagram(String s,String s1){
        s=s.replaceAll("\\s","").toLowerCase();
        s1=s1.replaceAll("\\s","").toLowerCase();
        if(s.length()!=s1.length()){
            return false;
        }
        else {
            char[] c1 = s.toCharArray();
            char[] c2 = s1.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);
        }
    }
    public static void main(String[] args){
        StringAnagram sa=new StringAnagram();
        System.out.println(sa.findAnagram(s,s1));
    }

}
