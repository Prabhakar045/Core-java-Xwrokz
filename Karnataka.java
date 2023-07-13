public class Karnataka {
    static String cityNames[] = {null, null, null, null, null};
    static int index;

    public static boolean addDistrict(String district) {
        boolean isAdded = false;

        if (index < cityNames.length) {
            if (district != null && district.length() > 0) {
                cityNames[index] = district;
                index++;
                isAdded = true;
            } else {
                System.out.println("Cannot add district. Either district is null or maximum capacity reached.");
            }
        } else {
            System.out.println("Cannot add more districts. Maximum capacity reached.");
        }

        return isAdded;
    }

    public static boolean updateCityName(String existingCityName, String updatedCityName) {
        boolean isUpdated = false;
        for (int cityIndex = 0; cityIndex < index; cityIndex++) {
            if (cityNames[cityIndex].equals(existingCityName)) {
                cityNames[cityIndex] = updatedCityName;
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public static void getAllcityNames() {
        System.out.println("Invoking getAllcityNames\n");

        for (int i = 0; i < index; i++) {
            String reference = cityNames[i];
            System.out.println("District: " + reference);
        }

        System.out.println("End of invoking getAllcityNames\n");
    }

    public static boolean deleteCityNames(String deletedCityNames) {
        System.out.println("Invoking deleteCityNames");

        boolean isDeleted = false;
        int cityIndex;
        int numberOfCities = index;

        for (cityIndex = 0; cityIndex < index; cityIndex++) {
            if (cityNames[cityIndex].equals(deletedCityNames)) {
                isDeleted = true;
                break;
            }
        }

        if (cityIndex < numberOfCities) {
            numberOfCities = numberOfCities - 1;
        }

        for (int newCityIndex = cityIndex; newCityIndex < numberOfCities; newCityIndex++) {
            cityNames[newCityIndex] = cityNames[newCityIndex + 1];
        }

        index--;
        return isDeleted;
    }

    public static void getAllcityNamesPostDeletion() {
        System.out.println("Invoking getAllcityNamesPostDeletion");

        for (int cityIndex = 0; cityIndex < index; cityIndex++) {
            System.out.println(cityNames[cityIndex]);
        }

        System.out.println("End of invoking getAllcityNamesPostDeletion\n");
    }
}
