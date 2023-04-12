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

WebUI.navigateToUrl('https://community.dev.ampup.io/login')

WebUI.setText(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/input_Email_email'), 
    'ly+50@ampup.io')

WebUI.setEncryptedText(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/input_Password_password'), 
    'Ah46dIDtQhhWnNvSE7yd1Q==')

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_Login'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/li_LOCATIONS'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_Total energy_ant-btn ant-btn-default_38eccf'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_OFF'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_EDIT HOURS'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/input_Su_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_M'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_Add'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_SAVE'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_CONFIRM'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/td_Monday'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/span_All-day'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_EDIT HOURS'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_T'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_Add'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_SAVE'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_CONFIRM'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/td_Monday'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/td_Tuesday'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/td_All-day'))


WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_EDIT HOURS'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_W'))

// Update the first input of the hour
WebUI.setText(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/input'), '8:00')

// Update the second input of the hour
WebUI.setText(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/input_close_time'), '9:00')

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_Add'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_SAVE'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_CONFIRM'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/td_Wednesday'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/span_0800 AM - 0900 AM'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_APPLY CHANGES'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/button_CONFIRM'))

WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/svg'))

// Expectation

TestObject mondayTextObject = findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/td_Monday')
WebUI.verifyElementText(mondayTextObject, 'Monday')


//WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/span_All-day'))
//
//WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/td_Wednesday'))
//
//WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/span_0800 AM - 0900 AM'))
//
//WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/td_Tuesday'))
//
//WebUI.click(findTestObject('Object Repository/Check Public Availability/Page_ampUp Community Manager/span_All-day'))

