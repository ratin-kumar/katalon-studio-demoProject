import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

/**
 * This is an example of how to use Visual Testing. See tutorial at 
 * https://forum.katalon.com/t/update-with-katalon-studio-7-7-early-release-of-katalon-testops-visual-testing-image-comparison/45557.
 */
WebUI.callTestCase(findTestCase('CommonMethod/Login'), [:], FailureHandling.STOP_ON_FAILURE)

if (true) {
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

    WebUI.click(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_textarea_Comment'))

    'Giving input to the comment box.'
    WebUI.setText(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_textarea_Comment'), 
        'Hospital admission is required ASAP.')

    'Adding delay for 5 seconds.'
    WebUI.delay(5)

    WebUI.takeFullPageScreenshotAsCheckpoint('Before Booking Appointment')

    'Clicking on book appointment button.'
    WebUI.click(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make AppointmentPage_button_Book Appointment'))
}

if (true) {
    WebUI.takeFullPageScreenshotAsCheckpoint('booked appointment')

    WebUI.verifyMatch('Seoul CURA Healthcare Center', WebUI.getText(findTestObject('OR_AppointmentConfirmationPage/Page_CURA Healthcare Service/AppConf_Facility')), 
        false)

    WebUI.verifyMatch('Yes', WebUI.getText(findTestObject('OR_AppointmentConfirmationPage/Page_CURA Healthcare Service/AppConf_Apply for hospital readmission')), 
        false)

    WebUI.verifyMatch('Medicaid', WebUI.getText(findTestObject('OR_AppointmentConfirmationPage/Page_CURA Healthcare Service/AppConfHealthcare Program')), 
        false)

    WebUI.verifyMatch('03/12/2021', WebUI.getText(findTestObject('OR_MakeAppointmentPage/Page_CURA Healthcare Service/Make Appointment_Visit Date')), 
        false)

    WebUI.verifyMatch('Hospital admission is required ASAP.', WebUI.getText(findTestObject('OR_AppointmentConfirmationPage/Page_CURA Healthcare Service/AppConf_Comment')), 
        false)
}

