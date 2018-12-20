import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.ebay.com/')

WebUI.doubleClick(findTestObject('Object Repository/Page_Fashion Deals on eBay  Best de/span_Free shipping'))

WebUI.click(findTestObject('Object Repository/Page_Adidas NEW Gray Heather Mens O/a_Add to cart -'))

WebUI.click(findTestObject('Object Repository/Page_Adidas NEW Gray Heather Mens O/button_Shop by category'))

WebUI.click(findTestObject('Object Repository/Page_Adidas NEW Gray Heather Mens O/a_TV audio  surveillance'))

WebUI.click(findTestObject('Object Repository/Page_TV Video  Home Audio Electroni/span_Surveillance  Smart Home'))

WebUI.click(findTestObject('Object Repository/Page_TV Video  Home Audio Electroni/a_Home Surveillance Electronic'))

WebUI.closeBrowser()

