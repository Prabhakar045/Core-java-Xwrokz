public class BluetoothEarbuds30 {
       static String brand = "Apple";                   // static variable 
        String model = "AirPods Pro";                   /// instance varibale, witout static keyword 

    public static void main(String[] args) {             // parameter ariable 
        String brand = "Apple";                       // local variable 
        String model = "AirPods Pro";
       
        boolean isWireless = true;
        double price = 26900;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
       // System.out.println("Color: " + color);
        System.out.println("Wireless: " + isWireless);
        System.out.println("Price: $" + price);
    }
}



//  Java Fundamentlas 

// Identifier -- Any name given to class , variable , method and it used for identification purpose 
//              Identifiers must have only A-Z, a-z, 0-9, _ , $



// Keyword --  IT IS reserved words in java , keywords have their own specific  meaning in JVM and we cannot 
//             use keywords as identifier and keyword start with lower case
//             every keyword is a concept in java**
//             There are 48+3(true,false, null) keywords 
//             we cannot use keyword as values except (true,false, null)
//             ex -- boolean is_available = true;


//  LIterals -- it is value that cannot be changed once they are declared 
//               there are different types of literals -- string, int ,double , etc .......
//               String brand = "Oneplus";    -- this are string literls which is enclosed with doble quote


// Method -- method is a block of code which used to perform certain opeartion or task
//           (what, why, where )
//           Syntax -- 
//  

//   Array--  container stome multiple value of same kind in single variable .
//   length -- property of array variable 
//            ex -- String name[] = "pbk";
//                    name.length                -- we can use only length propety for array varivbles only