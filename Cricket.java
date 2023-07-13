public class Cricket {
    
	// static String topMostBatsmans[]={"Virat Kohli", "Steve Smith", "Kane Williamson", "Joe Root", "Babar Azam", "David Warner", "Rohit Sharma", 
    // "Kumar Sangakkara", "AB de Villiers", "Ross Taylor"};
	// static String topTeamNamesOdis[]={"India", "Australia", "England", "New Zealand", "Pakistan", "South Africa", "West Indies", "Sri Lanka", "Bangladesh", "Afghanistan"};
    // static String iplTeamNames[]={"Mumbai Indians", "Chennai Super Kings", "Royal Challengers Bangalore", "Kolkata Knight Riders", 
    // "Delhi Capitals", "Punjab Kings", "Rajasthan Royals", "Sunrisers Hyderabad", "Gujarat Titans", "Lucknow Super Gaints"};	
	public static void main(String ct[]){

    String topMostBatsmans[]={"Virat Kohli", "Steve Smith", "Kane Williamson", "Joe Root", "Babar Azam", "David Warner", "Rohit Sharma", 
    "Kumar Sangakkara", "AB de Villiers", "Ross Taylor"};
	 String topTeamNamesOdis[]={"India", "Australia", "England", "New Zealand", "Pakistan", "South Africa", "West Indies", "Sri Lanka", "Bangladesh", "Afghanistan"};
     String iplTeamNames[]={"Mumbai Indians", "Chennai Super Kings", "Royal Challengers Bangalore", "Kolkata Knight Riders", 
    "Delhi Capitals", "Punjab Kings", "Rajasthan Royals", "Sunrisers Hyderabad", "Gujarat Titans", "Lucknow Super Gaints"};	
        //  for(int i=0; i<=topMostBatsman.length-1;){

        //     System.out.println(topMostBatsman[i]);
        //     i++;

        // }
      getTopMostBatsmans(topMostBatsmans);
        // for(String prabhakar:topMostBatsmans){
        //            System.out.println(prabhakar);
        // }
        // System.out.println(topMostBatsman[0] + " " + topMostBatsman[1] + " " + topMostBatsman[2] + " " + 
        // topMostBatsman[3] + " " + topMostBatsman[4] + " " + topMostBatsman[5] + " " +topMostBatsman[6] + " " +topMostBatsman[7] + " " +topMostBatsman[8] + " " + topMostBatsman[9] + "\n " );
		
        //  for(int i=0; i<=topTeamNamesOdi.length-1;){

        //     System.out.println(topTeamNamesOdi[i]);
        //     i++;

        // }
        getTopTeamNamesOdis(topTeamNamesOdis);
        // for(String topTeamNamesOdi:topTeamNamesOdis){
        //            System.out.println(topTeamNamesOdi);
        // }
        // // System.out.println(topTeamNamesOdi[0]+" "+topTeamNamesOdi[1]+" "+topTeamNamesOdi[2]+" "+topTeamNamesOdi[3]+" "+topTeamNamesOdi[4]+" "+topTeamNamesOdi[5]+" "+
        // topTeamNamesOdi[6]+" "+topTeamNamesOdi[7]+" "+topTeamNamesOdi[8]+" "+topTeamNamesOdi[9]+"\n");
     
        //  for(int i=0; i<=iplTeamNames   .length-1;){

        //     System.out.println(iplTeamNames[i]);
        //     i++;

        // }
        getIplTeamNames(iplTeamNames);
        // for(String iplTeamName:iplTeamNames){
        //            System.out.println(iplTeamName);
        // }
        // System.out.println(iplTeamNames[0]+" "+iplTeamNames[1]+" "+iplTeamNames[2]+" "+iplTeamNames[3]+" "+iplTeamNames[4]+" "+iplTeamNames[5]
        // +" "+iplTeamNames[6]+" "+iplTeamNames[7]+" "+iplTeamNames[8]+"  "+iplTeamNames[9]+"\n ");

    }


    public static void getTopMostBatsmans(String topMostBatsmans[]) {
        for(String prabhakar:topMostBatsmans){
                   System.out.println(prabhakar);
        } 
    }

    public static void getTopTeamNamesOdis(String topTeamNamesOdis[]) {
        for(String topTeamNamesOdi:topTeamNamesOdis){
                   System.out.println(topTeamNamesOdi);
        }
        
    }

    public static void getIplTeamNames(String iplTeamNames[]) {
        for(String iplTeamName:iplTeamNames){
                   System.out.println(iplTeamName);
        }
    }
    
    
}
