package rendeles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Etel {

    private String nev;
    private int ar;

    public Etel(String nev, int ar) {
        this.nev = nev;
        this.ar = ar;
    }

    public Etel(String sor) {
        String[] etelReszek = sor.split(" ");

        if (etelReszek.length == 2) {
            this.nev = etelReszek[0];
            this.ar = Integer.parseInt(etelReszek[1]);
        } else {
            System.err.println("Invalid line format: " + sor);
        }
    }

    public static ArrayList<Etel> loadEtelekFromFile() throws IOException {
        ArrayList<Etel> etelek = new ArrayList<>();

        String arak = "Etelek.txt";
        Path arakut = Paths.get(arak);
        ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(arakut);

        for (String line : lines) {
            Etel etel = new Etel(line);
            etelek.add(etel);
        }

        return etelek;
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }
}
