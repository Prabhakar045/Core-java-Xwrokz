  public class Blender19 {
   static  String brand ;
   static  String model ;

    public static void main(String[] args) {
        String brand = "Vitamix";
        String model = "5200";
        String color = "Black";
        boolean hasVariableSpeed = true;
        double price = 1299;
        //String brand;  we cannot declare 2 times in local 

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Variable Speed: " + hasVariableSpeed);
        System.out.println("Price: $" + price);
    }
}
