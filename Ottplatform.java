// class OttPlatform{
   
//     String seriesName[];
//     int series;
    

//     public static addSeries(String seriesName){
//         boolean isAdded = false;
//         if(seriesName != null){

//             this.seriesName = seriesName;
//             isAdded = true;
//         }else{
//             System.out.println("netflix is used to watch");
//         }
//         return isAdded;
//     } 

//     public void getSeriesNames(){

//         System.out.println("the aeries names are:");
//         for(int index = 0; index <seriesNames.length; index++){


//     }
// }

class OttPlatform {
   
    String[] seriesNames;
    int seriesCount;

    public boolean addSeries(String seriesName) {
        if (seriesName != null && !seriesName.isEmpty()) {
            if (seriesCount < 10) { // Assuming the platform can hold up to 10 series
                if (seriesNames == null) {
                    seriesNames = new String[10];
                }
                seriesNames[seriesCount++] = seriesName;
                return true;
            } else {
                System.out.println("Cannot add more series. Platform is full.");
                return false;
            }
        } else {
            System.out.println("Series name cannot be empty or null.");
            return false;
        }
    }

    public void getSeriesNames() {
        if (seriesNames != null && seriesCount > 0) {
            System.out.println("The series names are:");
            for (int index = 0; index < seriesCount; index++) {
                System.out.println(seriesNames[index]);
            }
        } else {
            System.out.println("No series available on this platform.");
        }
    }
}
