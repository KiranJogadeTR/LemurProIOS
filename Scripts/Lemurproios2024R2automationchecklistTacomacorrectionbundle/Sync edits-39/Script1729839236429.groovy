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


CustomKeywords.'custom.Tacomatextsearch.tacomasearch'()

Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeStaticText - Work Order Correction'), 30)
'Then tap on the work order correction text from the attribute view'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeStaticText - Work Order Correction'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/addworkordercorrectionicon (1)'), 30)
'after clicking the work order correction right side menu will open from that menu click on the top icon i.e addworkordercorrection'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/addworkordercorrectionicon (1)'),
	10)
'wait for save button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 30)
'after tapping on the add work order correction new attribute window will openfrom that verify the below all elements.This line verify the save button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'),
	10)
'wait for delete button of attribute view'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/Deletebuttonofattributeview'), 30)
'verify the delete button '
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/Deletebuttonofattributeview'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/editiconofattributeview'), 30)
'verify the edit button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/editiconofattributeview'),
	10)
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/barcodeofattribuiteview'), 30)
'verify the barcode button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/barcodeofattribuiteview'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - DataEntryTest Corrections'), 30)
'verify the dataentrydata correction '
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - DataEntryTest Corrections'),
	10)
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestText'), 30)
'verify testtext attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestText'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/testintegertext'), 30)
'verify the testinteger attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/testintegertext'),
	10)
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDouble'), 30)
'verfy the test double attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDouble'),
	10)
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDate'), 30)
'verify testdate attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDate'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - FreeformText'), 30)
'verify freeformtext attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - FreeformText'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/plusiconoftestinteger'), 30)
'tap on the plus icon of integer'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/plusiconoftestinteger'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/No Valuetextfield'), 30)
'entering the text in the No value text feild'
Mobile.sendKeys(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/No Valuetextfield'),
	'line')
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 30)
'click on the save button'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'),
	10)
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/okbuttonofsaved'),
	 30)
'click on the ok button of confirmation'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/okbuttonofsaved'),
	10)
'wait for close button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 30)
'click on the close button of the attribute view'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'),10)
'wait for element '
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteworkorder/closebuttonofrightmanuworkorder'), 30)
'click on the x mark'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteworkorder/closebuttonofrightmanuworkorder'), 10)
'wait for main menu toolbox icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 30)
'click on the toolbox icon of mainmenu'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 10)
'wait for manage edits icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageeditsicon'), 30)
'click on the manageedits icon of main menu'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageeditsicon'), 10)
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/synciconofmanagedits'), 30)
'verify the sync icon of manage edits'
Mobile.verifyElementVisible(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/synciconofmanagedits'), 10)
'click on the sync icon of manage edits'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/synciconofmanagedits'), 10)
'wait for popup present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/yesiconofsyncconfiramationpopup'), 30)
'click on the yes button of confirmation popup'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/yesiconofsyncconfiramationpopup'), 10)
'wait for 20 secs'
Mobile.delay(20)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteworkorder/closebuttonofrightmanuworkorder'), 30)
'click on the x mark'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/deleteworkorder/closebuttonofrightmanuworkorder'), 10)
'wait for main menu search icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Search'), 30)
'tapping on the main menu search icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Search'),
	10)
'wait for search layers text icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/searchlayerstexticon'), 30)
'verifying the text tab after opening search'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/searchlayerstexticon'),
	10)
'wait for enter search text feild '
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/entersearchtextfield'), 30)
'entering the text in the entersearchtextfield'
Mobile.sendKeys(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/entersearchtextfield'),
	'123ABC')
'wait for search icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/searchicon'), 30)
'afterentering the text in text feild click on the search on virtual keyboard'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/searchicon'),
	10)
'wait for zoom icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/zoomicon'), 30)
'after getting the results click on the first icon from thye results'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/zoomicon'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeStaticText - Work Order Correction'), 30)
'Then tap on the work order correction text from the attribute view'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeStaticText - Work Order Correction'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/addworkordercorrectionicon (1)'), 30)
'after clicking the work order correction right side menu will open from that menu click on the top icon i.e addworkordercorrection'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/addworkordercorrectionicon (1)'),
	10)
'wait for element '
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 30)
'after tapping on the add work order correction new attribute window will openfrom that verify the below all elements.This line verify the save button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'),
	10)
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/Deletebuttonofattributeview'), 30)
'verify the delete button '
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/Deletebuttonofattributeview'),
	10)
'wait for element '
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/editiconofattributeview'), 30)
'verify the edit button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/editiconofattributeview'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/barcodeofattribuiteview'), 30)
'verify the barcode button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/barcodeofattribuiteview'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - DataEntryTest Corrections'), 30)
'verify the dataentrydata correction '
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - DataEntryTest Corrections'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestText'), 30)
'verify testtext attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestText'),
	10)
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/testintegertext'), 30)
'verify the testinteger attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/testintegertext'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDouble'), 30)
'verfy the test double attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDouble'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDate'), 30)
'verify testdate attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDate'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - FreeformText'), 30)
'verify freeformtext attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - FreeformText'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/plusiconoftestinteger'), 30)
'tap on the plus icon of integer'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/plusiconoftestinteger'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/No Valuetextfield'), 30)
'entering the text in the No value text feild'
Mobile.sendKeys(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/No Valuetextfield'),
	'line')
'wait for save button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 30)
'click on the save button'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'),
	10)
'wait for okbutton of saved'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/okbuttonofsaved'), 30)
'click on the ok button of confirmation'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/okbuttonofsaved'),
	10)
'wait for close button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 30)
'click on the x mark'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 10)
'wait for finish flag icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/finishflagicon'), 30)
'click on the finishflag'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/finishflagicon'), 10)
'wait for finish flag icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/yesbuttonoffinishflag'), 30)
'click on the yes button of finish flag'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/yesbuttonoffinishflag'), 10)
'wait for main menu toolbox icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 30)
'click on the toolbox icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 10)
'wait for manage edits icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageeditsicon'), 30)
'click on manage edits icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageeditsicon'), 10)
'wait for sync icon of manage edits'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/synciconofmanagedits'), 30)
'click on the syn icon of manage edits'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/synciconofmanagedits'), 10)
'wait for element'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/yesiconofsyncconfiramationpopup'), 30)
'click on the yes button of sync confirmation popup'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/yesiconofsyncconfiramationpopup'), 10)
'wait for close button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 30)
Mobile.delay(10)
'click on the x mark'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Toolbox/toolboxclosebutton'), 30)
'click on the element'
Mobile.tap(findTestObject('Object Repository/Toolbox/toolboxclosebutton'), 10)