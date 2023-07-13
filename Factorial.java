public class Factorial {
    
    public static int getFact(int FactorialNumber ){

        int fact=1;
        for(int f=1; f<=9;){
            fact=f*fact;
            f++;
            System.out.println(fact);
        }
        return fact;
    }
}
