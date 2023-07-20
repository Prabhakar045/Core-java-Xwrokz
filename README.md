# Core-java-Xwrokz
Software trainee training for java developer role 



-- Can we overload main method inn java ?

   ANS--  While you can define multiple main methods in a single class, only the one with the correct signature (public static void main(String[] args))
    will be treated as the entry point. The other main methods will be treated as regular methods and can be called from within the class or other methods.

     public class MainMethod {
    public static void main(String[] args) {
        System.out.println("This is the main method.");
    }

    public static void main() {
        System.out.println("This is another main method.");
    }
   }



  6. Methos signature--
   
        public static void add(int a,int b){      // methos signature
        System.out.println(a+b);
        }
        
          The methos signature contains access modifier as public, private, static, default
          And contains the return type of data , if it not returning anything then we use Void
          Then we declare methos name and parameters are passed in the method.

public class SimpleMethodExample {
    public static void main(String[] args) {
        greet("John");
        int result = multiply(5, 7);
        System.out.println("The result is: " + result);
    }
    
    public static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome!");
    }
    
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
