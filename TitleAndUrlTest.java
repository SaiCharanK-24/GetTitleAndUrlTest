import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrlTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        String title = driver.getTitle();
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(CurrentUrl);
        driver.quit();
    }
}
