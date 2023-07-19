# Core-java-Xwrokz

Whenwver Parameter and Instance variable with same , then compiler will go in AMBIGUITY(confusion). So we use THIS keyword
And it will make avoid complict btwn parametr and instance variable 
Compiler give more preference to the local var and local parameters 
- this keyword must used in same class not outside class 
- In industry usually they cannot use different name 

types of constructor- default , Parameterized

EX--

public class  SwitchBoard {
    

    // instance variable 

    String brandName;
    int noOfSwitches;
    String type;
    String color;
    double price;

  
    //this keyword
     public SwitchBoard(String brandName,int noOfSwitches,String type, String color,double price){                  //parameterized constructor 
        System.out.println("Swich board constructor is invoked");

        this.brandName=brandName;
        this.noOfSwitches=noOfSwitches;
        this.type=type;
        this.color=color;
        this.price=price;
        
    }

}
