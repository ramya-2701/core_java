class Arithmetic1{
    protected final int a=10;
    protected final int addValues(int b){
        return a+b;
    }
}
public class FinalArithmetic extends Arithmetic1{
    public static void main(String[] args){
        FinalArithmetic fa=new FinalArithmetic();
        int result=fa.addValues(10);
        System.out.println(result);
    }
}