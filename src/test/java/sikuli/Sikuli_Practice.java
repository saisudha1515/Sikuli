package sikuli;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;
// YouTube Video playbutton, maximize, mute, unmute buttons handling..
public class Sikuli_Practice {
	public static void main(String[] args) throws Exception {
		Screen screen = new Screen();
		Pattern maximizeWin = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\Maximize.PNG");
		Pattern MuteBtn = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\Mute.PNG");
		Pattern playBtn = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\PlayBtn.PNG");
		Pattern volume = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\Volume.PNG");
		Pattern subscribeBtn = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\Subscribe.PNG");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/watch?v=wfLXeVyz9Dk");
		
		screen.click(maximizeWin);
		Thread.sleep(3000);
		screen.click(MuteBtn);
		Thread.sleep(3000);
		screen.click(playBtn);
		Thread.sleep(3000);
		screen.click(volume);
		Thread.sleep(3000);
		screen.click(subscribeBtn);
		
		
		
		

	}
}
