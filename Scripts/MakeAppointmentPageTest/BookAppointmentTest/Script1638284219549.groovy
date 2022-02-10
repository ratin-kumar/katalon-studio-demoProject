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

'Calling login method.'
WebUI.callTestCase(findTestCase('CommonMethod/Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Selecting option from dropdown.'
WebUI.selectOptionByValue(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_selectfacility'), 
    'Seoul CURA Healthcare Center', true)

'Clicking on checkbox.'
WebUI.check(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_input_Apply for hospital readmission'))

'Clicking on radio button.'
WebUI.check(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_input_Medicaid_programs'))

'Selecting date.'
WebUI.click(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_VisitDate'))

'Clicking on required date.'
WebUI.click(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_td_3'))

'Giving input to the comment box.'
WebUI.setText(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_textarea_Comment'), 
    'Hospital admission is required ASAP.')

'Adding delay for 5 seconds.'
WebUI.delay(5)

'Clicking on book appointment button.'
WebUI.click(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_button_Book Appointment'))

'Verifying appointment confirmation text. deleberately faild. pease'
WebUI.verifyElementText(findTestObject('OR_AppointmentConfirmationPage/Page_CURA Healthcare Service/ApptConf_ConfirmationMessage'), 
    appointmentConfirmationText)

