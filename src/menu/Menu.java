package menu;

import reader.Reader;
import sort.Sort;
import souvenir.Souvenir;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//• Добавлять, редактировать, просматривать всех производителей и всех
//        сувениров.
//        • Вывести информацию о сувенирах заданного производителя.
//        • Вывести информацию о сувенирах, произведенных в заданной стране.
//        • Вывести информацию о производителях, чьи цены на сувениры
//        меньше заданной.
//        • Вывести информацию по всем производителям и, для каждого производителя вывести
//        информацию о всех сувенирах, которые он производит.
//        • Вывести информацию о производителях заданного сувенира, произведенного в заданном году.
//        • Для каждого года вывести список сувениров, произведенных в этом году.
//        • Удалить заданного производителя и его сувениры.
public class Menu {
    public void menu(){
        List<Souvenir> souvenirs = new ArrayList<>();
        ArrayList<Souvenir> souvenirs1 = (ArrayList<Souvenir>) souvenirs;
        List<Souvenir> res = new ArrayList<>(souvenirs);
        Reader reader = new Reader();
        Sort sort = new Sort();
        int input;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("""
                Enter a number of operation:\s
                 1 - Adding new souvenir to list\s
                 2 - Remove souvenir by index\s
                 3 - Read from file\s
                 4 - Show list manufacturer and souvenir\s
                 5 - sortByManufacturer\s
                 6 - sortByCountryOfManufacturer \s
                 7 - sortByManufacturerAndCost\s
                 8 - sortByManufacturerAndSouvenir\s
                 9 - sortBySouvenirAndYear\s
                 10 - removeManufacturer\s
                 11 - sortByYears\s
                 0 - Exit""");
            input = scanner.nextInt();
            switch (input) {
                case (1):
                    souvenirs1.add(Souvenir.of(scanner.next()));
                    break;
                case (2):
                    System.out.println("Input index: ");
                    souvenirs1.remove(scanner.nextInt());
                    break;
                case (3):
                    souvenirs = reader.getSouvenirFromFile("text.txt");
                    souvenirs1.addAll(souvenirs);
                    break;
                case (4):
                    System.out.println(souvenirs1);
                    break;
                case (5):
                    System.out.println( res = sort.sortByManufacturer(souvenirs1,"Салоіндестріз"));
                    break;
                case (6):
                    System.out.println( res = sort.sortByCountryOfManufacturer(souvenirs1,"Україна"));
                    break;
                case (7):
                    System.out.println( res = sort.sortByManufacturerAndCost(souvenirs1,400));
                    break;
                case (8):
                    System.out.println( res = sort.sortByManufacturerAndSouvenir(souvenirs1));
                    break;
                case (9):
                    System.out.println( res = sort.sortBySouvenirAndYear(souvenirs1, 2021));
                    break;
                case (10):
                    System.out.println( res = sort.removeManufacturer(souvenirs1,"Бибибу"));;
                    break;
                case (11):
                    System.out.println( res = sort.sortByYears(souvenirs1));;
                    break;
                case (0):
                    break;
            }

        }while (input!=0);
    }
}
