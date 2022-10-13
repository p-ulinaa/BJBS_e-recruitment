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

WebUI.openBrowser(GlobalVariable.LinkPelamar)

WebUI.maximizeWindow()

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Login'))

WebUI.click(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/span_Login'), 'Login')

WebUI.verifyElementText(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/h6_UsernameEmail'), 'Username/Email')

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/input_UsernameEmail_MuiInputBase-input MuiF_2685fc'))

WebUI.setText(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/input_UsernameEmail_MuiInputBase-input MuiF_2685fc'), 
    'ulina_roma@yahoo.com')

WebUI.verifyElementText(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/h6_Password'), 'Password')

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/input_Password_MuiInputBase-input MuiFilled_cadc37'))

WebUI.setEncryptedText(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/input_Password_MuiInputBase-input MuiFilled_cadc37'), 
    'iSEWCsnSE73PQQFqiZnV/Q==')

WebUI.click(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Login_1'))

