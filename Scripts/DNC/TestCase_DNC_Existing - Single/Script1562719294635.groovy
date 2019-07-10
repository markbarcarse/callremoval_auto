import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.webURL_Login)

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Page_Login/input_Username'), GlobalVariable._username)

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Login/input_Password'), GlobalVariable._password)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Login/btn_Login'))

WebUI.waitForPageLoad(5)

WebUI.setMaskedText(findTestObject('Page_Form/input_PhoneNumber'), '   0910000009')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Form/btn_DNC'))

WebUI.waitForElementPresent(findTestObject('Page_Form/label_DNC_message'), 5)

WebUI.delay(2)

_errorMsg = WebUI.getText(findTestObject('Page_Form/label_DNC_message'))

WebUI.verifyMatch(_errorMsg, GlobalVariable._DNC_error, false)

