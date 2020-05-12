package testng.primeri;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Primer3ADataProvider extends PomocnaKlasa {

    @Test
    public void testSaberiDvaPozitivnaBroja(){


        System.out.println("\nZbir zadatih brojeva je: " + saberiDvaBroja(10, 18) + "\n");

        System.out.println("****************************************************");
    }

    @Test
    public void testSaberiDvaNegativnaBroja(){


        System.out.println("\nZbir zadatih brojeva je: " + saberiDvaBroja(-10, -18) + "\n");

        System.out.println("****************************************************");
    }

    @Test
    public void testSaberiPozitivanINegativanBroj(){


        System.out.println("\nZbir zadatih brojeva je: " + saberiDvaBroja(10, -18) + "\n");

        System.out.println("****************************************************");
    }


    //@Test( dataProvider = "ulazneVrednostiZadatka" )
    public void testSaberiDvaBroja(int prviBroj, int drugiBroj)
            throws InterruptedException {

        System.out.println("\nZbir zadatih brojeva je: " + saberiDvaBroja(prviBroj, drugiBroj) + "\n");

        Thread.sleep(5000L);

        System.out.println("****************************************************");
    }
    //@Test( dataProvider = "ulazneVrednostiZadatka" )
    public void neuspesanTest(int prviBroj){

        System.out.println("\nZbir zadatih brojeva je: " + saberiDvaBroja(prviBroj, 35) + "\n");

        System.out.println("****************************************************");
    }


    @DataProvider
    private Object[][] ulazneVrednostiZadatka(){

        return new Object[][] {
                {1, -2} ,
                {56, 0} ,
                {45, -87} ,
                {999, 666}
        };
    }


}
