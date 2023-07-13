public class HotelMenu {
     
	// static String menuCard[]={"Butter Chicken", "Biryani", "Tandoori Chicken", "Rogan Josh", "Masala Dosa", "Palak Paneer", 
    // "Chole Bhature", "Pav Bhaji", "Aloo Paratha", "Samosa", "Chicken Tikka Masala", "Malai Kofta", "Chicken Biryani", "Pani Puri", 
    // "Rogan Josh", "Hyderabadi Biryani", "Dal Makhani", "Naan", "Chicken Curry", "Dahi Vada", "Mutton Curry", "Vada Pav", "Paneer Tikka", 
    // "Chole Kulche", "Matar Paneer", "Chicken Korma", "Butter Naan", "Rajma Chawal", "Aloo Tikki", "Chicken 65", "Bhel Puri", "Gobi Manchurian", 
    // "Fish Curry", "Mutton Biryani", "Prawn Masala", "Kadai Paneer", "Idli", "Pongal", "Masala Chai", "Rabri", "Gulab Jamun", "Jalebi", "Rasmalai",
    //  "Rasgulla", "Gajar Halwa", "Kheer", "Kulfi", "Falooda", "Lassi", "Paan"};
	public static void main(String ft[]){
		// System.out.println("Main started");

     String menuCard[]={"Butter Chicken", "Biryani", "Tandoori Chicken", "Rogan Josh", "Masala Dosa", "Palak Paneer", 
      "Chole Bhature", "Pav Bhaji", "Aloo Paratha", "Samosa", "Chicken Tikka Masala", "Malai Kofta", "Chicken Biryani", "Pani Puri", 
      "Rogan Josh", "Hyderabadi Biryani", "Dal Makhani", "Naan", "Chicken Curry", "Dahi Vada", "Mutton Curry", "Vada Pav", "Paneer Tikka", 
      "Chole Kulche", "Matar Paneer", "Chicken Korma", "Butter Naan", "Rajma Chawal", "Aloo Tikki", "Chicken 65", "Bhel Puri", "Gobi Manchurian", 
      "Fish Curry", "Mutton Biryani", "Prawn Masala", "Kadai Paneer", "Idli", "Pongal", "Masala Chai", "Rabri", "Gulab Jamun", "Jalebi", "Rasmalai",
      "Rasgulla", "Gajar Halwa", "Kheer", "Kulfi", "Falooda", "Lassi", "Paan"};
        //  for(int i=0; i<=menuCard.length-1;){

        //     System.out.println(menuCard[i]);
        //     i++;

        // }
      getmenuCard(menuCard);
        // for(String  foodType:menuCard){
        //     System.out.println(foodType);
        // }
	    // System.out.println(menuCard[0] + " " + menuCard[1] + " " + menuCard[2] + " " + menuCard[3] + " " + menuCard[4] + " " + 
        // menuCard[5] + " " + menuCard[6] + " " + menuCard[7] + " " + menuCard[8] + " " + menuCard[9] + " " + menuCard[10] + " " + menuCard[11] + " " + menuCard[12] + " " + 
        // menuCard[13] + " " + menuCard[14] + " " + menuCard[15] + " " + menuCard[16] + " " + menuCard[17] + " " + menuCard[18] + " " + menuCard[19] + " " + menuCard[20] + " " + menuCard[21] + " " + menuCard[22] + " " + 
        // menuCard[23] + " " + menuCard[24] + " " + menuCard[25] + " " + menuCard[26] + " " + menuCard[27] + " " + menuCard[28] + " " + menuCard[29] + " " + menuCard[30] + " " + menuCard[31] + " " + menuCard[32] + " " + menuCard[33] 
        // + " " + menuCard[34] + " " + menuCard[35] + " " + menuCard[36] + " " + menuCard[37] + " " + menuCard[38] + " " + menuCard[39] + " " + menuCard[40] + " " + menuCard[41] + " " + menuCard[42] + " " + menuCard[43] + " " + menuCard[44] + " " + menuCard[45] + " " + menuCard[46] + " " + menuCard[47] + " " + menuCard[48] + " " + menuCard[49]);
        System.out.println("Main ended");
 }

 public static void getmenuCard(String menuCard[]) {
    for(String  menu:menuCard){
            System.out.println(menu);
        }
 }
}

