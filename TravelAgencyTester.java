class TravellAgencyTester{
public static void main(String tourist[]){
//Travell.gettouristName();
TravellAgency.addTourist("Goa");
TravellAgency.addTourist("Agra");
TravellAgency.addTourist("Rajasthan");
TravellAgency.addTourist("Delhi");
TravellAgency.addTourist("Munnar");
TravellAgency.addTourist("Coorg");
TravellAgency.addTourist("Manali");
TravellAgency.addTourist("Ooty");
TravellAgency.getAllTourist();
boolean value=TravellAgency.updateTouristName("Goa","goa");
boolean value1=TravellAgency.updateTouristName("Agra","agra ");
boolean value2=TravellAgency.updateTouristName("Rajasthan","rajasthani");
boolean value3=TravellAgency.updateTouristName("Delhi","delhiii");
boolean value4=TravellAgency.updateTouristName("Munnar","munnar");
TravellAgency.getAllTourist();
TravellAgency.deleteTouristName("delhiii");
TravellAgency.getAllTouristNamePostDeletetion();
}
}