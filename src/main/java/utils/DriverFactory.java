package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.AddJobCategory;
import pageObjects.AddProductServices;
import pageObjects.AddProductToCart;
import pageObjects.ContactUs_Page;
import pageObjects.ForumPosts_delete;
import pageObjects.ForumPosts_edit;
import pageObjects.Forum_comment;
import pageObjects.IndividualProfileList;
import pageObjects.LandingPageOrg;
import pageObjects.PostPartnership;
import pageObjects.Products_Page;
import pageObjects.Profile_Page;
import pageObjects.ViewBusinessProfile;
import pageObjects.ViewJobandApply;

import pageObjects.ViewOneProduct;
import pageObjects.ViewPartnership;


public class DriverFactory {
	public static WebDriver driver;
	public static ViewBusinessProfile viewbusiness;
	public static LandingPageOrg landingpage;
	public static AddProductServices addproductsservices;
	public static ViewOneProduct viewoneproduct;
	public static AddProductToCart addproducttocart;
	public static AddJobCategory addjobcategory;
	public static ViewJobandApply viewjobandapply;
	public static Profile_Page profilePage;
	public static IndividualProfileList individualprofilelist;
	public static PostPartnership postpartnership;
	public static ViewPartnership viewpartnership;
	public static ForumPosts_edit forumpost_edit;
	public static ForumPosts_delete forumpost_delete;
	public static Forum_comment forum_comment;

	public WebDriver getDriver() {
		try {
			// Read Config
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {

			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				// code
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

			case "ie":
				// code
				if (null == driver) {
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					capabilities.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			//profilePage = PageFactory.initElements(driver, Profile_Page.class);
			viewbusiness = PageFactory.initElements(driver, ViewBusinessProfile.class);
			landingpage = PageFactory.initElements(driver, LandingPageOrg.class);
			addproductsservices = PageFactory.initElements(driver, AddProductServices.class);
			viewoneproduct = PageFactory.initElements(driver, ViewOneProduct.class);
			addproducttocart =  PageFactory.initElements(driver, AddProductToCart
					.class);
			addjobcategory = PageFactory.initElements(driver, AddJobCategory.class);
			viewjobandapply = PageFactory.initElements(driver, ViewJobandApply.class);
			individualprofilelist = PageFactory.initElements(driver, IndividualProfileList.class);
			profilePage = PageFactory.initElements(driver, Profile_Page.class);
			postpartnership = PageFactory.initElements(driver, PostPartnership.class);
			viewpartnership= PageFactory.initElements(driver, ViewPartnership.class);
			forumpost_edit = PageFactory.initElements(driver, ForumPosts_edit.class);
			forumpost_delete = PageFactory.initElements(driver, ForumPosts_delete.class);
			forum_comment = PageFactory.initElements(driver, Forum_comment.class);
			
		}
		return driver;
	}
}
