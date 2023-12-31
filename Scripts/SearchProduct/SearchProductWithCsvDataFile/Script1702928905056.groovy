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

WebUI.click(findTestObject('Object Repository/SearchValidProduct/Page_Takealot.com Online Shopping  SAs lead_9e0650/a_Login'))

WebUI.setText(findTestObject('Object Repository/SearchValidProduct/Page_Takealot.com Online Shopping  SAs lead_9e0650/input_email'), 
    'nishapathak77@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SearchValidProduct/Page_Takealot.com Online Shopping  SAs lead_9e0650/input_password'), 
    '60coEWBzUaguqMoMXWkjBQ==')

WebUI.click(findTestObject('Object Repository/SearchValidProduct/Page_Takealot.com Online Shopping  SAs lead_9e0650/button_Login'))

WebUI.setText(findTestObject('Object Repository/SearchValidProduct/Page_Takealot.com Online Shopping  SAs lead_9e0650/input_search'), 
    SearchKeyword)

WebUI.sendKeys(findTestObject('Object Repository/SearchValidProduct/Page_Takealot.com Online Shopping  SAs lead_9e0650/input_search'), 
    Keys.chord(Keys.ENTER))

