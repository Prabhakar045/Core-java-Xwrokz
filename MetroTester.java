class MetroTester{
public static void main(String station[]){
//Metro.getStationName();
Metro.addStation("Rajajinagar");
Metro.addStation("Yeshwanthpur");
Metro.addStation("Mahalakshmi");
Metro.addStation("Vijaynagar");
Metro.addStation("Mahathma Gandhi Road");
Metro.addStation("Jayanagar");
Metro.addStation("Banashankari");
Metro.getAllStation();
boolean value=Metro.updateStationName("Rajajinagar","Rajajinagar North-West of Bangalore");
boolean value1=Metro.updateStationName("Yeshwanthpur","Yeshwanthpur North-West of Bangalore");
boolean value2=Metro.updateStationName("Mahalakshmi","Mahalakshmi North-West of Bangalore");
boolean value3=Metro.updateStationName("Vijaynagar","Vijaynagar West of Bangalore");
boolean value4=Metro.updateStationName("Mahathma Gandhi Road","Mahathma Gandhi Road North of Bangalore");
boolean value5=Metro.updateStationName("Jayanagar","Jayanagar South of Bangalore");
boolean value6=Metro.updateStationName("Banashankari","Banashankari South of Bangalore");
Metro.getAllStation();
Metro.deleteStationName("Vijaynagar West of Bangalore");
Metro.getAllStationNamePostDeletetion();
}
}