package sikuli;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {
	public static void main(String[] args) throws Exception {
		/**
		 * In Sikuli we use 2 classes that are 1.Pattern Class and 2.Screen Class
		 * Pattern Class is used to Find the Images.. Screen Class will focus on Screen
		 * once you crate the object for Screen Class. Import the Pattern and Screen
		 * classes from org.sikuli.script and org.sikuli.Pattern packages use
		 * "SnippingTool" to take the screen shot of the required elements
		 */
		Screen screen = new Screen();
		Pattern gmailLnk = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\gmailLnk.PNG");
		Pattern emailEdt = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\emailOrPhoneEdt.PNG");
		Pattern nextBtn = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\nextBtn.PNG");
		Pattern pwdEdt = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\paswordEdt.PNG");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");

		screen.wait("gmailLnk", 10);
		screen.click(gmailLnk);
		screen.type(emailEdt, "saisudha.doddi@gmail.com");
		screen.click(nextBtn);
		screen.type(pwdEdt, "78932@#66369");  // element and action that you are gonna perform on that element..
		screen.click(nextBtn);

	}
}
