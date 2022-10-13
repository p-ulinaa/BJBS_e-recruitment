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

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Temukan Karir Impianmu'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Raihlah mimpi dan masa depanmu dengan kami BJBS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Awali Karirmu'))

WebUI.click(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Awali Karirmu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Fresh Graduate'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Fresh Graduate'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Berpengalaman'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Jalur Khusus'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Berpengalaman'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Jalur Khusus'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Nilai-Nilai Budaya di BJBS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Butir-butir Ikhlas'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/hr_Jalur Khusus_MuiDivider-root jss40'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Jalur Khusus_MuiBox-root jss165 jss41'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Jalur Khusus_MuiBox-root jss165 jss41'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Harmoni 3Saling menghargai dan Peduli p_c059f5'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Jalur Khusus_MuiButtonBase-root MuiF_97138f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Jalur Khusus_MuiButtonBase-root MuiF_97138f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Temukan Karir Impianmu Sekarang.,,'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Kami bank bjb syariah merupakan bank yang_085343'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/hr_Jalur Khusus_MuiDivider-root jss54'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Tap to unmute_ytp-cued-thumbnail-overlay-image (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Lowongan Pekerjaan yang ada saat ini,,'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_,,Mari bergabung dan tentukan pilihan mas_0cb079'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/hr_Jalur Khusus_MuiDivider-root jss64'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Pencarian Posisi KerjaReset FilterKateg_961f1c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Program Singkat saat ini,,'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_,,ini sub judul program singkat'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/hr_Lihat Detail_MuiDivider-root jss97'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_,,program singkat ke-2 bbbbb,,program s_fd213f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Lihat Detail_MuiPaper-root jss105 MuiPa_1548a6'))

WebUI.verifyElementVisible(findTestObject('Page_E-Recruitment BJBS/p_Alur Seleksi saat ini.,,'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_,,sub judul alur seleksi saat ini'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/hr_Lihat Detail_MuiDivider-root jss113'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Lihat Detail_MuiBox-root jss173 jss121'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Lihat Detail_MuiBox-root jss173 jss121'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Jalur Khusus_MuiButtonBase-root MuiF_97138f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Jalur Khusus_MuiButtonBase-root MuiF_97138f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Video Recruitment terbaru,,'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_sub judul video recruitment,,'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/hr_Lihat Detail_MuiDivider-root jss128'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Tap to unmute_ytp-cued-thumbnail-overlay-image (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_Event Recruitment saat ini.,,'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/p_sub judul event recruitment saat ini.,,,'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/hr_Lihat Detail_MuiDivider-root jss147'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Lihat Detail_MuiBox-root jss190 jss148'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Lihat Detail_MuiBox-root jss190 jss148'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Jalur Khusus_MuiButtonBase-root MuiF_97138f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/button_Jalur Khusus_MuiButtonBase-root MuiF_97138f'))

WebUI.verifyElementVisible(findTestObject('Web Dev/Page_E-Recruitment BJBS/div_Lihat Detail_MuiPaper-root jss105 MuiPa_1548a6'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Dev/Page_E-Recruitment BJBS/div_Copyright 2022. BJB Syariah'))

