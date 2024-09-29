package com.xgen.automation.actions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.xgen.automation.base.CommonAction;

public class RunWithMain extends CommonAction {

	public static void main(String[] args) {
		CommonAction comm = new CommonAction();
		comm.startChromeDriver();
		comm.openPage("https://the-internet.herokuapp.com/upload");
		comm.sleep(2000);
		File uploadFile = new File("src/test/resources/files/fileUpload.png");

	    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
	    fileInput.sendKeys(uploadFile.getAbsolutePath());
	    comm.sleep(7000);
	    driver.findElement(By.id("file-submit")).click();


	}

}
