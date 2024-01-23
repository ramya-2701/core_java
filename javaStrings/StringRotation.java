package javaStrings;

public class StringRotation {
    public static void main(String[] args){
        String s="JavaJ2eeStrutsHibernate";
        String s1="StrutsHibernateJavaJ2ee";
        if(s.length()==s1.length()){
            String s3=s+s;
            System.out.println(s3.contains(s1));
        }

    }
}
