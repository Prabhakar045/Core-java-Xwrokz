
-------creating file froom java ----------------
package name -> java.io

 // File handling
 // compile time exception (IOException)


package com.xworkz.ExceptionHandling;
import java.io.File;
import java.io.IOException;

public class Tester5 {

    // File handling
    // compile time exception (IOException)

    public static void main(String[] args) {

       try {
           File file = new File("C:\\Users\\prabh\\Desktop\\pbk,pdf");
          if(!file.exists()){
           file.createNewFile();
          }else {
              System.out.println("file already exist");
          }

       }catch (IOException io){
           io.printStackTrace();
       }
    }
}





Import the necessary classes for file handling: java.io.File for working with files and java.io.IOException for handling exceptions related to I/O operations.

Inside the main method, you define a try-catch block to handle potential IOExceptions that might occur during file handling.

You create a File object named file that represents the file you want to create. In this case, you've specified the file path as "C:\\Users\\prabh\\Desktop\\pbk.txt". This path points to a file on your desktop with the name "pbk.txt."

You use the createNewFile() method on the File object to attempt to create the file. This method returns true if the file is successfully created and false if it already exists.

You check the return value of createNewFile():

If it returns true, you print a message indicating that the file was created.
If it returns false, you print a message indicating that the file already exists.
If an IOException occurs during the file creation (for example, due to a permission issue or disk full), the catch block will be executed, and the exception's stack trace will be printed for debugging purposes.
