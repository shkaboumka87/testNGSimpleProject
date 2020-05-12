package testng.primeri;

import org.testng.annotations.Test;

@Test
public class Primer1ATestAnnotation {

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


    @Test( enabled = false )
    public void treciTest(){

        System.out.println("\nPocetak treceg testa!");

        System.out.println("Kraj treceg testa!\n");
    }
}
