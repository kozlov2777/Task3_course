package sort;
//        • Вывести информацию о сувенирах заданного производителя.
//        • Вывести информацию о сувенирах, произведенных в заданной стране.
//        • Вывести информацию о производителях, чьи цены на сувениры
//        меньше заданной.
//        • Вывести информацию по всем производителям и, для каждого производителя вывести
//        информацию о всех сувенирах, которые он производит.
//        • Вывести информацию о производителях заданного сувенира, произведенного в заданном году.
//        • Для каждого года вывести список сувениров, произведенных в этом году.
//        • Удалить заданного производителя и его сувениры.

import souvenir.Souvenir;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Sort {
    public List<Souvenir> removeManufacturer(List<Souvenir> souvenirs, String manufacturer){
        return souvenirs.stream()
                .filter(souvenir -> !Objects.equals(manufacturer,souvenir.getManufacturerName()))
                .collect(Collectors.toList());
    }

    public List<Souvenir> sortByYears(List<Souvenir> souvenirs){
        return souvenirs.stream().sorted(Comparator.comparing(Souvenir::getYear)).collect(Collectors.toList());
    }
    public List<Souvenir> sortBySouvenirAndYear(List<Souvenir> souvenirs, int year){ //Вывести информацию о производителях заданного сувенира, произведенного в заданном году.
        return souvenirs.stream()
                .filter(souvenir -> souvenir.getYear()==year)
                .collect(Collectors.toList());
    }
    public List<Souvenir> sortByManufacturerAndSouvenir(List<Souvenir> souvenirs){//информацию по всем производителям и, для каждого производителя вывести информацию о всех сувенирах, которые он производит.
        return souvenirs.stream()
                .sorted(Comparator.comparing(Souvenir::getManufacturerName))
                .collect(Collectors.toList());
    }
    public List<Souvenir> sortByManufacturer(List<Souvenir> souvenirs, String manufacturer){ //информацию о сувенирах заданного производителя.
        return souvenirs.stream()
                .filter(souvenir -> souvenir.getManufacturerName().equals(manufacturer))
                .collect(Collectors.toList());
    }
    public List<Souvenir> sortByCountryOfManufacturer(List<Souvenir> souvenirs, String countryOfManufacturer){// Вывести информацию о сувенирах, произведенных в заданной стране.
        return souvenirs.stream()
                .filter(souvenir -> souvenir.getCountryOfManufacturer().equals(countryOfManufacturer))
                .collect(Collectors.toList());
    }
    public List<Souvenir> sortByManufacturerAndCost(List<Souvenir> souvenirs, int cost){//Вывести информацию о производителях, чьи цены на сувениры меньше заданной.
        return souvenirs.stream()
                .filter(souvenir -> souvenir.getCost()<cost)
                .collect(Collectors.toList());
    }
}
