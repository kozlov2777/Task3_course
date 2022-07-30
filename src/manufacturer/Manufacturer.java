package manufacturer;



public class Manufacturer {
    private String countryOfManufacturer;
    private String manufacturerName;

    public Manufacturer(String countryOfManufacturer, String manufacturerName) {
        this.countryOfManufacturer = countryOfManufacturer;
        this.manufacturerName = manufacturerName;
    }

    public String getCountryOfManufacturer() {
        return countryOfManufacturer;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "countryOfManufacturer='" + countryOfManufacturer + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}
