public class Speaker {
    static String name="JBL";
	static int minVolume;
	static int currentVolume;
	static int maxVolume = 6;
	static boolean isConnected;

    // Methods   
	public static boolean onOrOff(){

		System.out.println("Invoking onOrOff()");
		System.out.println("Parameter" + 0);

        // false == false
		if(isConnected==false){
			isConnected=true;
			System.out.println("Speaker is Turned On");
		}

        // true== true;
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Speaker is Turned Off");
		}
		return isConnected;
	}
 
  

//     public static boolean onOrOff() {
//     System.out.println("Invoking onOrOff()");
//     System.out.println("Parameter: " + 0);

//     isConnected = !isConnected;
//     System.out.println("Speaker is Turned " + (isConnected ? "On" : "Off"));

//     return isConnected;
// }


// increase volume decrease volume
 
public static void increaseVolume(){
    
   if(isConnected=true){ 
    if(currentVolume < maxVolume){
        currentVolume=currentVolume +1;
    }else{
        System.out.println("max volume is reached"+currentVolume);
    }
}
else{

    System.out.println("hero.. speaker connect madu");

     }
}
    



public static void decreaseVolume(){
    if(isConnected=true){
        if(currentVolume>minVolume){
            currentVolume=currentVolume-1;

        }else{
            System.out.println("volume is already maximium"+currentVolume);
        }

    }else{
           System.out.println("speaker not connected");
    }
}
    
}   
