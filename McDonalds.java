class McDonalds{
   public static double search(String foodName){
	   if("Hamburger" == foodName){
		   System.out.println("The searched Food is" + foodName);
		   return 99.00;
	   }
	   if("Double Cheeseburger"== foodName){
		   System.out.println("The searched Food is" + foodName);
		   return 199.00;
	   }
	   if("Triple Cheeseburger"== foodName){
		 System.out.println("The searched Food is" + foodName);
		 return 299.00;
	   }
	   if("Big Mac"== foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 399.00;
	   }
	   if("Quarter Pounder"==foodName){
		   System.out.println("The searched Food is" + foodName); 
		  return 499.00; 
	   }
       if("Big N' Tasty"==foodName){
	    System.out.println("The searched Food is" + foodName);
	   return 599.00;
       }
       if("McDouble"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 699.00;
	   }
	   if("Bacon McDouble"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 799.00;
	   }
	   if("Daily Double"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 899.00;
	   }
	   if("McFeast"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 99.00;
	   }
	   if("McChicken"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 199.00;
	   }
	   if("McNuggets"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 299.00;
	   }
	   if("Premium Chicken Sandwiches"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 399.00;
	   }
	   if("Premium Chicken Deluxe"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 499.00;
	   }
	   if("Grilled Chicken Deluxe"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 599.00;
	   }
	   if("Taste-Crafted"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 699.6;
	   }
	   if("Deli Choices"==foodName){
		    System.out.println("The searched Food is" + foodName);
			return 159.00;
	   }
	   if("Snack Wrap"==foodName ){
		    System.out.println("The searched Food is" + foodName);
			return 129.00;   
	   }
	   if("Premium Chicken McWrap"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 499.00;
	   }
	   if("Chicken McBites"==foodName){
		    System.out.println("The searched Food is" + foodName);
		   return 259.00;
	   }
	   return 0.0;
   }

   public static double search(String foodName, double quantity){
	   if("Hamburger" == foodName){
		   System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 99.00*quantity;
	   }
	   if("Double Cheeseburger"== foodName){
		   System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 199.00*quantity;
	   }
	   if("Triple Cheeseburger"== foodName){
		 System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		 return 299.00*quantity;
	   }
	   if("Big Mac"== foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 399.00*quantity;
	   }
	   if("Quarter Pounder"==foodName){
		   System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity); 
		  return 499.00*quantity; 
	   }
       if("Big N' Tasty"==foodName){
	    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
	   return 599.00*quantity;
       }
       if("McDouble"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 699.00*quantity;
	   }
	   if("Bacon McDouble"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 799.00*quantity;
	   }
	   if("Daily Double"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 899.00*quantity;
	   }
	   if("McFeast"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 99.00*quantity;
	   }
	   if("McChicken"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 199.00*quantity;
	   }
	   if("McNuggets"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 299.00*quantity;
	   }
	   if("Premium Chicken Sandwiches"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 399.00*quantity;
	   }
	   if("Premium Chicken Deluxe"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 499.00*quantity;
	   }
	   if("Grilled Chicken Deluxe"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 599.00;
	   }
	   if("Taste-Crafted"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 699.6*quantity;
	   }
	   if("Deli Choices"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
			return 159.00*quantity;
	   }
	   if("Snack Wrap"==foodName ){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
			return 129.00*quantity;   
	   }
	   if("Premium Chicken McWrap"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 499.00*quantity;
	   }
	   if("Chicken McBites"==foodName){
		    System.out.println("The searched Food is" + foodName+" , Quantity: "+quantity);
		   return 259.00*quantity;
	   }
	   return 0.0;
}
}