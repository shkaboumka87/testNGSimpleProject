package testng.primeri;

import org.testng.annotations.*;

public class Primer2ABeforeAfterAnnotations extends PomocnaKlasa {


    @BeforeClass
    public void izvrsiPreKlase(){

        System.out.println("\nOvo je @BeforeClass.");

    }

    @BeforeMethod
    public void izvrsiPreTestMetode(){

        System.out.println("\n*************************************************\n");

        System.out.println("Ovo je @BeforeMethod.");
    }

    @AfterMethod
    public void izvrsiNakonTestMetode(){

        System.out.println("\nOvo je @AfterMethod.");

        System.out.println("\n*************************************************");
    }

    @AfterClass
    public void izvrsiNakonKlase(){

        System.out.println("\nOvo je @AfterClass.");
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
