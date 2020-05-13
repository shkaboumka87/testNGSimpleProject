package testng.primeri;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Primer4BSoftAssert extends PomocnaKlasa{

    @Test( dataProviderClass = DataProviders.class, dataProvider = "kredencijali" )
    public void testDaLiSuKredencijaliIspravni(String korisnickoIme, String lozinka){

        SoftAssert softAssert = new SoftAssert();

        System.out.println("\nIme - " + korisnickoIme);

        softAssert.assertEquals(korisnickoIme, KORISNICKO_IME, "Neispravno korisnicko ime");


        System.out.println("\nLozinka je - " + lozinka);

        softAssert.assertEquals(lozinka, LOZINKA, "Neispravna lozinka");


        softAssert.assertAll();

        System.out.println("\nKredencijali su ispravni");
    }


}
