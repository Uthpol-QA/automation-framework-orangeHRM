package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter {

	public static void getColor(WebDriver driver, WebElement element) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;// Typecasting
		jsExecutor.executeScript("arguments[0].style.border='3px solid red'", element);
	}

//Java =OOPs=Polymorphism = overloading / static binding
	// parapmeter = number.position,data type
	public static void getColor(WebDriver driver, WebElement element, String color) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='3px solid " + color + "'", element);
	}
}