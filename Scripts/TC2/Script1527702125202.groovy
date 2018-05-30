import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_My Store/a_Women'))

WebUI.waitForElementPresent(findTestObject('Page_Women - My Store/a_Dresses'), 0)

WebUI.click(findTestObject('Page_Women - My Store/a_Dresses'))

WebUI.click(findTestObject('Page_Dresses - My Store/a_Casual Dresses'))

WebUI.click(findTestObject('Page_Casual Dresses - My Store/span'))

WebUI.click(findTestObject('Page_Casual Dresses - My Store/html_Casual Dresses - My Store'))

WebUI.click(findTestObject('Page_Casual Dresses - My Store/span_Add to cart'))

WebUI.click(findTestObject('Page_Casual Dresses - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Page_Order - My Store/html_Order - My Store  var CUS'))

WebUI.click(findTestObject('Page_Order - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Page_Login - My Store/html_Login - My Store  var CUS'))

WebUI.setText(findTestObject('Page_Login - My Store/input_email'), 'debarnab.banerjee@gmail.com')

WebUI.setText(findTestObject('Page_Login - My Store/input_passwd'), 'California0!')

WebUI.click(findTestObject('Page_Login - My Store/span_Sign in'))

WebUI.click(findTestObject('Page_Order - My Store/html_Order - My Store  var CUS_1'))

WebUI.click(findTestObject('Page_Order - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Page_Order - My Store/html_Order - My Store  var CUS_2'))

WebUI.click(findTestObject('Page_Order - My Store/div_Choose a shipping option f'))

WebUI.click(findTestObject('Page_Order - My Store/input_cgv'))

WebUI.click(findTestObject('Page_Order - My Store/span_Proceed to checkout_1'))

WebUI.click(findTestObject('Page_Order - My Store/html_Order - My Store  var CUS_3'))

WebUI.click(findTestObject('Page_Order - My Store/a_Pay by bank wire (order proc'))

WebUI.click(findTestObject('Page_My Store/html_My Store  var CUSTOMIZE_T'))

WebUI.click(findTestObject('Page_My Store/span_I confirm my order'))

WebUI.click(findTestObject('Page_Order confirmation - My Store/html_Order confirmation - My S'))

WebUI.click(findTestObject('Page_Order confirmation - My Store/html_Order confirmation - My S'))

WebUI.click(findTestObject('Page_Order confirmation - My Store/html_Order confirmation - My S'))

WebUI.closeBrowser()

