package testng.primeri;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class PomocnaKlasa {

    static final String KORISNICKO_IME = "username";
    static final String LOZINKA = "qwerty";


    //@BeforeClass
    public void izvrsiPreKlasePrimer2(){

        System.out.println("\nOvo je @BeforeClass nasledjene klase.");
    }


    //@AfterClass
    public void izvrsiNakonKlasePrimer2(){

        System.out.println("\nOvo je @AfterClass nasledjene klase.");
    }


    int saberiDvaBroja(int prviBroj, int drugiBroj){

        return drugiBroj + prviBroj;

    }


}
