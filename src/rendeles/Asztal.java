package rendeles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Asztal {

    private String szin;
    private ArrayList<Etel> Rendelesek;

    public Asztal(String szin) {
        this.szin = szin;
    }

    public String getSzin() {
        return szin;
    }

    public void ujEtel(Etel etel){
        
    }

    public List<Etel> getRendelesek() {
        return Rendelesek;
    }
    
    public int osszar(){
        int ossz = 0;
        
        
        
        return ossz;
    }

    

}
