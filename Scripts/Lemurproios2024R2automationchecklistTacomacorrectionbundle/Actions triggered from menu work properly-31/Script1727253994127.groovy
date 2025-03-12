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

'enter the text in search feild'
CustomKeywords.'custom.Tacomatextsearch.tacomasearch'()

'wait for work order correction'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeStaticText - Work Order Correction'), 
    30)

'Then tap on the work order correction text from the attribute view'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeStaticText - Work Order Correction'), 
    10)

'wait for add work order correction icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/addworkordercorrectionicon (1)'), 
    30)

'after clicking the work order correction right side menu will open from that menu click on the top icon i.e addworkordercorrection'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/addworkordercorrectionicon (1)'), 
    10)

'wait for save button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 
    30)

Mobile.waitForElementAttributeValue(findTestObject(null), '', '', 0)

'after tapping on the add work order correction new attribute window will openfrom that verify the below all elements.This line verify the save button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 
    10)

'wait for delete button of attribute view'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/Deletebuttonofattributeview'), 
    30)

'verify the delete button '
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/Deletebuttonofattributeview'), 
    10)

'wait for edit icon of attribute view'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/editiconofattributeview'), 
    30)

'verify the edit button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/editiconofattributeview'), 
    10)

'wait for bar code of attribute view'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/barcodeofattribuiteview'), 
    30)

'verify the barcode button'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/barcodeofattribuiteview'), 
    10)

'wait for data entry set corrections'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - DataEntryTest Corrections'), 
    30)

'verify the dataentrydata correction '
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - DataEntryTest Corrections'), 
    10)

'wait for test text icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestText'), 
    30)

'verify testtext attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestText'), 
    10)

'wait for testinteger text icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/testintegertext'), 
    30)

'verify the testinteger attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/testintegertext'), 
    10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDouble'), 
    30)

'verfy the test double attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - TestDouble'), 
    10)

'wait for free from text icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - FreeformText'), 
    30)

'verify freeformtext attribute'
Mobile.verifyElementExist(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/XCUIElementTypeStaticText - FreeformText'), 
    10)

'wait for plus icon of test integer'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/plusiconoftestinteger'), 
    30)

'tap on the plus icon of integer'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/plusiconoftestinteger'), 
    10)

'wait for no value text feild'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/No Valuetextfield'), 
    30)

'entering the text in the No value text feild'
Mobile.sendKeys(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/No Valuetextfield'), 
    'line')

'wait for save button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 
    30)

'click on the save button'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/savebuttonofworkorder'), 
    10)

'wait for ok button of saved'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/okbuttonofsaved'), 
    30)

'click on the ok button of confirmation'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/okbuttonofsaved'), 
    10)

'wait for close button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 
    30)

'click on the close button of the attribute view'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 
    10)

'wait for toolbox close button'
Mobile.waitForElementPresent(findTestObject('Object Repository/Toolbox/toolboxclosebutton'), 30)

'click on the x mark'
Mobile.tap(findTestObject('Object Repository/Toolbox/toolboxclosebutton'), 10)

'search for work order '
CustomKeywords.'custom.Tacomatextsearch.tacomasearch'()

'wait for three dots icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Actionstriggeredfrommenu/threedotsonattributeview'), 30)

'click on the three dots icon'
Mobile.tap(findTestObject('Object Repository/Actionstriggeredfrommenu/threedotsonattributeview'), 10)

'wait for google action test'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/actionstriggeredfrommainmenu/XCUIElementTypeStaticText - GoogleActionTest'), 
    30)

'click on the google action test'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/actionstriggeredfrommainmenu/XCUIElementTypeStaticText - GoogleActionTest'), 
    10)

'closing the application'
Mobile.closeApplication()

'logging into the tacoma correction'
CustomKeywords.'custom.Tacomalogin.login'()

