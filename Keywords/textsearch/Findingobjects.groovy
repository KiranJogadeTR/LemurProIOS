package textsearch

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import com.kms.katalon.core.testobject.ConditionType


public class Findingobjects {
	@Keyword
	def searchobjects() {
		'wait for main menu l;ayer picker icon'
		Mobile.waitForElementPresent(findTestObject('Object Repository/Mainmenuobjects/XCUIElementTypeButton - MainMenu_LayerPicker'), 30)
		'click on layer picker icon'
		Mobile.tap(findTestObject('Object Repository/Mainmenuobjects/XCUIElementTypeButton - MainMenu_LayerPicker'), 10)

		// Define the Test Object (button)
		TestObject button = findTestObject('Object Repository/Layerpickeronandoff/polestoggleicon')

		// Get the value attribute of the button
		String buttonValue = Mobile.getAttribute(button, 'value', 10)

		// Print the button's value attribute
		println("Button Value: " + buttonValue)

		// Check if the button is enabled based on the value attribute
		if (buttonValue == '1') {
			// assuming '1' means enabled in the 'value' attribute
			println("The button is enabled.")
		} else if (buttonValue == '0') {
			// assuming '0' means disabled in the 'value' attribute
			println("The button is disabled.")
			'click on the poles toggle button'
			Mobile.tap(findTestObject('Object Repository/Layerpickeronandoff/polestoggleicon'), 10)
		} else {
			println("Unexpected button value: " + buttonValue)
		}
		'click on the layers close button'
		Mobile.tap(findTestObject('Object Repository/Layerpickeronandoff/layersclosebutton'), 10)
		'verify  the main menu search icon'
		Mobile.waitForElementPresent(findTestObject('Object Repository/searchopen/XCUIElementTypeButton - MainMenu_Search'), 30)
		'click on the main menu search icon'
		Mobile.tap(findTestObject('Object Repository/searchopen/XCUIElementTypeButton - MainMenu_Search'), 10)
		'wait for search text tab'
		Mobile.waitForElementPresent(findTestObject('Object Repository/searchopen/searchtexttab'), 20)
		'enter the keys in text feild'
		Mobile.sendKeys(findTestObject('Object Repository/searchtext/XCUIElementTypeSearchField - enter search text'), "123")
		'wait for search layers dropdown visible'
		Mobile.waitForElementPresent(findTestObject('Object Repository/searchtext/searchalllayersdropdown'), 30)

		'click on the search layers dropdown'
		Mobile.tap(findTestObject('Object Repository/searchtext/searchalllayersdropdown'), 10)

		'wait for poles icon visible in the dropdown'
		Mobile.waitForElementPresent(findTestObject('Object Repository/searchtext/polesiconofsearch'), 30)

		// Step 3: Define dynamic locator to find option by text (or other attribute)
		TestObject dynamicOption = new TestObject().addProperty("xpath",
				ConditionType.EQUALS, "//XCUIElementTypeStaticText[@label = 'Poles [Fort Pierce]' ]")

		// Step 4: Scroll to the option if necessary
		//Mobile.scrollToText('Option Text')

		// Step 5: Tap the option
		Mobile.tap(dynamicOption, 10)
		'wait for given element present'
		Mobile.waitForElementPresent(findTestObject('Object Repository/Attributeview/firstmapiconfromsearchresults'), 30)
		'click on the first option from result'
		Mobile.tap(findTestObject('Object Repository/Attributeview/firstmapiconfromsearchresults'), 10)
		'wait for search close button'
		Mobile.waitForElementPresent(findTestObject('Object Repository/searchopen/searchclosebutton'), 30)
		'click on the x mark'
		Mobile.tap(findTestObject('Object Repository/searchopen/searchclosebutton'), 10)
		'wait for search close button'
		Mobile.waitForElementPresent(findTestObject('Object Repository/searchopen/searchclosebutton'), 30)
		'click on the x mark'
		Mobile.tap(findTestObject('Object Repository/searchopen/searchclosebutton'), 10)
	}
}

