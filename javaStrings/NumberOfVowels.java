package javaStrings;

public class NumberOfVowels {
    String s="ramya";
    int vowelCount(){
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
              count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        NumberOfVowels nv=new NumberOfVowels();
        int cnt=nv.vowelCount();
        System.out.println(cnt);
    }
}
