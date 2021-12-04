package statki;

public class Gracz {

    private final int numerGracza;
    private final String imieGracza;
    private final byte czyCzlowiek; //0 - nie ustawione, 1 - czlowiek, 2 - komputer
    private final String dataUtworzenia;

    Plansza widocznaDlaGracza;
    Plansza widocznaDlaPrzeciwnika;
    Plansza kolizje;

    public Gracz(int numerGracza, String imieGracza, byte czyCzlowiek, String dataUtworzenia){
        this.numerGracza = numerGracza;
        this.imieGracza = imieGracza;
        this.czyCzlowiek = czyCzlowiek;
        this.dataUtworzenia = dataUtworzenia;
        widocznaDlaGracza = new Plansza(imieGracza, numerGracza, 'W');
        widocznaDlaPrzeciwnika = new Plansza(imieGracza, numerGracza, 'U');
        kolizje = new Plansza(imieGracza, numerGracza, 'K');
    }

    public int getNumerGracza() {
        return numerGracza;
    }

    public String getImieGracza() {
        return imieGracza;
    }

    public byte getCzyCzlowiek() {
        return czyCzlowiek;
    }

    public String getDataUtworzenia(){
        return dataUtworzenia;
    }


    public void setPlanszaWidocznaDlaGracza(int x, int y, char ch) {
        widocznaDlaGracza.setPlansza(x, y, ch);
    }

    public void setPlanszaWidocznaDlaPrzeciwnika(int x, int y, char ch) {
        this.widocznaDlaPrzeciwnika.setPlansza(x, y, ch);
    }

    public void setPlanszaKolizje(int x, int y, char ch) {
        this.kolizje.setPlansza(x, y, ch);
    }

    public void wyswietlPlanszeWidocznaDlaGracza() {
        Wyswietl.plansze(widocznaDlaGracza);
    }

    public void wyswietlPlanszeWidocznaDlaPrzeciwnika() {
        Wyswietl.plansze(widocznaDlaPrzeciwnika);
    }

    public void wyswietlPlanszeKolizje() {
        Wyswietl.plansze(kolizje);
    }

    public char[][] getPlanszaWidocznaDlaGracza(){
        return widocznaDlaGracza.getPlansza();
    }

    public char[][] getPlanszaWidocznaDlaPrzeciwnika(){
        return widocznaDlaPrzeciwnika.getPlansza();
    }

    public char[][] getPlanszaKolizje(){
        return kolizje.getPlansza();
    }
}
