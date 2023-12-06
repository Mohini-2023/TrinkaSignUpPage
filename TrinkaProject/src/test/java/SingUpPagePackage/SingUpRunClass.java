package SingUpPagePackage;

import java.util.Collections;
import java.util.HashMap;
import SignUpPagePackage.SignUpClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class SingUpRunClass extends Base {

	
	public static void main(String args[]) {
				public static  initializeDriver(String browserType,String url) {
	//public static void main(String args[]) {
					//downloadFilepath = baseDirectory + "/FileDownloads";
					switch (browserType) {
					case "Chrome":
						System.setProperty("webdriver.chrome.driver", baseDirectory + "/home/mohinimagar/eclipse-workspace/TrinkaProject/target/Externaljars/chromedriver");
						HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
						chromePrefs.put("profile.default_content_settings.popups", 0);
						chromePrefs.put("download.prompt_for_download", "false");
			//			chromePrefs.put("download.default_directory", downloadFilepath);
						chromePrefs.put("plugins.plugins_disabled", new String[] { "Adobe Flash Player", "Chrome PDF Viewer" });
						chromePrefs.put("credentials_enable_service", false);
						chromePrefs.put("password_manager_enabled", false);
						ChromeOptions options = new ChromeOptions();
						options.setExperimentalOption("prefs", chromePrefs);
						options.setExperimentalOption("useAutomationExtension", false);
						options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
						DesiredCapabilities cap = DesiredCapabilities.chrome();
						cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
						cap.setCapability(ChromeOptions.CAPABILITY, cap);
						driver = new ChromeDriver(options);
						driver.manage().window().maximize();
	                     driver.get("https://cloud.trinka.ai/signup?_rg=GB&source=(direct)&medium=(none)");
		                SignUpClass signUpClass = new SignUpClass(driver);
		                signUpClass.GenerateRandomEmail();
		                signUpClass.FirstName();
	                    signUpClass.LastName();
	                    signUpClass.CreateAccount();
					
	               	}
				//	return driver;
				}
             } 
}


	

