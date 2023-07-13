public class ChaiTapri {
    static String location = "Koramanagala";  // java does not store value in index they jst create reference nad that value stored in the reference
        // static String tea = "masala tea";
        // static String tea1 = "ginger tea";
        // static String tea2 = "cutting chai";
        // static String tea3 = "Hot green chai";
        // static String tea4 = "sugar less chai";
        // static String tea5 = "choclate chai";
        // static String tea6 = "lemon ice chai";
        // static String tea7 = "Apple ice chai";
        // static String tea8 = "canberry ice chai";
        // static String tea9 = "mango spicy chai";
        // static String tea10 = "kadakk chai";
        // static String chaiAvailable[] = {tea,tea1,tea2,tea3,tea4,tea5,tea6,tea7,tea8,tea9,tea10};
        
    static String chaiAvailable[] = {null,null,null,null,null,null,null,null,null,null};

    static int index;
     


    public static boolean addChai(String chai){
            boolean isAdded = false;  
            

            if(chai != null ){
               chaiAvailable[index]=chai;      // chaiAvailable[0]="masal tea";
               index++;
               isAdded=true;
               
            }
            else{
                System.out.println("we cannot add chai, bcz as it is null");
            }
            return isAdded;

    }

    //method
    public static void getAllChaiAvailable(){

                System.out.println("invoking getchaiavailable" +"\n");
    

    for(int chai=0; chai<chaiAvailable.length;chai++){
         String reference = chaiAvailable[chai];
         System.out.println("accessing chai  " +reference +" at " + chai);

    }

    System.out.println("end of invoking getcaiavailable "+"\n");
}

}
