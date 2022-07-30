package main;

import menu.Menu;
import souvenir.Souvenir;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run(){
        ArrayList<Souvenir> souvenirs = new ArrayList<>();
        Menu menu = new Menu();
        menu.menu(souvenirs);
    }

}

