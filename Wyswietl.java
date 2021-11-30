package statki;

public class Wyswietl {


    public Wyswietl() {

    }

    public static void plansze(Plansza plansza){
        System.out.println("Gracz["+plansza.getNumerGracza()+"]: "+plansza.getImieGracza());
        System.out.println(plansza.getRodzajPlanszy());

        char[][] plansza1 = plansza.getPlansza();
        for (int i = 0; i < plansza1.length; i++) {
            for (int j = 0; j < plansza1[i].length; j++) {
                System.out.print(plansza1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
