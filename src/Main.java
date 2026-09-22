import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int ilePatrzystych;
    private static int ileNiePatrzystych;

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> liczbyZPliku = wypiszZawartoscPliku();
        //System.out.println("Liczby z pliku: " + liczbyZPliku);
        int ileParzystych;

    }//gotowe
    public static ArrayList<Integer> wypiszZawartoscPliku() throws IOException {
        File file = new File("src/liczby.txt");
        ArrayList<Integer> liczby = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        FileWriter fileWriter = new FileWriter("parzyste.txt");
        int liczba;
        while (scanner.hasNext()) {
            liczba = scanner.nextInt();
            if(liczba % 2 == 0) {
                ilePatrzystych++;
                fileWriter.write(liczba+"\n");
            } else {
                ileNiePatrzystych++;
            }
            liczby.add(liczba);
            System.out.println(liczba);
        }
        System.out.println("Liczby parzyste to: " + ilePatrzystych);
        System.out.println("Liczby nieparzyste to: " + ileNiePatrzystych);
        scanner.close();
        fileWriter.close();
        return liczby;
    }

}