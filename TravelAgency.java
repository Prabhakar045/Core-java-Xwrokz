class TravellAgency{
static String touristNames[]={null,null,null,null,null,null,null,null};
static int index;
public static boolean addTourist(String tourist ){
boolean isAdded = false;
if(tourist!= null){
touristNames[index] = tourist;
index++;
isAdded = true;
}else{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllTourist(){
for(int tourist =0;tourist<touristNames.length;tourist++){
String ref=touristNames[tourist];
System.out.println(ref);
}
}
public static boolean updateTouristName(String existingTouristName,String updatedTouristName)
{
	boolean isUpdated=false;
	for(int j=0;j<touristNames.length;j++)
	{
		if(touristNames[j].equals(existingTouristName))
		{
		touristNames[j]=updatedTouristName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static boolean deleteTouristName(String deletedTouristName){
        System.out.println("invoking deleteTouristName");
       
        boolean isDeleted=false;
        int touristIndex;
        int noofElements=index;

        for(touristIndex=0; touristIndex<index;touristIndex++){
            if(touristNames[touristIndex].equals(deletedTouristName)){
				isDeleted=true;
                break;
            }
        }

        if(touristIndex<noofElements){
            noofElements=noofElements-1;
        }

        for(int newTouristIndex=touristIndex;newTouristIndex<noofElements;newTouristIndex++){
            touristNames[newTouristIndex]=touristNames[newTouristIndex+1];
        }
		index--;
        return isDeleted;

    }
    
    public static void getAllTouristNamePostDeletetion(){
        for(int touristIndex=0;touristIndex<index; touristIndex++){
            System.out.println(touristNames[touristIndex]);
    }
}
}