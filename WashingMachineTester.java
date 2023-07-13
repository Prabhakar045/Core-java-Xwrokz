public class WashingMachineTester {
    
    public static void main(String[] args) {
        
        boolean connected = WashingMachine.onOrOff();
        System.out.println("washing machine is connected " +connected);
        WashingMachine.increaseTime();
        WashingMachine.increaseTime();
        WashingMachine.increaseTime();
        WashingMachine.increaseTime();
        WashingMachine.increaseTime();
        WashingMachine.increaseTime();


        boolean connected1 = WashingMachine.onOrOff();
        System.out.println("washing machine is connected " +connected1);
        WashingMachine.decreaseTime();
        WashingMachine.decreaseTime();
        WashingMachine.decreaseTime();
        WashingMachine.decreaseTime();
        WashingMachine.decreaseTime();
    }
}
