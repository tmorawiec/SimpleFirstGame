package cc.morawiec.apps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game gra = new Game(); //make game object

        System.out.println("Witaj masz 10 podejść żeby znaleźć losową liczbę z zakresu od 1 do 100");
        while (gra.getCounter()>0){                 //player has 10 chances
            Integer input = scanner.nextInt();      //gets number from player
            System.out.println(gra.play(input));    //play
        }
        System.out.println("Koniec gry!");
    }
}
