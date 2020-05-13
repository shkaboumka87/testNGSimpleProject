package testng.primeri;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class PonoviTestove implements IRetryAnalyzer {

    private int brojPokusaja = 0;
    private static int MAX_BROJ_POKUSAJA = 3;

    public boolean retry(ITestResult rezultat){

        if (!rezultat.isSuccess()) {
            if(brojPokusaja < MAX_BROJ_POKUSAJA){
                brojPokusaja++;
                return true;
            }
        }
        return false;
    }

}
