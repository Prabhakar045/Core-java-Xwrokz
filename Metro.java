class Metro{
static String stationNames[]={null,null,null,null,null,null,null};
static int index;
public static boolean addStation(String station ){
boolean isAdded = false;
if(station!= null){
stationNames[index] = station;
index++;
isAdded = true;
}else{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllStation(){
for(int station=0;station<stationNames.length;station++){
String ref=stationNames[station];
System.out.println(ref);
}
}
public static boolean updateStationName(String existingStationName,String updatedStationName)
{
	boolean isUpdated=false;
	for(int j=0;j<stationNames.length;j++)
	{
		if(stationNames[j].equals(existingStationName))
		{
		stationNames[j]=updatedStationName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static boolean deleteStationName(String deletedStationName){
        System.out.println("invoking deleteStationName");
       
        boolean isDeleted=false;
        int stationIndex;
        int noofElements=index;

        for(stationIndex=0; stationIndex<index;stationIndex++){
            if(stationNames[stationIndex].equals(deletedStationName)){
				isDeleted=true;
                break;
            }
        }

        if(stationIndex<noofElements){
            noofElements=noofElements-1;
        }

        for(int newStationIndex=stationIndex;newStationIndex<noofElements;newStationIndex++){
            stationNames[newStationIndex]=stationNames[newStationIndex+1];
        }
		index--;
        return isDeleted;

    }
    
    public static void getAllStationNamePostDeletetion(){
        for(int stationIndex=0;stationIndex<index; stationIndex++){
            System.out.println(stationNames[stationIndex]);
    }
}
}