package statki;

public class Plansza {

    private int numerGracza;
    private String imieGracza;
    private String rodzajPlanszy;
    private final char oznaczenieRodzaju; // K - kolizje, W - widoczna, U - ukryta
    private char [][] plansza;

    public Plansza(String imieGracza, int numerGracza, char oznaczenieRodzaju){
        this.numerGracza = numerGracza;
        this.oznaczenieRodzaju = oznaczenieRodzaju;
        this.imieGracza = imieGracza;
        plansza = utworz();
    }

    public char[][] utworz() {
        if(oznaczenieRodzaju == 'W') rodzajPlanszy = "Plansza widoczna dla gracza.";
        else if(oznaczenieRodzaju == 'U') rodzajPlanszy = "Plansza gracza widoczna dla przeciwnika.";
        else if(oznaczenieRodzaju == 'K') rodzajPlanszy = "Plansza ukryta przed graczem - kolizje.";
        else rodzajPlanszy ="BLAD, NIEZIDENTYFIKOWANA";

        char[][]  plansza = new char[11][21];
        char iteratorChara = 'A';
        char iretarorLiczbowu = '1';
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 20; j++) {
                if (i == 0 && j == 0) plansza[i][j] = ' ';
                else if (i == 0 && j > 0) {

                    plansza[i][j] = iteratorChara++;
                    plansza[i][j+1] = ' ';
                    j += 1;
                } else if (i > 0 && j == 0) {
                    if(i!=10)
                        plansza[i][j] = iretarorLiczbowu++;
                }
                else {
                    plansza[i][j] = ' ';
                    plansza[i][j+1] = ' ';
                    j += 1;
                }
            }
        }
        return plansza;
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

    public void setPlansza(char[][] plansza) {
        this.plansza = plansza;
    }


}
