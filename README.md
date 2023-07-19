# Core-java-Xwrokz

   -- Java understand Compile time is class and Runtime is Obejct
   Class--  Class is design or blueprint.
            Class contains state and behaviour. 
           state - property, data memebrs, fields, variables

  Object - It instance of class (Instance is a anything we can touch, feel and see)
           We go with objects bcz to create a multiple copy of a class. (why do we need objects)






    In Java, object creation happens at runtime, specifically when the new keyword is used to instantiate an object.
   When the new keyword is encountered, the Java Virtual Machine (JVM) allocates memory for the object and initializes its 
   instance variables with their default values.

   The process of object creation involves the following steps:

   Memory Allocation: When an object is created using the new keyword, the JVM allocates memory to hold the object's instance variables.
   This memory allocation is done on the heap.

   Constructor Invocation: Once the memory is allocated, the appropriate constructor for the class is invoked. The constructor initializes the object's 
   instance variables and performs any        necessary setup or initialization logic.

     Object Initialization: After the constructor is executed, the object is considered initialized. The instance variables may have been assigned initial values,
    and the object is now in a valid state to be used.



   public class  SwitchBoard {
    

    // for every class compiler creates constructor 
    //Constructor - Developer

    public SwitchBoard(){
        System.out.println("Swich board constructor is invoked");
        
    }



    //static memebers
    // when object is created all the instancd variables and methods are stored in object+
    // static method and variables stored in out side object but in the memory
    //instance variables 

    String brandName;
    int noOfSwitches;
    String type;
    String color;
    String price;

    // instance method
    public void provideElectricity(){
        System.out.println("Electricity is provided");
    }
}


public class SwitchBoardTester {
    
    public static void main(String[] args) {
        
       
        // board is reference variable 
        // new keyword indicates that there is class name SwitchBoard which i have to allocate memory and return address to reference variable 
        // to access the objects data we use insrance variable
        // constructor is involek when we craete object & SwitchBoard is a constructor 
        // SwitchBoard is Non-primitive datatypes bcz it start with upper case
        // All the objects are stored in HEAP

         // 1. object creation logic & 2. once we create a objrct memory will be allocated 3. invoking constuctor 4. ref variable
        SwitchBoard board = new SwitchBoard();
        System.out.println(board.brandName);
        
        board.brandName="pbk Electronics";     // instance method & instance variable called by reference variable 
        board.noOfSwitches=20;
        board.type="C";
        board.color="white";
        board.price=100.00;

        System.out.println(board.brandName+"\n"+board.noOfSwitches+"\n "+board.type+"\n "+board.price);
       

        SwitchBoard board1 = new SwitchBoard();
        board1.brandName="pk Electronics";     
        board1.type="B";
        board1.color="grey";
        board1.price=10.00;

        System.out.println(board1.brandName+"\n"+board1.noOfSwitches+"\n "+board1.type+"\n "+board1.price);

    }

}


