public class MixerTester {
    public static void main(String[] args) {
        
        boolean connected = Mixer.onOrOff();
        System.out.println("mixer is connected " +connected);
        Mixer.increaseSpeed();
        Mixer.increaseSpeed();
        Mixer.increaseSpeed();
        Mixer.increaseSpeed();

        boolean connected1 = Mixer.onOrOff();
        System.out.println("mixer is connected " +connected1);
        Mixer.decreaseSpeed();
        Mixer.decreaseSpeed();
        Mixer.decreaseSpeed();
    }
}
