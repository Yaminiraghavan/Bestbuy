package pages;

import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlValidatorPage {
    private WebDriver driver;
// Constructor
public UrlValidatorPage(WebDriver driver) {
        this.driver = driver;
    }
public void urlValidate(String urlToTest) {
        try {
            // Open URL in the browser
            driver.get(urlToTest);
            // Check if page returns HTTP status code 200
            int statusCode = ((HttpURLConnection) (new URL(urlToTest).openConnection())).getResponseCode();
            if (statusCode == 200) {
                System.out.println("URL is valid and accessible. HTTP Status Code: " + statusCode);
            } else {
                System.out.println("URL is broken. HTTP Status Code: " + statusCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


