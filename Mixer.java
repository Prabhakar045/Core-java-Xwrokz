public class Mixer {
    
    static int minSpeed;
    static int maxSpeed=5;
    static int currentSpeed;
    static boolean isConnected;

    // Methods
    public static boolean onOrOff() {
        System.out.println("Invoking onOrOff()");
        
        if (isConnected==false) {
            isConnected = true;
            System.out.println("Mixer is turned on");
        } else {
            isConnected = false;
            System.out.println("Mixer is turned off");
        }
        
        return isConnected;
    }

    public static void increaseSpeed() {
        if (isConnected==true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Speed increased to " + currentSpeed);
            } else {
                System.out.println("Mixer is already at maximum speed");
            }
        } else {
            System.out.println("Connect the Mixer first");
        }
    }

    public static void decreaseSpeed() {
        if (isConnected==true) {
            if (currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Speed decreased to " + currentSpeed);
            } else {
                System.out.println("Mixer is already at minimum speed");
            }
        } else {
            System.out.println("Connect the Mixer first");
        }
    }
}
