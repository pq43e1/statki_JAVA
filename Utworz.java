package statki;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class Utworz {

    private static int numerGracza = 1;
    private static String imieGracza = " ";
    private static Byte czyCzlowiek = 0;    //0 - nie ustawione, 1 - czlowiek, 2 - komputer
    private static String mess = "Wprowadz imie gracza numer "+numerGracza+":";

    private static Gracz g1;
    private static Gracz g2;

    private static final Date aktualnaData = new Date();
    private static final SimpleDateFormat formatDaty = new SimpleDateFormat("yyyy-MM-dd hh:mm");

    private static final Scanner sc = new Scanner(System.in);

    public static void gracza(){
        System.out.println(mess);
        String wybor = sc.nextLine();
        if(imieGracza.equals(" ")) {
            imieGracza = wybor;
            mess = "Gracz ma być człowiekiem czy komputerem? C/K";
            gracza();
        }
        else if(czyCzlowiek == 0){
            if(wybor.equals("c") || wybor.equals("C")){
                czyCzlowiek = 1;
            }else if(wybor.equals("k") || wybor.equals("K")){
                czyCzlowiek = 2;
            }else{
                System.out.println("Wprowadz literke c lub k by kontynowac.");
                gracza();
            }
            mess = "Wybrales imie "+imieGracza+". Gracz będzie sterowany przez "+(czyCzlowiek == 1 ? "czlowieka" : "komputer")+". \nCzy potwierdziec wybor? T/N";
            gracza();
        }else{
            if(wybor.equals("T") || wybor.equals("t")){
                if(numerGracza == 1){
                    g1 = new Gracz(numerGracza, imieGracza, czyCzlowiek, formatDaty.format(aktualnaData));
                    imieGracza = " ";
                    czyCzlowiek = 0;
                    numerGracza++;
                    mess = "Wprowadz imie gracza numer "+numerGracza+":";
                    gracza();
                }else {
                    g2 = new Gracz(numerGracza, imieGracza, czyCzlowiek, formatDaty.format(aktualnaData));
                    System.out.println("Gracz ["+g1.getNumerGracza()+"]: "+g1.getImieGracza()+" sterowany przez "+(g1.getCzyCzlowiek() == 1 ? "czlowieka" : "komputer")+" utworzony: "+g1.getDataUtworzenia());
                    System.out.println("Gracz ["+g2.getNumerGracza()+"]: "+g2.getImieGracza()+" sterowany przez "+(g2.getCzyCzlowiek() == 1 ? "czlowieka" : "komputer")+" utworzony: "+g2.getDataUtworzenia());
                }
            }else if(wybor.equals("N") || wybor.equals("n")){
                imieGracza = " ";
                czyCzlowiek = 0;
                mess = "Wprowadz imie gracza numer "+numerGracza+":";
                gracza();
            }else{
                gracza();
            }
        }
    }

    public static char[][] plansze() {

        char[][]  plansza = new char[11][10];
        char pole = ' ';
        for (char[] chars : plansza) {
            Arrays.fill(chars, pole);
        }
        return plansza;
    }
}
