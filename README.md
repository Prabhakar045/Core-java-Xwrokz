# Core-java-Xwrokz
Software trainee training for java developer role 


Constructor chaining is a technique in object-oriented programming where one constructor calls another constructor within the same class, 
allowing for the reuse of code and initialization of objects in a more concise and organized manner. It enables constructors with different 
sets of parameters to work together, ensuring that all necessary initialization tasks are performed while avoiding code duplication.
- Constructor chaining achieved through using  this method
- this keyword only used inside the constructor not in method 

Example ---

public class Car {
    String make;
    String model;
    int year;

    // Constructor with all three parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Constructor with make and model parameters, chaining to the above constructor
    public Car(String make, String model) {
        this(make, model, 2023); // Calling the three-parameter constructor with a default year value
    }

    // Constructor with make parameter, chaining to the above constructor
    public Car(String make) {
        this(make, "Unknown Model"); // Calling the two-parameter constructor with default values
    }
}


Example 2---

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


--
public class BinacularTester {
    
    public static void main(String[] args) {
        
        Binacular binacular = new Binacular("convex", "Cannon" );

        // // binacular.typoOfLens="convex";
        // binacular.brandName="Sony";
        // binacular.price=1000.00;

        System.out.println( binacular.typoOfLens+"\n"+binacular.brandName+" \n"+binacular.price);
    }
}
