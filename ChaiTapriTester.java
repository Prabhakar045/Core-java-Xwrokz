public class ChaiTapriTester {
    public static void main(String[] args) {
        
        ChaiTapri.addChai("masala tea");
        ChaiTapri.addChai("ginger tea");
        ChaiTapri.addChai("choclate chai");
        ChaiTapri.addChai("lemon ice chai");
        ChaiTapri.addChai("Apple ice chai");
        ChaiTapri.addChai("canberry ice chai");
        ChaiTapri.addChai("mango spicy chai");
        ChaiTapri.addChai("kadakk chai");
        ChaiTapri.addChai("sugar less chai");
        ChaiTapri.addChai("Hot green chai");

        // ChaiTapri.getLocation();
        // ChaiTapri.addChai("green  tea");      Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        
        ChaiTapri.getAllChaiAvailable();

        orderChaiWithSutta("masala tea" ,"kadakk tea", 2,2);
    }

    public static void orderChaiWithSutta(String chaiType, String chaiType2, int quantity, int sutta){
         System.out.println("Ordering chai, " +quantity +" cup of "  +chaiType +  " and " + chaiType2 + " with sutta quantity " +sutta  );
    }

    public static String getLocation() {
        return ChaiTapri.location;
    
    
}
}