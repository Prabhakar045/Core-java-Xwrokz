class MedicalStoresTester{
public static void main(String medicine[]){
//Medicine.getMedicineName();
MedicalStores.addMedicine("Paracetamol");
MedicalStores.addMedicine("Aspirin");              
MedicalStores.addMedicine("Cipla");            
MedicalStores.addMedicine("Ativan");             
MedicalStores.addMedicine("Diazepam");             
MedicalStores.addMedicine("Loratadine");             
MedicalStores.addMedicine("Amlodipine");           
MedicalStores.addMedicine("Amoxicillin");              
MedicalStores.addMedicine("Spironolactone");           
MedicalStores.addMedicine("Metformin");
MedicalStores.getAllMedicine();
boolean value=MedicalStores.updateMedicineName("Paracetamol","New Paracetamol");
boolean value1=MedicalStores.updateMedicineName("Aspirin","New Aspirin");
boolean value2=MedicalStores.updateMedicineName("Cipla","New Cipla");
boolean value3=MedicalStores.updateMedicineName("Ativan","New Ativan");
boolean value4=MedicalStores.updateMedicineName("Diazepam","New Diazepam");
MedicalStores.getAllMedicine();
MedicalStores.deleteMedicineName("New Ativan");
MedicalStores.getAllMedicineNamePostDeletetion();
}
}

