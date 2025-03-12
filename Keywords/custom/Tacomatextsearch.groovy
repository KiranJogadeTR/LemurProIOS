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

public class Tacomatextsearch {
	@Keyword
	def tacomasearch() {
		'wait for element present'
		Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Search'), 30)
		'tapping on the main menu search icon'
		Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Search'),
				10)

		'verifying the text tab after opening search'
		Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/searchlayerstexticon'),
				30)

		'entering the text in the entersearchtextfield'
		Mobile.sendKeys(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/entersearchtextfield'),
				'123ABC')
		'wait for element present'
		Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/searchbuttonofworkorder'), 30)
		'afterentering the text in text feild click on the search on virtual keyboard'
		Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/searchbuttonofworkorder'),
				10)
		'wait for the given element'
		Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/zoomicon'), 30)
		'after getting the results click on the first icon from the results'
		Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/zoomicon'),
				10)
	}
}
