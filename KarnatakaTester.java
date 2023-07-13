
public class KarnatakaTester {
    public static void main(String[] args) {
        Karnataka.addDistrict("Bengaluru");
        Karnataka.addDistrict("Mysuru");
        Karnataka.addDistrict("Hubballi");
        Karnataka.addDistrict("Belagavi");
        Karnataka.addDistrict("Kalaburagi");

        Karnataka.updateCityName("Mysuru", "Mysore");

        Karnataka.getAllcityNames();

        Karnataka.deleteCityNames("Belagavi");
        Karnataka.getAllcityNamesPostDeletion();
    }
}
