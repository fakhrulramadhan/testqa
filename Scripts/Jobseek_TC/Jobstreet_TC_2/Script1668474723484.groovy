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

WebUI.navigateToUrl('https://www.jobstreet.co.id/')

WebUI.click(findTestObject('Object Repository/Page_Lowongan kerja di Indonesia - Cari Low_4d81ae/a_Masuk'))

WebUI.click(findTestObject('Page_Lowongan kerja di Indonesia - Cari Low_4d81ae/h1_Kandidat Masuk'))

WebUI.setText(findTestObject('Page_Lowongan kerja di Indonesia - Cari Low_4d81ae/input_Atau_login_id'), 'fakhrulramadhansusanto@gmail.com')

WebUI.setText(findTestObject('Page_Lowongan kerja di Indonesia - Cari Low_4d81ae/input_Atau_password'), ')*)()&#)$fauL14')

WebUI.click(findTestObject('Page_Lowongan kerja di Indonesia - Cari Low_4d81ae/Page_Mendaftar atau masuk untuk melamar lowongan  JobStreet.com/input_Ingat saya_remember'))

WebUI.click(findTestObject('Page_Lowongan kerja di Indonesia - Cari Low_4d81ae/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Lowongan kerja di Indonesia - Cari Low_4d81ae/div_Fakhrul'))

