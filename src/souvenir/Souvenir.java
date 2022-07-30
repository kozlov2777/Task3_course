package souvenir;

import manufacturer.Manufacturer;

public class Souvenir extends Manufacturer {
    private String name;
    private int day;
    private int month;
    private int year;
    private int cost;

    @Override
    public String toString() {
        return "Souvenir{" +
                "name='" + name + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", cost=" + cost +
                ", name of manufacturer=" + getManufacturerName() +
                ", country of manufacturer=" + getCountryOfManufacturer()+
                "}\n";
    }

    public static Souvenir of(String s){
        String [] split = s.split(" ");
        return new Souvenir(split[0], split[1],split[2], Integer.parseInt(split[3]),
                Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]));
    }

    public Souvenir(String countryOfManufacturer, String manufacturerName, String name, int day, int month, int year, int cost) {
        super(countryOfManufacturer, manufacturerName);
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getCost() {
        return cost;
    }


}
