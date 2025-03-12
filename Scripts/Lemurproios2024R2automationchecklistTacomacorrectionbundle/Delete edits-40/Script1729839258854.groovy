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
'wait for work order correction'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeStaticText - Work Order Correction'), 30)
'After attribute view opening verify the work order correction text'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeStaticText - Work Order Correction'),
	10)
'Then tap on the work order correction text from the attribute view'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeStaticText - Work Order Correction'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/addworkordercorrectionicon (1)'), 30)
'after clicking the work order correction right side menu will open from that menu click on the top icon i.e addworkordercorrection'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/addworkordercorrectionicon (1)'),
	10)
'wait for savebutton of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 30)
'after tapping on the add work order correction new attribute window will openfrom that verify the below all elements.This line verify the save button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'),
	10)
'wait for delete button of attribute view'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/Deletebuttonofattributeview'), 30)
'verify the delete button '
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/Deletebuttonofattributeview'),
	10)
'wait for edit icon of attribute view'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/editiconofattributeview'), 30)
'verify the edit button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/editiconofattributeview'),
	10)
'wait for barcode of attribute view'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/barcodeofattribuiteview'), 30)
'verify the barcode button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/barcodeofattribuiteview'),
	10)
'wait for data entry test correction icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - DataEntryTest Corrections'), 30)
'verify the dataentrydata correction '
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - DataEntryTest Corrections'),
	10)
'wait for test text present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestText'), 30)
'verify testtext attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestText'),
	10)
'wait for test integer text icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/testintegertext'), 30)
'verify the testinteger attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/testintegertext'),
	10)
'wait for test double icon'
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
'wait for no value text field icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/No Valuetextfield'), 30)
'entering the text in the No value text feild'
Mobile.sendKeys(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/No Valuetextfield'),
	'line')
'wait for save button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 30)
'click on the save button'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'),
	10)
'wait for ok button of saved icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/okbuttonofsaved'), 30)
'click on the ok button of confirmation'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/okbuttonofsaved'),
	10)
'wait for close button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 30)
'click on the close button of the attribute view'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'),
	10)
'wait for finish flag icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/finishflagicon'), 30)
'click on the finishflag ico on the right side of the menu'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/finishflagicon'),
	10)

'wait for yes button of finish flag'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/yesbuttonoffinishflag'), 30)
'click on the yes button of confirmation popup'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/yesbuttonoffinishflag'),
	10)
'wait for main menu toolbox icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 30)
'clicking on the main menu toolbox icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'),
	10)
'wait for manage edits icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageeditsicon'), 30)
'then click on the manageedits icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageeditsicon'),
	10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/workorder123ABCtexticon'), 30)
'verify the created workorder'
Mobile.verifyElementVisible(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/workorder123ABCtexticon'), 10)
'wait for delete edit icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Deleteedits/deleteediticon'), 30)
'click on the delete icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Deleteedits/deleteediticon'), 10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Deleteedits/noiconofdeleteeditsconfirmationpopup'), 30)
'click on the no button of delete confirmation'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Deleteedits/noiconofdeleteeditsconfirmationpopup'), 10)
'wait for delete edits icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Deleteedits/deleteediticon'), 30)
'click on the delete icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Deleteedits/deleteediticon'), 10)
'wait for yes icon of delete confirmation popup'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Deleteedits/yesiconofdeleteconfirmationpopup'), 30)
'click on the yes button of delete confiramation popup'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Deleteedits/yesiconofdeleteconfirmationpopup'), 10)
'wait for manage edits close button'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageditsclosebutton'), 30)
'click on the x mark'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageditsclosebutton'),
	10)
'wait for yes button of confirmation popup'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/yesbuttonofeditconfirmationpopup'), 30)
'click on the yes button'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/syncedits/yesbuttonofeditconfirmationpopup'), 10)
'wait for close button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 30)
'click on the close button of toolbox'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'),
	10)
'wait for 20 secs'
Mobile.delay(20)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Toolbox/toolboxclosebutton'), 30)
'click on the element'
Mobile.tap(findTestObject('Object Repository/Toolbox/toolboxclosebutton'), 10)