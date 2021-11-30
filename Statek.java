import java.util.ArrayList;
import java.util.List;

class Statek{
    
    Map<Character, Character> zajmowanePola = new HashMap<>();
    List<String> lista = new ArrayList<>();
    private int numerGracza;
    private int numerStatku;
    private int liczbaMasztow;

    public Statek(int numerGracza, int numerStatku, int liczbaMasztow, Map<Character, Character> zajmowanePola){
        this.numerGracza = numerGracza;
        this.liczbaMasztow = liczbaMasztow;
        this.numerStatku = numerStatku;
        this.zajmowanePola = zajmowanePola;
    }
    
    public int getNumerGracza(){
        return numerGracza;
    }
    
    public int getNumerStatku(){
        return numerStatku;
    }
    
    public int getLiczbaMasztow(){
        return liczbaMasztow;
    }
    
    public Map<Character, Character> getZajmowanePola(){
        return zajmowanePola;
    }
    
}
