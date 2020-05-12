package testng.primeri;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Primer4AHardAssert extends PomocnaKlasa{

    private boolean odgovarajuciKredencijali = false;

    @Test( dataProviderClass = DataProviders.class, dataProvider = "kredencijali" )
    public void testDaLiSuIspravniKredencijali(String korisnickoIMe, String lozinka){


        System.out.println("\nIme - " + korisnickoIMe);

        assertEquals(korisnickoIMe, KORISNICKO_IME, "Neispravno korisnicko ime");


        System.out.println("\nLozinka je - " + lozinka);

        assertEquals(lozinka, LOZINKA, "Neispravna lozinka!");


        System.out.println("\nKredencijali su ispravni");
    }


    @Test( dataProviderClass = DataProviders.class, dataProvider = "kredencijali" )
    public void testDaLiJeKorisnikPrijavljen(String korisnickoIme, String lozinka){

        System.out.println("\nUneto korisnicko ime - " + korisnickoIme);
        System.out.println("\nUneta lozinka - " + lozinka);

        if (korisnickoIme.equals(KORISNICKO_IME) && lozinka.equals(LOZINKA)){

            odgovarajuciKredencijali = true;
        }

        assertTrue(odgovarajuciKredencijali,
                "\nNeuspesno prijavljivanje na sistem. Proveri kredencijale!");

        System.out.println("\nKorisnik uspesno prijavljen.");

    }

}
