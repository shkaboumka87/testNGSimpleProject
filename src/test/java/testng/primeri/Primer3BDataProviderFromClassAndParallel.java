package testng.primeri;

import org.testng.annotations.Test;

public class Primer3BDataProviderFromClassAndParallel extends PomocnaKlasa {


    @Test( dataProviderClass = DataProviders.class, dataProvider = "biloKojaDvaBroja" )
    public void testIzracunajZbir(int prviBroj, int drugiBroj)
            throws InterruptedException {

        System.out.println("\nZbir zadatih brojeva je: " + saberiDvaBroja(prviBroj, drugiBroj) + "\n");

        Thread.sleep(10000L);

        System.out.println("****************************************************");
    }



}
