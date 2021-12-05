package statki;

public class Plansza {

    private int numerGracza;
    private final String imieGracza;
    private String rodzajPlanszy; // K - kolizje, W - widoczna, U - ukryta
    private char [][] plansza;

    public Plansza(String imieGracza, int numerGracza, char oznaczenieRodzaju){
        this.numerGracza = numerGracza;
        this.imieGracza = imieGracza;
        if(oznaczenieRodzaju == 'W') rodzajPlanszy = "Plansza widoczna dla gracza.";
        else if(oznaczenieRodzaju == 'U') rodzajPlanszy = "Plansza gracza widoczna dla przeciwnika.";
        else if(oznaczenieRodzaju == 'K') rodzajPlanszy = "Plansza ukryta przed graczem - kolizje.";
        else rodzajPlanszy ="BLAD, NIEZIDENTYFIKOWANA";
        plansza = Utworz.plansze();
    }

    public String getRodzajPlanszy() {
        return rodzajPlanszy;
    }

    public int getNumerGracza() {
        return numerGracza;
    }

    public char[][] getPlansza() {
        return plansza;
    }

    public String getImieGracza() {
        return imieGracza;
    }

    public void setNumerGracza(int numerGracza) {
        this.numerGracza = numerGracza;
    }

    public void setRodzajPlanszy(String rodzajPlanszy) {
        this.rodzajPlanszy = rodzajPlanszy;
    }

    public void setPlansza(int x, int y, char ch) {
        plansza[x][y] = ch;
    }


}
