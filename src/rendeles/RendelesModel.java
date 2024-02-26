package rendeles;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RendelesModel {

    private static final String HUF = "Ft";
    private ArrayList<String> rendelesek;
    private ArrayList<String> termek;
    private String nev;
    private ArrayList<Integer> arak;

    public RendelesModel() {

    }

    public String bekeres() throws IOException {
        String rendeles = "Rendelesek.txt";
        String arak = "Etelek.txt";
        String kiiras = "";

        Path rendelesut = Paths.get(rendeles);
        Path arakut = Paths.get(arak);

        rendelesek = (ArrayList<String>) Files.readAllLines(rendelesut);

        kiiras += rendelesek.get(0)+ ar() + sortores();
        kiiras += cimvonal() + sortores();
        for (int i = 1; i < rendelesek.size(); i++) {
            if (rendelesek.get(i).isEmpty()) {
                kiiras += "-------------------" + sortores();
                kiiras += "összesen:" + osszar() + HUF + sortores();
                i++;
                kiiras += rendelesek.get(i) + sortores();
                kiiras += cimvonal() + sortores();
            } else {
                kiiras += rendelesek.get(i)+ ar()+ HUF + sortores();
            }
        }

        return kiiras;
    }

    private String cimvonal() {
        return "===================";
    }

    private static String sortores() {
        return "\n";
    }

    private int osszar() throws IOException {

       return 0;
    }
    
    private int ar() throws IOException {
        int ara = 0;
        ArrayList<Etel> etelek = new ArrayList<>();

        String arak = "Etelek.txt";
        Path arakut = Paths.get(arak);
        ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(arakut);
        

        for (String line : lines) {
            String[] etelReszek = line.split("|");

            if (etelReszek.length == 2) {
                nev = etelReszek[0];
                arak += Integer.parseInt(etelReszek[1]);
            }
        }

        return ara;
    }

}
