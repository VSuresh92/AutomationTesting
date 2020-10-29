package com.sv.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class WebElement implements org.openqa.selenium.WebElement {

	private final int defaultElementTimeout = 10000;
	private final int defaultWaitTimeout = 60000;

	private int elementTimeout;
	private String elementName;
	private By query;
	private WebDriver driver;
	private org.openqa.selenium.WebElement element = null;
	private org.openqa.selenium.WebElement parent = null;

	public WebElement(By query, WebDriver driver, org.openqa.selenium.WebElement element,
			org.openqa.selenium.WebElement parent, String elementName, int... timeOut) {
		this.query = query;
		this.driver = driver;
		this.element = element;
		this.parent = parent;
		this.elementTimeout = timeOut.length > 0 ? timeOut[0] : defaultElementTimeout;
		this.elementName = elementName;

	}
	
	public By getQuery() {
		
		return query;
	}
	
	public org.openqa.selenium.WebElement getWebElement() {
		
		if(element==null) 
			element = (parent==null) ? driver.findElement(query) : parent.findElement(query);
			
			return element;
	}
	
	public List<org.openqa.selenium.WebElement> getWebElements() {
		
		if(parent==null) {
			return driver.findElements(query);
		}else
			return parent.findElements(query);
	}
	
	public void click(boolean wait) {
		getWebElement().click();
		if(wait)
			System.out.println();
	}

	@Override
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		getWebElement().clear();

	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public org.openqa.selenium.WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<org.openqa.selenium.WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCssValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sendKeys(CharSequence... arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub

	}

}
