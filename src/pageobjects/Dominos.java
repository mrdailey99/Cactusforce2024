package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dominos"                                
     , summary=""
     , relativeUrl=""
     , connection="Dominos"
     )             
public class Dominos {

	@TextType()
	@FindBy(xpath = "//div[@id='carryout-special-modal']/div/div/div/div[1]/div")
	public WebElement dealPopup;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('div.css-mpzh4u > div > div.css-ge015c > div')")
	public WebElement deal;
	@LinkType()
	@FindBy(linkText = "DELIVERY")
	public WebElement dELIVERY;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='Type']")
	public WebElement addressType;
	@TextType()
	@FindBy(xpath = "//input[@id='LocationName']")
	public WebElement businessName;
	@TextType()
	@FindBy(xpath = "//input[@id='Street']")
	public WebElement streetAddress;
	@TextType()
	@FindBy(xpath = "//input[@id='UnitNumber']")
	public WebElement suiteApt;
	@TextType()
	@FindBy(xpath = "//input[@id='PostalCode']")
	public WebElement zIPCode;
	@TextType()
	@FindBy(xpath = "//input[@id='City']")
	public WebElement city;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='Region']")
	public WebElement state;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='*City']/parent::div/parent::div/following-sibling::div//button")
	public WebElement continueForDelivery;
	@LinkType()
	@FindBy(xpath = "//div[@id='entree-BuildYourOwn']/a")
	public WebElement buildYourOwnPizzaWatchThePizzaOfYourWildestDreamsComeToLife;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Pepperoni']/input")
	public WebElement checkPepperoni;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('div.single-page-pizza-builder__add-to-order-container > button')")
	public WebElement addToOrder;
	@ButtonType()
	@FindBy(css = "button.btn.btn--no-thanks.js-stepUpsellClose")
	public WebElement nOTHANKS;
	@LinkType()
	@FindBy(xpath = "//div[@id='js-myOrderPage']/a")
	public WebElement cHECKOUT;
	@ButtonType()
	@FindBy(css = "button.waterfall-upsell__no-thanks.btn.btn--outline")
	public WebElement goToCheckout;
	@LinkType()
	@FindBy(css = "a.btn--block.btn.btn--large.btn--continue-checkout.submitButton.qa-OrCheck.js-continueCheckout.c-order-continueCheckout")
	public WebElement continueCheckout;
	@TextType()
	@FindBy(xpath = "//input[@id='First_Name']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@id='Last_Name']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//input[@id='Email']")
	public WebElement emailAddress;
	@TextType()
	@FindBy(xpath = "//input[@id='Callback_Phone']")
	public WebElement birthday;
	@TextType()
	@FindBy(xpath = "//input[@id='Callback_Phone']")
	public WebElement phoneNumber;
	@BooleanType()
	@FindBy(xpath = "//input[@id='EmailOptIn']")
	public WebElement yesIWouldLikeToReceiveEMailOffersFromDominoSPizza;
	@BooleanType()
	@FindBy(xpath = "//input[@id='Cash']")
	public WebElement payAtStore;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('div.submit-wrap > button')")
	public WebElement placeYourOrder;
	@LinkType()
	@FindBy(xpath = "//a[contains(normalize-space(.),'$9.99 Large 1-Topping Pizza')]")
	public WebElement _99_Deal;
	@TextType()
	@FindBy(xpath = "//div[2]/div[2]/div/div/div")
	public WebElement delivery;
	@TextType()
	@FindBy(xpath = "//input[@id='w2-address']")
	public WebElement streetAddress1;
			
}
