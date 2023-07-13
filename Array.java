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
