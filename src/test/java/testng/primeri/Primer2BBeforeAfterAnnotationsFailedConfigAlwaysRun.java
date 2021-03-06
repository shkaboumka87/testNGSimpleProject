package testng.primeri;

import org.testng.annotations.*;

import static org.testng.Assert.fail;

public class Primer2BBeforeAfterAnnotationsFailedConfigAlwaysRun {

    @BeforeClass
    public void izvrsiPreKlase(){

        System.out.println("\nOvo je @BeforeClass.");

        fail("Upomoc, ni jedan test se nece izvrsiti!");
    }

    @BeforeMethod
    public void izvrsiPreMetode(){

        System.out.println("\n*************************************************\n");

        System.out.println("Ovo je @BeforeMethod.");
    }

    @AfterMethod
    public void izvrsiNakonMetode(){

        System.out.println("\nOvo je @AfterMethod.");

        System.out.println("\n*************************************************");
    }

    @AfterClass( alwaysRun = true )
    public void izvrsiNakonKlase(){

        System.out.println("\nIpak izvrsi @AfterClass.");
    }

    @Test
    public void prviTest(){

        System.out.println("\nPocetak prvog testa!");

        System.out.println("Kraj prvog testa!\n");
    }


    @Test
    public void drugiTest(){

        System.out.println("\nPocetak drugog testa!");

        System.out.println("Kraj drugog testa!\n");
    }

    @Test
    public void treciTest(){

        System.out.println("\nPocetak treceg testa!");

        System.out.println("Kraj treceg testa!\n");
    }

}
