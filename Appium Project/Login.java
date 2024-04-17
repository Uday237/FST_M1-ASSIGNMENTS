private static AndroidDriver driver;
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	File classpathRoot = new File(System.getProperty("user.dir"));
	File appDir = new File(classpathRoot, "/apk");
	File app = new File(appDir, "sample.apk");

	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	capabilities.setCapability("deviceName", "Appium_AVD");
	capabilities.setCapability("platformVersion", "4.4.2");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("app", app.getAbsolutePath());
	capabilities.setCapability("appPackage", "com.sample.en");
	capabilities.setCapability("appActivity", "com.sample.en.activities.HomeActivity");
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	Thread.sleep(9990000); 
}
	
	@Test
	
	public void testApp() throws Exception{
		
		driver.context("NATIVE_APP"); 
		Dimension size = driver.manage().window().getSize(); 
		int startx = (int) (size.width * 0.8); 
		int endx = (int) (size.width * 0.20); 
		int starty = size.height / 2; 
		driver.swipe(startx, starty, endx, starty, 1000);
	}
		
		
	
	
		
	@AfterMethod
    public void tearDown() {
           driver.quit();
    }