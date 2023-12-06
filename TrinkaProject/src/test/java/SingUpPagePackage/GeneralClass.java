package SingUpPagePackage;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GeneralClass {
	public static class GeneralFunctions extends Base 
	{


		public static  Properties objprop;

		/**
		 * @Description :To load the webpage
		 * @Return      :None
		 */
		
		public void loadTrinka()
		{
			objprop=initPropetry();
			driver.get(objprop.getProperty("appUrl"));
		}
		
	private Properties initPropetry() {
			// TODO Auto-generated method stub
			return null;
		}

	public void loginTrinka()
	{
		WebDriverWait genericWait = new WebDriverWait(driver, 30);
	//	Properties	objprop=initPropetry();
		GeneralClass.setText(SingUpRunClass.txtUserName, objprop.getProperty("userName"));
		GeneralClass.setText(SingUpRunClass.txtPassword, objprop.getProperty("password"));
		GeneralClass.buttonClick(SingUpRunClass.btnLogin);
		genericWait.until(ExpectedConditions.elementToBeClickable(By.xpath(TrinkaDashboardPage.btnUpload)));
	}
	}
}

