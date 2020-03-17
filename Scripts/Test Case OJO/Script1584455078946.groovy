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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.iadfrance.fr/')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_PRESTIGE'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Lieu(x)'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Louer_whereToBuy'), 
    '4500')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/li_Orlans (45000) Loiret Centre-Val de Loire'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Type(s) de bien'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/li_Maison'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Maison'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Surface minmax'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/input_Min _surface_min'), 
    '100')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Pice(s)'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/i_m_demo-icon icon-piece-4'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_4 pices'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/button_Recherche'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Contactez votre conseiller_lazy'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 150 m - 4 chambre_da4ba7/span_Afficher le numro'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 150 m - 4 chambre_da4ba7/span_Annuler'))

WebUI.closeBrowser()

