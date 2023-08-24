import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyKeywords {
	
	@Keyword(keywordObject='hello')
	def hello() {
		println("Hello World");
	}
	
	
	@Keyword
	def LoginCred() {
		
		WebUI.setText(findTestObject('Object Repository/Linkedin Login/Page_LinkedIn Log In or Sign Up/input_Email or phone_session_key'),'g.rajashekarreddy123@gmail.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Linkedin Login/Page_LinkedIn Log In or Sign Up/input_Password_session_password'), 'xq+1BQ3ufIr+9K4Kwg1Syw==')
		WebUI.click(findTestObject('Object Repository/Linkedin Login/Page_LinkedIn Log In or Sign Up/button_Sign in'))
	}
	
	
	@Keyword(keywordObject='hello')
	def HelloUser(String user) {
		println("Hello "+user)
	}
}
