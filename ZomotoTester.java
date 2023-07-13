public class ZomotoTester {
    public static void main(String[] args) {
        
        System.out.println("main started");
        String foodName;

        foodName="Chicken Lollypop"; // external referencing
        double priceOfFood=Zomoto.search(foodName);
        System.out.println("the price of food is " +priceOfFood);


        double price = Zomoto.search("pizza");     // internal ref
        System.out.println("Price of food" + price);

        foodName = "chicken biryani";
        price = Zomoto.search(foodName);
        System.out.println("Price of food  " + price);

        foodName = "mutton biryani";
        price = Zomoto.search(foodName);
        System.out.println("Price of food " + price);

        foodName = "Veg Whopper";
        price = Zomoto.search(foodName);
        System.out.println("Price of food"  + price);

        foodName = "Crispy Chicken Burger";
        price = Zomoto.search(foodName);
        System.out.println("Price of food" + price);

        foodName = "Crispy Veg Burger";
        price = Zomoto.search(foodName);
        System.out.println("Price of food"  + price);

        foodName = "Paneer Royale Burger";
        price = Zomoto.search(foodName);
        System.out.println("Price of " + price);

        foodName = "BK Chicken Burger";
        price = Zomoto.search(foodName);
        System.out.println("Price of " + price);

        foodName = "King Fries";
        price = Zomoto.search(foodName);
        System.out.println("Price of food"  + price);

        foodName = "Andhra Non Veg Meals";
        price = Zomoto.search(foodName);
        System.out.println("Price of food"+ price);

        foodName = "Nellore Chicken Biryani";
        price = Zomoto.search(foodName);
        System.out.println("Price of food" + price);

        foodName = "Curd Rice";
        price = Zomoto.search(foodName);
        System.out.println("Price of food "+price);

        foodName = "Mutton Masala";
        price = Zomoto.search(foodName);
        System.out.println("Price of food " +price);

        foodName = "Chicken Lollypop";
        price = Zomoto.search(foodName);
        System.out.println("Price of food "+price);

        foodName = "Gulab Jamoon";
        price = Zomoto.search(foodName);
        System.out.println("Price of food " + price);

        foodName = "Babycorn Pepper Dry";
        price = Zomoto.search(foodName);
        System.out.println("Price of food "  + price);

        foodName = "Chicken Sholay Kebab";
        price = Zomoto.search(foodName);
        System.out.println("Price of food "  + price);

        foodName = "Drumstick Soup";
        price = Zomoto.search(foodName);
        System.out.println("Price of food  "+ price);
        
        System.out.println("Main ended");
    }
}



































        // String foodName = "pizza";
        // double price = Zomoto.search(foodName);
        // System.out.println("Price of " + price);

        // foodName = "chicken biryani";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of " + price);

        // foodName = "mutton biryani";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of " + price);

        // foodName = "Veg Whopper";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of "  + price);

        // foodName = "Crispy Chicken Burger";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of " + price);

        // foodName = "Crispy Veg Burger";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of "  + price);

        // foodName = "Paneer Royale Burger";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of " + price);

        // foodName = "BK Chicken Burger";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of " + price);

        // foodName = "King Fries";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of "  + price);

        // foodName = "Andhra Non Veg Meals";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of "+ price);

        // foodName = "Nellore Chicken Biryani";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of " + price);

        // foodName = "Curd Rice";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of "+price);

        // foodName = "Mutton Masala";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of " +price);

        // foodName = "Chicken Lollypop";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of "+price);

        // foodName = "Gulab Jamoon";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of " + price);

        // foodName = "Babycorn Pepper Dry";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of "  + price);

        // foodName = "Chicken Sholay Kebab";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of "  + price);

        // foodName = "Drumstick Soup";
        // price = Zomoto.search(foodName);
        // System.out.println("Price of "+ price);

        // foodName = "Prawn Ghee Roast";
        // price = Zomoto.search(foodName);
