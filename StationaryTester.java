public class StationaryTester {

    public static void main(String[] args) {

        // String sName;
        Stationary.addItem("pen");
        Stationary.addItem("book");
        Stationary.addItem("paper");
        Stationary.addItem("A4 sheet");
        Stationary.addItem("blue pen");
        Stationary.addItem("Ink pen");
        Stationary.addItem("Safety pin");
        Stationary.addItem("black pen");

        Stationary.getAllstationaryItem();

        Stationary.updateItemName("Safety pin", "Cardboard sheet");

        Stationary.deleteStationaryItem("Ink pen");
        Stationary.getAllsStationaryItemPostDeletion();

        Stationary.searchStationaryName("Ink pen");
        System.out.println("got item is " );
         Stationary.getAllstationaryItem();
        
    }
}