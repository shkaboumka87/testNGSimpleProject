package testng.examples;

import org.testng.annotations.Test;

public class TestAnnotation {



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


    @Test
    public void treciTest(){

        System.out.println("\nPocetak treceg testa!");

        System.out.println("Ovo je treci test!");

        System.out.println("Kraj treceg. testa!\n");

    }



}
