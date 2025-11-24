//Korištenjem klase BufferedReader učitaj nekoliko informacija od korisnika kroz konzolu.
//Informacije koje si učitao zapiši u novu datoteku „nazivPoŽelji.txt”
//Stvori kopiju datoteke pod nazivom „kopijaNaziv.txt”
//Po želji iskoristi dodatno oblikovanje znakova.

import java.io.*;

public class Zadatak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Unesi neki podatak:");
        String podatak = br.readLine();

        Reader ulaz = new StringReader(podatak);
        Writer izlaz1 = new FileWriter("nekiPodatak.txt");
        Writer izlaz2 = new FileWriter("kopijaNekiPodatak.txt");

        int nextChar;
        while ((nextChar = ulaz.read()) != -1)  {
            izlaz1.write(Character.toUpperCase(nextChar));
            izlaz2.write(Character.toLowerCase(nextChar));
        }

        ulaz.close();
        izlaz1.close();
        izlaz2.close();
    }
}

