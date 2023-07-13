// public class LoginTester {
//     public static void main(String[] args) {

//         Login.login("prabhakar@gmail.com", "pbk123");

//         // Login.login(prabhkar@gmail.com, pbk123);
//         if (Login.isLoggedIn==true) {
//             System.out.println("Logged in with email: " + Login.loggedInEmail);
            
//             Login.logout();
//         }

//         System.out.println(" "+"\n");

//         Login.login(8431330277L, "password123");

//         if (Login.isLoggedIn==true) {
//             System.out.println("Logged in with phone number: " + Login.loggedInPhone);
//             // Perform operations after successful login
           
//             Login.logout();
//         }
//     }
// }

class LoginTester{
	public static void main(String log[]){

		Login.login("prabhakar@gmail.com","pbk123");
		Login.login(8431330277L,"pbk123");
        
		Login.login("prabhakar@gmail.com","pbk123");
		Login.login(8431330277L,"pbk123");
	}
}

