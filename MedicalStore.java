class MedicalStores{
static String medicineNames[]={null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addMedicine(String medicine ){
boolean isAdded = false;
if(medicine!= null){
medicineNames[index] = medicine;
index++;
isAdded = true;
}else{
System.out.println("cannot add ");
}
return isAdded;
}
public static void getAllMedicine(){
for(int medicine =0; medicine<medicineNames.length; medicine++){
String ref=medicineNames[medicine];
System.out.println(ref);
}
}
public static boolean updateMedicineName(String existingMedicineName,String updatedMedicineName)
{
	boolean isUpdated=false;
	for(int j=0;j<medicineNames.length;j++)
	{
		if(medicineNames[j].equals(existingMedicineName))
		{
		medicineNames[j]=updatedMedicineName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static boolean deleteMedicineName(String deletedMedicineName){
        System.out.println("invoking deleteMedicineName");
       
        boolean isDeleted=false;
        int medicineIndex;
        int noofElements=index;

        for(medicineIndex=0; medicineIndex<index;medicineIndex++){
            if(medicineNames[medicineIndex].equals(deletedMedicineName)){
				isDeleted=true;
                break;
            }
        }

        if(medicineIndex<noofElements){
            noofElements=noofElements-1;
        }

        for(int newMedicineIndex=medicineIndex;newMedicineIndex<noofElements;newMedicineIndex++){
            medicineNames[newMedicineIndex]=medicineNames[newMedicineIndex+1];
        }
		index--;
        return isDeleted;

    }
    
    public static void getAllMedicineNamePostDeletetion(){
        for(int medicineIndex=0;medicineIndex<index; medicineIndex++){
            System.out.println(medicineNames[medicineIndex]);
    }
}
}