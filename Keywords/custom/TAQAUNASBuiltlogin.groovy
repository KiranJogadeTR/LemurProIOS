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

public class TAQAUNASBuiltlogin {

	@Keyword
	def login() {

		'starting the applicationb'
		Mobile.startExistingApplication('com.critigen.Lemur.Pro')
		'wqait for 40secs'
		Mobile.delay(40)
		'wait for element present'
		Mobile.waitForElementPresent(findTestObject('Object Repository/LemurproiosTaqaunasbuiltbundle/selectbundle/XCUIElementTypeStaticText - TA QA UN As Built'), 30)
		'tap on the regression bundle icon'
		Mobile.tap(findTestObject('Object Repository/LemurproiosTaqaunasbuiltbundle/selectbundle/XCUIElementTypeStaticText - TA QA UN As Built'), 10)
		'wait for 160 secs'
		Mobile.delay(210)
		'wait for basemap selector icon loads'
		Mobile.waitForElementPresent(findTestObject('Object Repository/Mainmenuobjects/XCUIElementTypeButton - MainMenu_BasemapSelector'), 10)
	}
}
