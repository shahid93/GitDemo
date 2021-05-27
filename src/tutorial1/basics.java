package tutorial1;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {
public static void main(String[] args) throws MalformedURLException {
		
		base b= new base();
		AndroidDriver<AndroidElement> driver =capabilities();
		
		//xpath id class androidUIautomator
		/*
		Xpath syntax
		//tagname[@attribute='value']
		 * 
		
		
		*/
		
		driver.findElementByXPath("//android.widget.TextView@text='Preference'").click();
		
	}
}
