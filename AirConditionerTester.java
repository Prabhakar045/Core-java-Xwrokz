public class AirConditionerTester {
    public static void main(String[] args) {
        
        boolean connected = AirConditioner.onOrOff();
        System.out.println("ac is connected " +connected);


        System.out.println("Increasing tempeaure.................");
        AirConditioner.increaseTemperature();
        AirConditioner.increaseTemperature();
        AirConditioner.increaseTemperature();
        AirConditioner.increaseTemperature();
       
        boolean connected1 =AirConditioner.onOrOff();
        System.out.println("ac is connected " +connected1);
        AirConditioner.onOrOff();
        AirConditioner.decreaseTemperature();
        AirConditioner.decreaseTemperature();
        AirConditioner.decreaseTemperature();
        AirConditioner.decreaseTemperature();


    }
}
