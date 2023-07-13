public class LargestNumber {
    // public static void main(String[] args) {

    //     int[] price = {567, 78, 12, 90, 1};
    //     int largest = findLargestNumber(price);
    //     System.out.println("The largest number is: " + largest);
        
    // }

   
    
    public static int findLargestNumber(int[] arr) {
        
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
