public class SpeakerTester {
    public static void main(String[] args) {
        System.out.println("main started");

        Speaker.name="JBL ";
        boolean connected = Speaker.onOrOff();
        System.out.println("speaker is connected" +connected);
       
        Speaker.onOrOff();
        Speaker.increaseVolume();
        Speaker.increaseVolume();
        Speaker.increaseVolume();
        Speaker.increaseVolume();
        Speaker.increaseVolume();
        

        boolean connected1 = Speaker.onOrOff();
        System.out.println("speaker is connected" +connected1);
        Speaker.decreaseVolume();
        Speaker.decreaseVolume();
        Speaker.decreaseVolume();
        Speaker.decreaseVolume();
        Speaker.decreaseVolume();
        Speaker.decreaseVolume();
            
                
        System.out.println("main ended");
        
    }

    
}
