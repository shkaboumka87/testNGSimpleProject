package testng.primeri;

import org.testng.annotations.DataProvider;

public class DataProviders {


    @DataProvider( name = "biloKojaDvaBroja", parallel = true )
    private Object[][] proslediDvaBroja(){

        return new Object[][] {
                {5, -2} ,
                {556, 1000} ,
                {-400, -87} ,
                {999, 666}
        };
    }

    @DataProvider (name = "kredencijali")
    private Object[][] korisnickoImeISifra(){

        return new Object[][] {
                {"Gandalf", "Mellon"},
                {"username", "Mordor123!@#"} ,
                {"username", "qwerty"}
        };
    }

}
