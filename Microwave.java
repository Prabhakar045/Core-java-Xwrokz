public class Microwave {
    
    static int minTime=0;
    static int maxTime=10;
    static int currentTime;
    static boolean isConnected;

    // Methods
    public static boolean onOrOff() {
        System.out.println("Invoking onOrOff()");
        
        if (isConnected==false) {
            isConnected = true;
            System.out.println("Microwave is turned on");
        } else {
            isConnected = false;
            System.out.println("Microwave is turned off");
        }
        
        return isConnected;
    }

    public static void increaseTime() {
        if (isConnected==true) {
            if (currentTime < maxTime) {
                currentTime++;
                System.out.println("Time increased to " + currentTime + " seconds");
            } else {
                System.out.println("Microwave is already at maximum time");
            }
        } else {
            System.out.println("Connect the Microwave first");
        }
    }

    public static void decreaseTime() {
        if (isConnected==true) {
            if (currentTime > minTime) {
                currentTime--;
                System.out.println("Time decreased to " + currentTime + " seconds");
            } else {
                System.out.println("Microwave is already at minimum time");
            }
        } else {
            System.out.println("Connect the Microwave first");
        }
    }
}
