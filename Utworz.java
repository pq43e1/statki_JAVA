import java.util.Scanner;
import java.util.Date;

public class Utworz {

    private int numerGracza = 1;
    private String imieGracza;
    private char wybor;
    private Boolean czyCzlowiek = null;
    
    Date aktualnaData = new Date();
    private long timestamp = aktualnaData.getTime();
    
    Scanner sc = new Scanner(System.in);

    public void gracza() {
        while(true){
            System.out.println("Wprowadz imie gracza numer "+numerGracza+":");
            imieGracza = sc.nextLine();
            while(true){
                System.out.println("Gracz ma być człowiekiem czy komputerem? C/K");
                wybor = sc.nextLine;
                if(wybor == 'c' || wybor == 'C'){
                    czyCzlowiek = true;
                    break;
                }else if (wybor == 'k' || wybor == 'K'){
                    czyCzlowiek = false;
                    break;
                }else
                    System.out.println("Wprowadz literke c lub k by kontynowac.");
            }
            while(true){
                System.out.println("Wybrales imie "+imieGracza+". Gracz będzie sterowany przez "); 
                System.out.print(czyCzlowiek == true? "czlowieka" : "komputer");
                System.out.print(". Czy potwierdzasz wybor? T/N");          
                wybor = sc.nextChar();
                    if(wybor == 'T' || wybor == 't'){
                        break;
                        break;
                    }else if(wybor == 'N' || wybor == 'n'){
                        break;
                    }else{
                    System.out.println("Wprowadz literke T lub N by kontynowac.");
                    }      
            }
        }
        if(numerGracza == 1){
            Gracz gracz1 = new Gracz(numerGracza, imieGracza, czyCzlowiek, timestamp);
            numerGracza++;
            wybor = ' ';
        }else{
            Gracz gracz2 = new Gracz(numerGracza, imieGracza, czyCzlowiek, timestamp);  
        }
    }


}
