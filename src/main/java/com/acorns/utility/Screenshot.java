package com.acorns.utility;


import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.acorns.main.MainTest;

public class Screenshot extends MainTest {

	public void takeScreenShot() throws Exception{
		TakesScreenshot ts = (TakesScreenshot) driver;
		String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date(0));
		File source = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source,new File("D:\\eclipse-workspace\\com.acorns\\Screenshot\\img" + filename + ".png"));
		FileUtils.copyFile(source,new File("D:\\eclipse-workspace\\com.acorns\\Screenshot\\img" + System.currentTimeMillis() + ".png"));
		// System.out.println("Screenshot Taken");
	}
}