public class SwitchBoardTester {
    
    public static void main(String[] args) {
        
       //default constructor
       SwitchBoard board0 = new SwitchBoard();
       board0.brandName="xyz"; 
       System.out.println(board0.brandName);


        // board is reference variable 
        // new keyword indicates that there is class name SwitchBoard which i have to allocate memory and return address to reference variable 
        // to access the objects data we use insrance variable
        // constructor is involek when we craete object & SwitchBoard is a constructor 
        // SwitchBoard is Non-primitive datatypes bcz it start with upper case
        // All the objects are stored in HEAP

         // 1. object creation logic & 2. once we create a objrct memory will be allocated 3. invoking constuctor 4. ref variable
        SwitchBoard board = new SwitchBoard("pbk electronics",20,"c","white",100.00);
        // System.out.println(board.brandName); give null 
        
        // board.brandName="pbk Electronics";     // instance method & instance variable called by reference variable 
        // board.noOfSwitches=20;
        // board.type="C";
        // board.color="white";
        // board.price=100.00;

        System.out.println(board.brandName+"\n"+board.noOfSwitches+"\n "+board.type+"\n "+board.price);
       

        SwitchBoard board1 = new SwitchBoard("pk electronics",5,"c","grey",120.00);
        // board1.brandName="pk Electronics";     
        // board1.type="B";
        // board1.color="grey";
        // board1.price=10.00;

        System.out.println(board1.brandName+"\n"+board1.noOfSwitches+"\n "+board1.type+"\n "+board1.price);

    }

}
