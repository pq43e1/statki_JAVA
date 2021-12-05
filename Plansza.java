package statki;

import java.util.Scanner;

public class Rozmiesc {

    private static int statek3 = 2;
    private static int statek2 = 2;
    private static int statek4 = 2;
    private static int statek6 = 1;

    private static int poczatekX;
    private static int poczatekY;
    private static int koniecX;
    private static int koniecY;


    private static boolean czyPoczatek = true; //dla wspolrzednych poczatku statku
    private static boolean czyWybranyY = false;
    private static boolean czyBlad = false;

    private static Gracz gracz;

    private static Scanner sc = new Scanner(System.in);

    public Rozmiesc(Gracz gracz) {
        Rozmiesc.gracz = gracz;
        statki();
    }

    public static void statki() {

        System.out.println("Gracz[" + gracz.getNumerGracza() + "]:" + gracz.getImieGracza() +
                "\n" +
                "\nRozmiesc swoje statki na planszy. " +
                "\nWpisz wspolrzedne poczatku i konca statku. " +
                "\nPamietaj, ze statki nie moga byc ustawione po skosie, ani znajdowac sie bezposrednio obok siebie." +
                "\n\nDo ulożennia pozostały Ci:" +
                "\nStatek 6 masztowy: " + statek6 +
                "\nStatek 4 masztowy: " + statek4 +
                "\nStatek 3 masztowy: " + statek3 +
                "\nStatek 2 masztowy: " + statek2 + "\n");

        while (true) {
            gracz.wyswietlPlanszeWidocznaDlaGracza();
            System.out.print("Wprowadz wspolrzedne " + (czyPoczatek ? "poczatku" : "konca") + " statku ");
            if (statek6 > 0) System.out.print("6 masztowego.");
            else if (statek6 == 0 && statek4 != 0) System.out.print("4 masztowego.");
            else if (statek4 == 0 && statek3 != 0) System.out.print("3 masztowego.");
            else System.out.print("2 masztowego.");
            System.out.println();
            String wyborString = sc.nextLine();

                if((wyborString.charAt(0) < 65) || (wyborString.charAt(0) > 74 && wyborString.charAt(0) < 97) || (wyborString.charAt(0) > 106)){
                    czyBlad = true;
                }
                else {
                    if (wyborString.charAt(1) < 49 || wyborString.charAt(1) > 57) {
                        czyBlad = true;
                    } else {
                        if (wyborString.charAt(0) < 75) {
                            if(czyPoczatek){
                                poczatekX = wyborString.charAt(0) - 65;
                            }
                            else koniecX = wyborString.charAt(0) - 65;
                        }
                        else{
                            if(czyPoczatek) {
                                poczatekX = wyborString.charAt(0) - 97;
                            }
                            else koniecX = wyborString.charAt(0) - 97;
                        }
                        if (wyborString.length() == 2) {
                            if(czyPoczatek) {
                                poczatekY = wyborString.charAt(1) - 49;
                                statekNaPlansze("dodaj", poczatekX, poczatekY );
                                czyPoczatek = false;
                            }
                            else {
                                koniecY = wyborString.charAt(1) - 49;
                                naPlanszy();
                            }
                        } else if(wyborString.length() == 3) {
                            if (wyborString.charAt(1) != 49 && wyborString.charAt(2) != 48) {
                                czyBlad = true;
                            } else {
                                if(czyPoczatek){
                                    poczatekY = 9;
                                    statekNaPlansze("dodaj", poczatekX, poczatekY );
                                    czyPoczatek = false;
                                }
                                else{
                                    koniecY = 9;
                                    naPlanszy();
                                }
                            }
                        } else
                            czyBlad = true;
                    }
                }

            if (czyBlad) {
                System.out.println("\nBlad: Wspolrzedna poza zakresem.\n"+poczatekX+" "+poczatekY);
                czyBlad = false;
            }
            }
        }


    public static void naPlanszy() {
        if (statek6 > 0) {
            if (sprzawdzCzyWJednejLinii()) {
                if (sprawdzDlugosc() != 5) {
                    System.out.println("\nBlad!: Statek 6 masztowy musi zajmowac 6 pol.\n");
                    statekNaPlansze("usun", poczatekX, poczatekY);
                }
                else{
                    statekNaPlansze(6);
                    statek6--;
                    statki();
                }
            } else {
                System.out.println("\nBlad: Statek nie moze byc pod skosem\n");
                statekNaPlansze("usun", poczatekX, poczatekY);
            }

        } else if (statek6 == 0 && statek4 != 0) System.out.print("4 masztowego.");
        else if (statek4 == 0 && statek3 != 0) System.out.print("3 masztowego.");
        else System.out.print("2 masztowego.");

    }

    public static int sprawdzDlugosc() {
        int temp;
        if (poczatekX == koniecX) {
            temp = poczatekY - koniecY;
        } else {
            temp = poczatekX - koniecX;
        }
        if (temp < 0) temp = -temp;
        return temp;
    }

    public static boolean sprzawdzCzyWJednejLinii(){
        return poczatekX == koniecX || poczatekY == koniecY;
    }

    public static void kolizje(){

    }

    public static void statekNaPlansze(int maszty){
        for (int i = 0; i < maszty; i++) {
            if(poczatekX == koniecX){
                if(poczatekY < koniecY) gracz.setPlanszaWidocznaDlaGracza(poczatekX, poczatekY+i, 'S');
                else gracz.setPlanszaWidocznaDlaGracza(poczatekX, poczatekY - i,'S');
            }else{
                if(poczatekX < koniecX) gracz.setPlanszaWidocznaDlaGracza(poczatekX+i, poczatekY, 'S');
                else gracz.setPlanszaWidocznaDlaGracza(poczatekX-i, poczatekY, 'S');
            }
        }
    }

    public static void statekNaPlansze(String operacja, int x, int y){
        if(operacja.equals("dodaj")) gracz.setPlanszaWidocznaDlaGracza(x, y, 'S');
        else if(operacja.equals("usun")) gracz.setPlanszaWidocznaDlaGracza(x, y, ' ');
    }
}
