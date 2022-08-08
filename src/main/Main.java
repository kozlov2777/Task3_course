package main;

import menu.Menu;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run(){
        Menu menu = new Menu();
        menu.menu();
    }

}

