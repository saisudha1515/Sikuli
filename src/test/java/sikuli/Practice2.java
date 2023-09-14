package sikuli;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Practice2 {
public static void main(String[] args) throws Exception {
	Screen screen = new Screen(); // Once you create the object it will focus on the screen..
	Pattern searchBar = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\searchBar.PNG"); // Pattern class is used to Find the elements.. take screenShot of the element on whichever you want to perform action..pass the path of the screenShot in the Pattern Class..
	Pattern minimiseWin = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\minimizeExcel.PNG");
    screen.click(minimiseWin);
    screen.wait(searchBar, 10);  // take wait(PSI target,double timeOut):Match- Object
	screen.click(searchBar);
	screen.type("Excel");// target means on which element you want to perform action..and also pass which String you want to pass in that textField ex: UserName, Password etc.."screen.click(userNameScreenShot,"saisudha");
	// Use Robot class to click on searchBar..after entering the required search in the searchBar..
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Pattern maximizeExcelWindow = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\maxExcelWindow.PNG");
	Pattern selectFirstExcel = new Pattern("C:\\Users\\LENOVO\\Desktop\\SikuliScreenShots\\maxExcelWindow.PNG");
	Thread.sleep(3000);
	screen.click(maximizeExcelWindow);
	Thread.sleep(3000);
	screen.click(selectFirstExcel);
	
	// save in the paint when you want to handle the WebApplication along with Standalone Application..ex: www.google.com --> click on 
	// for this all need to do is only print the Screen use "PrtSc" key from keyBoard.. and follow the same normal procedure to perform action on that element..
	
	}
}
