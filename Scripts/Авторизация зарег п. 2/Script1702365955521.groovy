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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.verifyLinksAccessible(['https://demowebshop.tricentis.com/'])

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Log in'))

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Login/input_Email'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Login/input_Password'), 10)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Login/input_button-1 login-button'), 10)

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email'), 'a.yakimova@qpdev.ru')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.verifyElementClickable(findTestObject('Page_Demo Web Shop. Login/input_button-1 login-button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_button-1 login-button'))

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop/div_a.yakimovaqpdev.ru            Log out  _35cf73'), 10)

