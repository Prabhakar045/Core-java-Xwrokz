public class WashingMachine {
   static int minTime=0;
   static int maxTime=5;
   static int currentTime;
  static boolean isConnected ;

  public static boolean onOrOff() {
    System.out.println("invoking onOrOff()");


    if(isConnected==false){
        isConnected=true;
        System.out.println("washing machine turned on ");

    }else{
        isConnected=false;
        System.out.println("washing machine is turned off");
    }
    return isConnected;
  }


  public static void increaseTime(){

    if(isConnected==true){

        if(currentTime<maxTime){
                currentTime++;
        }else{
            System.out.println("washing machine at already maximum" +currentTime);
        }
    }else{
               System.out.println("connect to the washing machiine");
    }
  }

  public static void decreaseTime(){

    if(isConnected==true){
        
        if(currentTime>minTime){
            currentTime--;
            System.out.println("current time is decreased " +currentTime);

        }else{
            System.out.println("minimum time is reached ");

        }
    }else{
         System.out.println("first connect to the washing machine ");
    }
  }
}
