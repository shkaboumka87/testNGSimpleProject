package testng.primeri;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class Primer1CTestDependsOnMethods {

    @Test
    public void testA(){

        System.out.println("\nOvo je prvi test!");

    }

    @Test( dependsOnMethods = "testC" )
    public void testB(){

        System.out.println("\nOvo je drugi test!");
    }

    @Test
    public void testC(){

        System.out.println("\nOvo je treci test!");

        //fail("Obaram treci test!");
    }

}
