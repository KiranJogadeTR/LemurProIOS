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
'click on the finishflag'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/finishflagicon'), 10)
'wait for finish flag icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/finishflagicon'), 30)
'verify the popup on finishflag confirmation'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/finishflagicon'), 10)
'wait for yes button of finish flag icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/yesbuttonoffinishflag'), 30)
'click on the yes button of finish flag'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/yesbuttonoffinishflag'), 10)
'wait for main menu toolbox icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 30)
'click on the toolbox icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 10)
'wait for manage edits icon of gas valve'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/manageeditsiconofgasvalve'), 30)
'click on the manage edits icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/addgasvalvecollection/manageeditsiconofgasvalve'), 10)
'wait for sync icon of manage edits'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/synciconofmanagedits'), 30)
'verify sync icon of manage edits'
Mobile.verifyElementVisible(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/synciconofmanagedits'), 10)
'wait for delete button of gas valve'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteeditsofgasvalve/DeleteButtonofgasvalve'), 30)
'delete the gas valve edits'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteeditsofgasvalve/DeleteButtonofgasvalve'), 10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteeditsofgasvalve/nobuttonofdeleteeditsofmanageedits'), 30)
'click on the no icon of delete popup'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteeditsofgasvalve/nobuttonofdeleteeditsofmanageedits'), 10)
'wait for delete button of gas valve'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteeditsofgasvalve/DeleteButtonofgasvalve'), 30)
'click on the delete button'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteeditsofgasvalve/DeleteButtonofgasvalve'), 10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteeditsofgasvalve/yesiconofdelleteconfirmationofmaanageedits'), 30)
'click on the yes icon of manage edits'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteeditsofgasvalve/yesiconofdelleteconfirmationofmaanageedits'), 10)
'wait for manage edits close button'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageditsclosebutton'), 30)
'click on the x mark'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageditsclosebutton'),
	10)
'wait for yes button of confirmation popup'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/yesbuttonofeditconfirmationpopup'), 30)
'click on the yes button'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/yesbuttonofeditconfirmationpopup'), 10)
'wait for 20ses'
Mobile.delay(20)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Toolbox/toolboxclosebutton'), 30)
'click on the toolbox close button'
Mobile.tap(findTestObject('Object Repository/Toolbox/toolboxclosebutton'), 10)
