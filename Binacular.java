public class Binacular {

    String typoOfLens;
    String brandName;
    double price;
 
    public Binacular(){
        System.out.println("Binacular constructor is invoking - no arguments constructor ");
    }

    // Constructor overloading
    public Binacular(String typoOfLens, String brandName) {
        this(100000.00);                       //Constructor chaining achieved through using  this method
        
        System.out.println("Binacular constructor is invoking - 2 arguments constructor");
        this.typoOfLens = typoOfLens;
        this.brandName = brandName;
       
    }

    public Binacular(double price){
        this();
        // this("convex", "Cannon");
        System.out.println("Binacular constructor is invoking - 1 arguments constructor");
        this.price = price;
    }

    
    
}
