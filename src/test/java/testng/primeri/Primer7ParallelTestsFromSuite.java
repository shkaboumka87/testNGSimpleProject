package testng.primeri;

import org.testng.annotations.Test;

public class Primer7ParallelTestsFromSuite {


    @Test
    public void testA() throws InterruptedException {

        System.out.println("\nOvo je prvi test!");

        Thread.sleep(10000L);

    }

    @Test
    public void testB() throws InterruptedException {

        System.out.println("\nOvo je drugi test!");

        Thread.sleep(10000L);
    }

    @Test
    public void testC() throws InterruptedException {

        System.out.println("\nOvo je treci test!");

        Thread.sleep(10000L);
    }


    @Test
    public void testD() throws InterruptedException {

        System.out.println("\nOvo je cetvrti test!");

        Thread.sleep(10000L);
    }

}
