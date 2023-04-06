package Seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchgooglechrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\L E N O V O\\IdeaProjects\\programs\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.co.in");


    }
}
