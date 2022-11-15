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

WebUI.navigateToUrl('https://www.jobs.id/')

WebUI.click(findTestObject('Object Repository/Page_Info Lowongan Kerja Magang  Fresh Grad_9216eb/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Info Lowongan Kerja Magang  Fresh Grad_9216eb/input_Masuk dengan Google_email'), 
    'fakhrulramadhansusanto@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Info Lowongan Kerja Magang  Fresh Grad_9216eb/input_Email Tidak Valid_password'), 
    'qNeSS8abuXgDpSSsnhygdg==')

WebUI.click(findTestObject('Object Repository/Page_Info Lowongan Kerja Magang  Fresh Grad_9216eb/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Info Lowongan Kerja Magang  Fresh Grad_9216eb/span_29'))

WebUI.click(findTestObject('Object Repository/Page_Info Lowongan Kerja Magang  Fresh Grad_9216eb/div_Dashboard              Profil          _c6fb69'))

WebUI.click(findTestObject('Object Repository/Page_Info Lowongan Kerja Magang  Fresh Grad_9216eb/img'))

WebUI.click(findTestObject('Object Repository/Page_Info Lowongan Kerja Magang  Fresh Grad_9216eb/a_Keluar'))

