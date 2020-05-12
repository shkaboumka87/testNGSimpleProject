package testng.primeri;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class Primer1BTestPriority {


    @Test( priority = 3 )
    public void testA(){

        System.out.println("\nOvo je prvi test!");

    }

    @Test( priority = 1 )
    public void testB(){

        System.out.println("\nOvo je drugi test!");
    }

    @Test( priority = 2 )
    public void testC(){

        System.out.println("\nOvo je treci test!");

       // fail("Obaram treci test!");
    }




}
