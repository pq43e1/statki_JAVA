public class Main {

    public static void main (String[] args){
        Gracz gracz = new Gracz(1, "Adam", true, 20210101);

        gracz.getPlanszaWidocznaDlaGracza();
        gracz.getPlanszaKolizje();
        gracz.getPlanszaWidocznaDlaPrzeciwnika();
        gracz.getPlanszaWidocznaDlaGracza();
        gracz.getPlanszaWidocznaDlaGracza();
    }
}
