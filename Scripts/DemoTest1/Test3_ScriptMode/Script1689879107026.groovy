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

WebUI.navigateToUrl('https://www.linkedin.com/')

WebUI.setText(findTestObject('Object Repository/Linkedin Login/Page_LinkedIn Log In or Sign Up/input_Email or phone_session_key'),'g.rajashekarreddy123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Linkedin Login/Page_LinkedIn Log In or Sign Up/input_Password_session_password'), 'xq+1BQ3ufIr+9K4Kwg1Syw==')

WebUI.click(findTestObject('Object Repository/Linkedin Login/Page_LinkedIn Log In or Sign Up/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Linkedin Login/Page_(18) Feed  LinkedIn/span_Me'))

WebUI.click(findTestObject('Object Repository/Linkedin Login/Page_(18) Feed  LinkedIn/a_Sign Out'))

WebUI.closeBrowser()