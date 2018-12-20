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

WebUI.navigateToUrl('https://www.amazon.com/ap/signin?clientContext=133-0588206-7135320&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fspark&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_spark_desktop_us&openid.mode=checkid_setup&marketPlaceId=ATVPDKIKX0DER&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=amzn_spark_desktop_us&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.pape.max_auth_age=1209600&siteState=clientContext%3D142-8240001-1864037%2CsourceUrl%3Dhttps%253A%252F%252Fwww.amazon.com%252Fspark%2Csignature%3Dxj2Bz6zU1s5IRhrJri4WLdf8llPaUj3D')

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign In/input_Email (phone for mobile'), 'manumahendran@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Amazon Sign In/input_Forgot your password_pas'), '4xrvMrFm/80=')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/a_Conditions of Use'))

WebUI.switchToWindowTitle('Amazon.com Help: Conditions of Use')

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Help Conditions of/span_From The Community_nav-sp'))

WebUI.closeBrowser()

