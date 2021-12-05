package statki;

import java.util.Scanner;

public class Wyswietl {

    private static final Scanner sc = new Scanner(System.in);

    public Wyswietl() {

    }

    public static void menu(){
        System.out.println("Witaj w grze w statki!\nNowa gra (N)\nWczytaj gre (W)\nWyjdz z gry (X)");
        String wybor = sc.nextLine();
        switch (wybor) {
            case "n":
            case "N":
                Utworz.gracza();
                break;
            case "w":
            case "W":
                break;
            case "x":
            case "X":
                System.exit(0);
            default:
                menu();
                break;
        }
    }

    public static void menu(Gracz gracz){

    }

    public static void plansze(Plansza plansza){
        //System.out.println("Gracz["+plansza.getNumerGracza()+"]: "+plansza.getImieGracza());
        //System.out.println(plansza.getRodzajPlanszy());

        char[][] plansza1 = plansza.getPlansza();
        char iteratorChara = 'A';
        int iteratorInta = 1;

        for (int i = 0; i < plansza1.length; i++) {
            for (int j = 0; j < plansza1[i].length+1; j++) {
                if(i==0 && j == 0) System.out.print("[ ]");
                else if(i == 0) System.out.print("["+(iteratorInta++)+"]");
                else if(j == 0) System.out.print("["+(iteratorChara++)+"]");
                else if (j == plansza1[i].length) System.out.print(" "+plansza1[i-1][j-1]+"  ");
                else System.out.print(" "+plansza1[i-1][j-1]+" ");
            }
            System.out.println();
        }
        //System.out.println();
    }
}
