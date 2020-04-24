package testng.examples;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FailedTests {




    @Test
    public void prviTest() {

        fail("Prvi test je neuspesan");
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
