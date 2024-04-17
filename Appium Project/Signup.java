static AndroidDriver driver;
Dimension size;
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	File classpathRoot = new File(System.getProperty("user.dir"));
	File appDir = new File(classpathRoot, "/apk");
	File app = new File(appDir, "sample.apk");

	DesiredCapabilities capabilities = new DesiredCapabilities(); 
	capabilities.setCapability("deviceName", "Samsung-T231"); 
	capabilities.setCapability("browserName", "Android"); 
	capabilities.setCapability("platformVersion", "4.4.2"); 
	capabilities.setCapability("platformName", "Android"); 
	capabilities.setCapability("appPackage", "com.vishnu.sample"); 
	capabilities.setCapability("appActivity","com.vishnu.sample.activities.HomeActivity"); 
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities); 
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	WebDriverWait wait = new WebDriverWait(driver, 300); 
	wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.RelativeLayout"))); 
	} 

	
	
	
	
@Test public void swipingHorizontal() throws InterruptedException {
	//Get the size of screen. 
	size = driver.manage().window().getSize();
	System.out.println(size); 
	//Find swipe start and end point from screen's with and height. 
	//Find startx point which is at right side of screen.
	int startx = (int) (size.width * 0.70);
	//Find endx point which is at left side of screen.
	int endx = (int) (size.width * 0.30);
	//Find vertical point where you wants to swipe.
	//It is in middle of screen height. 
	int starty = size.height / 2;
	System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
	//Swipe from Right to Left. 
	driver.swipe(startx, starty, endx, starty, 3000); 
	Thread.sleep(2000);
	//Swipe from Left to Right. 
	driver.swipe(endx, starty, startx, starty, 3000);
	Thread.sleep(2000); 
	} 

		@AfterMethod
    public void tearDown() {
           driver.quit();
    }