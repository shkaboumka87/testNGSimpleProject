package testng.primeri;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    private int prosloTestova = 0;
    private int paloTestova = 0;
    private int preskocenoTestova = 0;

    public void onStart(ITestContext context) {

        System.out.println("\n.............................................");

        System.out.println("\nIme suite-a je: " + context.getSuite().getName());

        System.out.println("\n.............................................\n\n");

    }

    public void onFinish(ITestContext context) {

        System.out.println("\n.............................................");

        System.out.println("\nBroj uspesnih testova je: " + prosloTestova);
        System.out.println("\nBroj neuspesnih testova je: " + paloTestova);
        System.out.println("\nBroj preskocenih testova je: " + preskocenoTestova);

        System.out.println("\n.............................................\n\n");

    }

    public void onTestStart(ITestResult testResult) {

        System.out.println("\n------------------------------------------");

        System.out.println("\nPokrecem test - " + testResult.getName());

    }


    public void onTestSuccess(ITestResult testResult) {

        System.out.println("\nTest - " + testResult.getName() + " - je USPESAN!");

        System.out.println( ukupnoTrajanjeTesta(testResult) );

        System.out.println("\n------------------------------------------");

        prosloTestova++;

    }

    public void onTestFailure(ITestResult testResult) {

        System.out.println("\nTest - " + testResult.getName() + " - je NEUSPESAN!");

        System.out.println( ukupnoTrajanjeTesta(testResult) );

        System.out.println("\n------------------------------------------");

        paloTestova++;

    }
    
    public void onTestSkipped(ITestResult testResult) {

        System.out.println("\nTest - " + testResult.getName() + " - je PRESKOCEN!");

        System.out.println( ukupnoTrajanjeTesta(testResult) );

        System.out.println("\n------------------------------------------");

        preskocenoTestova++;
    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    private String ukupnoTrajanjeTesta(ITestResult testResult){

        long trajanjeTesta = testResult.getEndMillis() - testResult.getStartMillis();

        return  "\nTest je trajao " + trajanjeTesta + " ms";

    }
}
