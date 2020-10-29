package com.sv.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

	private final static long defaultTimeUnit = 60;
	private static String domReadyState = "return document.readyState";
	private static String jqueryActive = "return jQuery.active";

	public static void waitForJSPageReady(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, defaultTimeUnit);
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				return "complete".equals(((JavascriptExecutor) driver).executeScript(domReadyState));
			}
		};

		wait.until(pageLoadCondition);

	}

	public static boolean waitForJSandJQueryToLoad(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		// Wait for jQuery to load
		ExpectedCondition<Boolean> jqueryToLoad = new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				try {
					return (Long) ((JavascriptExecutor) driver).executeScript(jqueryActive) == 0;
				} catch (Exception e) {
					return true;
				}
			}
		};

		// Wait for Javascript to load
		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				return "complete".equals(((JavascriptExecutor) driver).executeScript(domReadyState));
			}
		};

		return wait.until(jqueryToLoad) && wait.until(jsLoad);

	}

	public void waitForPageReady(WebDriver driver, ExpectedCondition<?> exp) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		if (exp != null)
			wait.until(exp);

	}

}
