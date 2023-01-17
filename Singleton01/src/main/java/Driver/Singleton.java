package Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.nio.file.Path;

public class Singleton{

    private static WebDriver driver;
    private static Singleton singleton = new Singleton();

    private Singleton() {

        driver= WebDriverManager.chromedriver().avoidShutdownHook().create();
    }

    public static Singleton getInstance(){
        return singleton;
    }
    public static WebDriver launch() {

        return driver;
    }
}
