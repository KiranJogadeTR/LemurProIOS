import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


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
		'val-17')
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
'wait for valve correction text icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/Valve Correctiontexticon'), 30)	
'click on the valve correction text icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/Valve Correctiontexticon'), 10)
'wait for finish flag icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/finishflagicon'), 30)
'click on the finish flag icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/finishflagicon'), 10)
'wait for yes button of finish flag icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/yesbuttonoffinishflagconfirmationpopup'), 30)
'click on the yesbuttonof finishflag icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/yesbuttonoffinishflagconfirmationpopup'), 10)
'wait for main menu tool box icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 30)
'click on the toolbox icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 10)
'wait fro manage edits icon of gas valve'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/manageeditsiconofgasvalve'), 30)
'click on the manage edits icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/manageeditsiconofgasvalve'), 10)
'wait for manage edits close button'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageditsclosebutton'), 30)
'click on the x mark'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageditsclosebutton'),
	10)
'wait for close button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 30)
'click on the close button of toolbox'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'),
	10)
