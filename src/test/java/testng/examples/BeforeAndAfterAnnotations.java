package testng.examples;

import org.testng.annotations.*;

public class BeforeAndAfterAnnotations {


    @BeforeClass
    public void izvrsiPreKlase(){

        System.out.println("\nOvo je @beforeClass");

    }

    @BeforeMethod
    public void izvrsiPreMetode(){

        System.out.println("\nOvo je @beforeMethod");

    }

    @AfterClass
    public void izvrsiNakonKlase(){

        System.out.println("\nOvo je @afterClass");

    }

    @AfterMethod
    public void izvrsiNakonMetode(){

        System.out.println("\nOvo je @afterMethod");

    }


    @Test
    public void drugiTest(){

        System.out.println("\nPocetak drugog testa!");

        System.out.println("Ovo je drugi test!");

        System.out.println("Kraj drugog testa!\n");

    }


    @Test
    public void treciTest(){

        System.out.println("\nPocetak treceg testa!");

        System.out.println("Ovo je treci test!");

        System.out.println("Kraj treceg. testa!\n");

    }



}
