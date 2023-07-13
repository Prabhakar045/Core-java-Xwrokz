// public class Login {
//     static boolean isLoggedIn;
//     static String loggedInEmail;
//     static long loggedInPhone;


  
//     public static void login(String email, String password) {
       
       
//         //  email and password 
//         if (email==("prabhakar@gmail.com") && password==("pbk123")) {
//             System.out.println("Login Successful");
//             isLoggedIn = true;
//             loggedInEmail = email;
//         } else {
//             System.out.println("Invalid email or password");
//         }
//     }

//     public static void login(long phoneNO, String password) {
//         // Phone number and password 
//         if (phoneNO==8431330277L && password==("password123")) {
//             System.out.println("Login Successful");
//             isLoggedIn = true;
//              loggedInPhone = phoneNO;
//         } else {
//             System.out.println("Invalid email or password");
//         }
//     }

//     // Method logout
//     public static void logout() {
//         isLoggedIn = false;
//         loggedInEmail = null;
//         // loggedInPhone=null;
//         System.out.println("Logged out successfully");
//     }
// }


class Login{

   static  boolean isLogin;
   
   public static boolean login(String email,String password){
       
   

	   if(email != ""&& password !=""){

	     if(email=="prabhakar@gmail.com" && password=="pbk123"){
		   isLogin=true;
		   System.out.println("Login is Successfull");
		 
		 }
		 else{
		   isLogin=false;
		   System.out.println("Invalid Email Or Password");
		 }
	   }else{
	   System.out.println("Provide correct credentials");
	   }
       return isLogin;
   }

   public static boolean login(long mobileNo,String password){

        boolean isLogin=false;
		if(mobileNo!=0 && password!="" ){
		  if(mobileNo==8431330277L && password=="pbk123"){
		  isLogin=true;
		  System.out.println("Login to FB is Successfull ");
		  }
		  else{
		    isLogin=false;
			System.out.println("Invalid user identity ..Try agaain");
		  }
        }
		else{
		  isLogin=false;
		  System.out.println("Provide correct Identity");
		}
		
		
        return isLogin;
    }
    
}

