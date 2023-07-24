public class  SwitchBoard {
    
    //static memebers
    // when object is created all the instancd variables and methods are stored in object+
    // static method and variables stored in out side object but in the memory
    //instance variables 

    String brandName;
    int noOfSwitches;
    String type;
    String color;
    double price;


    public SwitchBoard(){        //defualt constructor

        System.out.println("default constructor is invoking");
    }

    // for every class compiler creates constructor 
    //Constructor - Developer
    // constrcutor help us initialize the  instance variable of class  only one time(purpose)
    //it is special type of method and same name as class 

    // public SwitchBoard(String bName,int nfS,String tp, String clr,double prize){
    //     System.out.println("Swich board constructor is invoked");

    //  brandName=bName;
    //  noOfSwitches=nfS;
    //  type=tp;
    //  color=clr;
    //  price=prize;
        
    // }


    //this keyword
     public SwitchBoard(String brandName,int noOfSwitches,String type, String color,double price){
        System.out.println("Swich board constructor is invoked");

        this.brandName=brandName;
        this.noOfSwitches=noOfSwitches;
        this.type=type;
        this.color=color;
        this.price=price;
        
    }


    // instance method
    public void provideElectricity(){
        System.out.println("Electricity is provided");
    }
}
