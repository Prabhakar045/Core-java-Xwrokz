// import java.util.*;

// class OttPlatformTester{
//     public static void main(String ott[]){

        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of Series name");
//         int size=sc.nextInt();
//         Netflix net=new Netflix();

//         net.addSeries("The Glory");




//         net.getSeriesNames();
//     }
// } 

import java.util.*;

class OttPlatformTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Series name");
        int size = sc.nextInt();

        OttPlatform net = new OttPlatform();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter series name " + (i + 1) + ": ");
            String seriesName = sc.next();
            net.addSeries(seriesName);
        }

        net.getSeriesNames();
    }
}
