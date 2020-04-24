package testng.examples;

import org.testng.annotations.*;

public class BeforeAndAfterAnnotations {


    @BeforeClass
    public void izvrsiPreKlase(){

        System.out.println("Ovo je @beforeClass");

    }

    @BeforeMethod
    public void izvrsiPreMetode(){

        System.out.println("Ovo je @beforeMethod");

    }

    @AfterClass
    public void izvrsiNakonKlase(){

        System.out.println("Ovo je @afterClass");

    }

    @AfterMethod
    public void izvrsiNakonMetode(){

        System.out.println("Ovo je @afterMethod");

    }


    @Test
    public void prviTest(){

        System.out.println("\nPocetak prvog testa!");

        System.out.println("Ovo je prvi test!");

        System.out.println("Kraj prvog testa!\n");

    }


    @Test
    public void drugiTest(){

        System.out.println("\nPocetak drugog testa!");

        System.out.println("Ovo je drugi test!");

        System.out.println("Kraj drugog testa!\n");
    }


}
