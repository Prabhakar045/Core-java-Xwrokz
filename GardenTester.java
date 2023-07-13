

class GardenTester {
    public static void main(String flower[]) {
        Garden.addFlower("rose");
        Garden.addFlower("jasmine");
        Garden.addFlower("lotus");
        Garden.addFlower("marigold");
        Garden.addFlower("moonflower");
        Garden.getAllFlower();

        Garden.updateFlowerName("rose", "rossie");
        Garden.getAllFlower();

        boolean deleteValue = Garden.deleteFlower("lotus");
        System.out.println(deleteValue);
        Garden.getAllFlowerPostDeletion();
    }
}
