package testng.primeri;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;



public class Primer8BListeners {

    @Test
    public void testA(){

        System.out.println("\nOvo je prvi test!");
    }

    @Test
    public void testB() throws InterruptedException {

        System.out.println("\nOvo je drugi test!");

        Thread.sleep(10000L);

    }

    @Test
    public void testC(){

        System.out.println("\nOvo je treci test!");

        fail();

    }


    @Test ( dependsOnMethods = "testC" )
    public void testD(){

        System.out.println("\nOvo je cetvrti test!");

    }



}
