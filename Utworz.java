import java.util.Scanner;

public class Utworz {

    private int numerGracza = 1;
    private String imieGracza;
    private char wybor;
    
    Scanner sc = new Scanner(System.in);

    public void gracza() {
        while(true){
            System.out.println("Wprowadz imie gracza numer "+numerGracza+":");
            imieGracza = sc.nextLine();
            System.out.println("Wybrales imie "+imieGracza+". Czy potwierdzic wybór? T/N");
            wybor = sc.nextChar();
            if(wybor == 'T' || wybor == 't')
                Gracz g1 = new Gracz();
        }
    }



}
