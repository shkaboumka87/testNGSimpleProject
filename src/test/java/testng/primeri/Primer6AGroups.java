package testng.primeri;

import org.testng.annotations.Test;

public class Primer6AGroups {

    @Test( groups = { "sanity" } )
    public void testA(){

        System.out.println("\nOvo je test A");
    }


    @Test (groups = { "sanity", "regression" })
    public void testB(){

        System.out.println("\nOvo je test B");
    }

    @Test (groups = { "regression" })
    public void testC(){

        System.out.println("\nOvo je test C");
    }

}
