package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Timer;
import java.util.TimerTask;

public class TestSuite {
    private static Timer timer;

    public static void main(String[] args) {
        Timer time = new Timer();
        TimerTask daily = new TimerTask() {
            @Override
            public void run() {
                TestSuite.runTests();
            }
          };
        long delay =0;
        long period =96400000;
        timer.scheduleAtFixedRate(daily,delay,period);
    }
    private static void runTests(){
        WebDriver driver =new ChromeDriver();
        try {
              driver.get("https://www.bestbuy.com/");
            System.out.println("BestBuy Website");
        } finally {
            driver.quit();
        }
    }
}
