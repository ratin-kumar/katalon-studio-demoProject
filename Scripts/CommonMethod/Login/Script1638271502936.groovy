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

'Clicking on the menu button.'
WebUI.click(findTestObject('OR_IndexPage/Page_CURA Healthcare Service/IndexPage_MenuButton'))

'Clicking on the Login link.'
WebUI.click(findTestObject('OR_IndexPage/Page_CURA Healthcare Service/IndexPage_LoginLink'))

'Entering UserName'
WebUI.setText(findTestObject('OR_LoginPage/Page_CURA Healthcare Service/LoginPage_input_Username_username'), findTestData(
        'Test Data').getValue(1, 1))

'Entering password'
WebUI.setText(findTestObject('OR_LoginPage/Page_CURA Healthcare Service/LoginPage_input_Password_password'), findTestData(
        'Test Data').getValue(2, 1))

'Clicking on login button.'
WebUI.click(findTestObject('OR_LoginPage/Page_CURA Healthcare Service/LoginPage_button_Login'))

