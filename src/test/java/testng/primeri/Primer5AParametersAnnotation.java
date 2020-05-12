package testng.primeri;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Primer5AParametersAnnotation extends PomocnaKlasa {


    @Parameters ( {"korisnickoIme", "lozinka"} )
    @Test
    public void testProveriKredencijale1(String korIme, String sifra){

        daLiSuKredencijaliIspravni(korIme, sifra);
    }


    @Parameters ({"korisnickoIme", "lozinka"})
    @Test
    public void testProveriKredencijale2(@Optional("Gimli Sin Gloinov") String korIme, String sifra){

        daLiSuKredencijaliIspravni(korIme, sifra);
    }


    private void daLiSuKredencijaliIspravni(String korIme, String sifra) {


        System.out.println("\nUneto korisnicko ime - " + korIme);

        assertEquals(korIme, KORISNICKO_IME, "Uneto korisnicko ime je pogresno!");


        System.out.println("\nUneta lozinka - " + sifra);

        assertEquals(sifra, LOZINKA, "Uneta lozinka je pogresna!");


        System.out.println("\nKorisnik moze da se ulogije.");
    }







}
