import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox--");
        options.addArguments("--disable-dev-shm-usage--");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Alert text:"+text);
        alert.accept();
        driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
        Alert alert1 = driver.switchTo().alert();
        String text1 = alert1.getText();
        System.out.println("Alert Msg text :"+text1);
        Thread.sleep(2000);
        alert1.dismiss();
        driver.findElement(By.xpath("//button[@id=\"promptBox\"]")).click();
        Alert alert2 = driver.switchTo().alert();
        String text2 = alert2.getText();
        System.out.println("Alert msg print"+text2);
        alert2.sendKeys("RajKumar");
        alert2.accept();
        driver.quit();


    }
}
