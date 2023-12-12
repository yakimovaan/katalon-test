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

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Email'), 'a.yakimova@qpdev.ru')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_Password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Login/input_button-1 login-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/input_termsofservice'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Shopping Cart/button_Checkout'))

WebUI.verifyLinksAccessible(['https://demowebshop.tricentis.com/onepagecheckout'])

WebUI.verifyElementClickable(findTestObject('Page_Demo Web Shop. Checkout/select_, , b , Albania                     _3239fc'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/select_, , b , Albania                     _3239fc'), 
    'New Address', true)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.FirstName'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.LastName'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.Email'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.Company'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.City'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.Address1'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.Address2'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.ZipPostalCode'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.PhoneNumber'), 5)

WebUI.verifyElementClickable(findTestObject('Page_Demo Web Shop. Checkout/select_Select countryUnited StatesCanadaAfg_dd1e54'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/select_Select countryUnited StatesCanadaAfg_dd1e54'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_BillingNewAddress.City'), 'Mosk')

WebUI.verifyElementText(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.City'), 'Mosk')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_BillingNewAddress.Address1'), 'Vrn, Nevsk13A')

WebUI.verifyElementText(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.Address1'), 'Vrn, Nevsk13A')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_BillingNewAddress.ZipPostalCode'), '345345')

WebUI.verifyElementText(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.ZipPostalCode'), '345345')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_BillingNewAddress.PhoneNumber'), '190876543')

WebUI.verifyElementText(findTestObject('Page_Demo Web Shop. Checkout/input_BillingNewAddress.PhoneNumber'), '190876543')

WebUI.verifyElementClickable(findTestObject('Page_Demo Web Shop. Checkout/input_button-1 new-address-next-step-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Checkout/input_button-1 new-address-next-step-button'))

