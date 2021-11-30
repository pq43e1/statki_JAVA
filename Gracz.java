package statki;

public class Gracz {

    private final int numerGracza;
    private final String imieGracza;
    private final boolean czyCzlowiek;
    private final int dataUtworzenia;
    Plansza planszaWidocznaDlaGracza;
    Plansza planszaWidocznaDlaPrzeciwnika;
    Plansza planszaKolizje;

    public Gracz(int numerGracza, String imieGracza, boolean czyCzlowiek, int dataUtworzenia){
        this.numerGracza = numerGracza;
        this.imieGracza = imieGracza;
        this.czyCzlowiek = czyCzlowiek;
        this.dataUtworzenia = dataUtworzenia;
        planszaWidocznaDlaGracza = new Plansza(imieGracza, numerGracza, 'W');
        planszaWidocznaDlaPrzeciwnika = new Plansza(imieGracza, numerGracza, 'U');
        planszaKolizje = new Plansza(imieGracza, numerGracza, 'K');
    }

    public int getNumerGracza() {
        return numerGracza;
    }

    public String getImieGracza() {
        return imieGracza;
    }

    public boolean isCzyCzlowiek() {
        return czyCzlowiek;
    }

    public int getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setPlanszaWidocznaDlaGracza(Plansza planszaWidocznaDlaGracza) {
        this.planszaWidocznaDlaGracza = planszaWidocznaDlaGracza;
    }

    public void setPlanszaWidocznaDlaPrzeciwnika(Plansza planszaWidocznaDlaPrzeciwnika) {
        this.planszaWidocznaDlaPrzeciwnika = planszaWidocznaDlaPrzeciwnika;
    }

    public void setPlanszaKolizje(Plansza planszaKolizje) {
        this.planszaKolizje = planszaKolizje;
    }

    public void getPlanszaWidocznaDlaGracza() {
         Wyswietl.plansze(planszaWidocznaDlaGracza);
    }

    public void getPlanszaWidocznaDlaPrzeciwnika() {
        Wyswietl.plansze(planszaWidocznaDlaPrzeciwnika);
    }

    public void getPlanszaKolizje() {
        Wyswietl.plansze(planszaKolizje);
    }
}
