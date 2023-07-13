class IceCreamTester{
public static void main(String ice[]){
//IceCream.geticeName();
IceCream.addIce("Brownie");
IceCream.addIce("Chocolate");
IceCream.addIce("Kiwi");
IceCream.addIce("Red Velvet");
IceCream.addIce("Avocada");
IceCream.addIce("Mocha");
IceCream.getAllIce();
boolean value=IceCream.updateIceName("Brownie","Blackice");
boolean value1=IceCream.updateIceName("Chocolate","Chocolate cream");
boolean value2=IceCream.updateIceName("Kiwi","Kiwi Fruit");
boolean value3=IceCream.updateIceName("Red Velvet","Redvelvet");
boolean value4=IceCream.updateIceName("Avocada","Green Avocada");
boolean value5=IceCream.updateIceName("Mocha","Mocha Flavor");
IceCream.getAllIce();
IceCream.deleteIceName("Kiwi Fruit");
IceCream.getAllIceNamePostDeletetion();
}
}