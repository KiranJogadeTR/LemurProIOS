package custom

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

public class Regressionthemed {
	@Keyword
	def themedlogin() {

		'launching the application'
		Mobile.startExistingApplication("com.critigen.Lemur.Pro")
		'wait for regression themed bundle'
		Mobile.waitForElementPresent(findTestObject('Object Repository/Allbundlesicon/XCUIElementTypeStaticText - TA Ft Pierce Regression Themed'), 40)
		'click on the bundle'
		Mobile.tap(findTestObject('Object Repository/Allbundlesicon/XCUIElementTypeStaticText - TA Ft Pierce Regression Themed'), 10)
		'wait for the main menu appears'
		Mobile.delay(190)
		Mobile.waitForElementPresent(findTestObject('Object Repository/Mainmenuobjects/XCUIElementTypeButton - MainMenu_BasemapSelector'), 40)
	}
}
