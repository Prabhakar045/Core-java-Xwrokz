# Core-java-Xwrokz
Software trainee training for java developer role 


public class Array {
    
    static String electronicsDevices[] = {"refrigerator","Washing Machine","television","lED","grinder","AC","Iron box","microwave"};

    public static void main(String[] args) {

      
        System.out.println(electronicsDevices[0]);
        
        //    i is a variable which is used iterate array and we can use any name to variable
        //    for( dec var = ini var; condition; increment/decrement)
        //     in condition we always use relation operators bcz we will get output as true/false (<,>,<=,>=,!=,==)


        // for(int i=0; i<=electronicsDevices.length-1;){
            
        //     System.out.println(electronicsDevices[i]);
        //     i++;
        // }
         
        for(String electronicsDevice: electronicsDevices){
            
            System.out.println(electronicsDevice);
           
        }
       
    }
}


------------------------------------------------------------------------------------------------------------------------------------------------------


//   Array--  container store multiple value of similar kind in single variable .
                    name.length                -- we can use only length propety for array varivbles only
   length -- property of array variable 
            ex -- String name[] = "pbk";


---------------
public class ChaiTapri {
    static String location = "Koramnagala";  // java does not store value in index they just create reference and  that value stored in the reference
    static String tea = "masala tea";
    static String tea1 = "ginger tea";
    static String chaiAvailable[] = {tea, "tea1","lemon tea"};

    //method
    public static void getAllChaiAvailable(){

                System.out.println("invoking getchaiavailable" +"\n");
    

    for(int chai=0; chai<chaiAvailable.length;chai++){
         String reference = chaiAvailable[chai];
         System.out.println(reference);

    }

    System.out.println("end of invoking getcaiavailable "+"\n");
}

}

----------
public class ChaiTapriTester {
    public static void main(String[] args) {
        ChaiTapri.getAllChaiAvailable();
        orderChai("masala tea" ,"ginger tea", 2);
    }

    public static void orderChai(String chaiType, String chaiType2, int quantity){
         System.out.println("Ordering chai " +quantity+" cup of "+chaiType + "and "+ chaiType2+"\n");
    }
}
