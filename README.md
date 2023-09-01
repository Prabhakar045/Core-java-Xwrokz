public enum Gender {

     //public final static String MALE = "male";
    //enum is a constant and enum help us o provide const to the java files
   

    male,female, transgender;
    Gender(){   //Constrcuctor foe enum

    }
}


enum --> public final static String MALE = "male";(Instead of writing whole thing we just write this data types like -> male,female, transgender;


public class Hospital {

    Patient patient;                        //This will work if only one Patient is available not more than one

    public boolean createPatient(Patient patient){

        boolean isAdded=false;
        if(patinet != null){                           // All non-primitive dataType have  default value as  null

            this.patient=patient;
            isAdded=true;
        }else{
            System.out.println("No patient is not available");
        }


        return isAdded;
    }
}
 
