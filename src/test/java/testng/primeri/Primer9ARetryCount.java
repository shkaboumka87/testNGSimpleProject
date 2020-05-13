package testng.primeri;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class Primer9ARetryCount {


    @Test ( retryAnalyzer = PonoviTestove.class )
    public void testA(){

        System.out.println("\nOvo je prvi test!");
    }

    @Test ( retryAnalyzer = PonoviTestove.class )
    public void testB() {

        System.out.println("\nOvo je drugi test!");

    }

    @Test ( retryAnalyzer = PonoviTestove.class )
    public void testC(){

        System.out.println("\nOvo je treci test!");

        fail();
    }


}
