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

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Estimer'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/a_Trouver un conseiller'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Trouvez votre conseiller immobil_595286/input_Leaflet_agent-name'), 
    'JOHNS')

WebUI.click(findTestObject('Object Repository/Page_iad - Trouvez votre conseiller immobil_595286/div_Josiane JOHNSTONE'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Trouvez votre conseiller immobil_595286/input_Leaflet_agent-name'), 
    'JOHNS')

WebUI.click(findTestObject('Object Repository/Page_iad - Trouvez votre conseiller immobil_595286/a_Voir le mini-site'))

WebUI.click(findTestObject('Object Repository/Page_iad - Mandataire immobilier iad NEUILL_b71669/img_Surface dcroissant_lazy'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/span_Afficher le numro'))

WebUI.click(findTestObject('Object Repository/Page_iad - Maisonvilla de 80 m - 3 chambres - MRU/span_Annuler'))

WebUI.closeBrowser()

