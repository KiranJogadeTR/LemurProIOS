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

CustomKeywords.'custom.Tacomalogin.login'()
'wait for main menu toolbox icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 30)
'click on the toolbox icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Mainmenuobjects/XCUIElementTypeButton - MainMenu_Toolbox'), 10)
'wait for manage edits icon '
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageeditsicon'), 30)
'click on the manage edits icon'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageeditsicon'), 10)
'wait for edits manager view icon'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label'), 30)
'verify the element is visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label'), 10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (1)'), 30)
'verify the cache files'
Mobile.verifyElementVisible(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (1)'), 10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (2)'), 30)
'verify the cache files is visible or not'
Mobile.verifyElementVisible(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (2)'), 10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (3)'), 30)
'verify the element visible or not'
Mobile.verifyElementVisible(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (3)'), 10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (4)'), 30)
'verify the element visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (4)'), 10)
'wait for element present'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (4)'), 30)
'verify the element visible or not'
Mobile.verifyElementVisible(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/cachefiles/XCUIElementTypeStaticText - EditsManagerView_EditItem_Label (4)'), 10)
'wait for map edits close button'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageditsclosebutton'), 30)
'vclick on the x mark'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/manageditsclosebutton'), 10)
'wait for close button of work order'
Mobile.waitForElementPresent(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 30)
'click on the x mark'
Mobile.tap(findTestObject('Object Repository/Lemurpro2024R2checklistTacomacorrectionbundle/Addworkordercorrection/closebuttonofworkorder'), 10)