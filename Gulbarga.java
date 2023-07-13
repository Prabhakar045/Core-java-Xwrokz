public class Gulbarga {

   static String villages[] = {null, null , null,null}; 
   static int index;

   public static boolean addVilleges(String village){
     boolean isAdded = false;

     if(village != null){

        villages[index++]=village;
        // index++;
        isAdded=true;

     }else{
         System.out.println("cannot add villages bcz input parametr is null");
     }

    return isAdded;
   }


    public static void getAllVillages(){
        System.out.println("invoking getAllvillages");

        for(int i=0; i<villages.length;i++){
            String reference = villages[i];
            System.out.println("villages: " + reference);

        }
    }
}
