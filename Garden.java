class Garden {
    static String flowerNames[] = {null, null, null, null, null};
    static int index;

    public static boolean addFlower(String flower) {
        boolean isAdded = false;
        if (flower != null) {
            flowerNames[index] = flower;
            index++;
            isAdded = true;
        } else {
            System.out.println("Cannot add null flower.");
        }
        return isAdded;
    }

    public static void getAllFlower() {
        System.out.println("Invoking getAllFlower\n");
        for (int flower = 0; flower < index; flower++) {
            String ref = flowerNames[flower];
            System.out.println(ref);
        }
        System.out.println("End of invoking getAllFlower\n");
    }

    public static boolean updateFlowerName(String existingFlowerName, String updatedFlowerName) {
        boolean isUpdated = false;
        for (int j = 0; j < index; j++) {
            if (flowerNames[j] != null && flowerNames[j].equals(existingFlowerName)) {
                flowerNames[j] = updatedFlowerName;
                isUpdated = true;
                break;
            }
        }
        return isUpdated;
    }

    public static boolean deleteFlower(String deletedFlowerName) {
        System.out.println("Invoking deleteFlower");
        boolean isDeleted = false;
        int flowerIndex = -1;

        for (int i = 0; i < index; i++) {
            if (flowerNames[i] != null && flowerNames[i].equals(deletedFlowerName)) {
                flowerIndex = i;
                break;
            }
        }

        if (flowerIndex != -1) {
            for (int i = flowerIndex; i < index - 1; i++) {
                flowerNames[i] = flowerNames[i + 1];
            }
            flowerNames[index - 1] = null;
            index--;
            isDeleted = true;
        }

        return isDeleted;
    }

    public static void getAllFlowerPostDeletion() {
        System.out.println("Invoking getAllFlowerPostDeletion\n");
        for (int flowerIndex = 0; flowerIndex < index; flowerIndex++) {
            System.out.println(flowerNames[flowerIndex]);
        }
        System.out.println("End of invoking getAllFlowerPostDeletion\n");
    }
}