public class MicrowaveTester {
    public static void main(String[] args) {
        
        boolean connected = Microwave.onOrOff();
        System.out.println("microwave is connected" +connected);
        Microwave.increaseTime();
        Microwave.increaseTime();
        Microwave.increaseTime();
        Microwave.increaseTime();

        boolean connected1=Microwave.onOrOff();
        System.out.println("miceowave is connected " +connected1);
        Microwave.decreaseTime();
        Microwave.decreaseTime();
        Microwave.decreaseTime();
        Microwave.decreaseTime();
    }
}
