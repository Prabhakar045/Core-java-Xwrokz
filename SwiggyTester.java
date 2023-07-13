public class SwiggyTester {
    public static void main(String[] args) {
        
        System.out.println("Main started");
        
        String foodName;
        
        System.out.println("Testing Swiggy:");
        
        foodName = "Chicken kabab";
        double price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
        double priceWithGivenQuantity=Swiggy.search("pizza", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity);

        foodName = "Cheese Fills";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
        double priceWithGivenQuantity1=Swiggy.search("Cheese Fills", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity1);

        foodName = "veg fried rice";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
        double priceWithGivenQuantity3=Swiggy.search("veg fried rice", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity3);

        foodName = "masala dosa";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity4=Swiggy.search("masala dosa", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity4);

        foodName = "Idle";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity5=Swiggy.search("Idle", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity5);

        foodName = "Ghee rice";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity6=Swiggy.search("Ghee rice", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity6);

        foodName = "Mutton curry";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity7=Swiggy.search("Mutton curry", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity7);

        foodName = "Coin parota";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity8=Swiggy.search("Coin parota", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity8);

        foodName = "veg kurma";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity9=Swiggy.search("veg kurma", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity9);

        foodName = "dal Makani";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity10=Swiggy.search("dal Makani", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity10);

        foodName = "jeera rice";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity11=Swiggy.search("jeera rice", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity11);

        foodName = "mutter mushroom";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity12=Swiggy.search("mutter mushroom", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity12);

        foodName = "phulka";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity13=Swiggy.search("phulka", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity13);

        foodName = "gulab jamun";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity14=Swiggy.search("gulab jamun", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity14);

        foodName = "bhindi fry";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity15=Swiggy.search("bhindi fry", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity15);

        foodName = "plain rice";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity16=Swiggy.search("plain rice", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity16);

        foodName = "Babycorn manchurian";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity17=Swiggy.search("Babycorn manchurian", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity17);

        foodName = "yellow dal";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity18=Swiggy.search("veg fried rice", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity18);

        foodName = "sweet lassi";
        price = Swiggy.search(foodName);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity19=Swiggy.search("sweet lassi", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity19);

        foodName = "aloo onion paratha";
        price = Swiggy.search(foodName,5);
        System.out.println("Price of food from Swiggy: " + price);
         double priceWithGivenQuantity20=Swiggy.search("aloo onion paratha", 5);
        System.out.println("the food prize with quantity " +priceWithGivenQuantity20);
        
        System.out.println("Main ended");
    }
}
