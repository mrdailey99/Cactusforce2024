package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="PizzaHut"                                
     , summary=""
     , relativeUrl=""
     , connection="PizzaHut"
     )             
public class PizzaHut {

	@LinkType()
	@FindBy(xpath = "//a[contains(normalize-space(.),'$9.99 Large 1-Topping Pizza')]")
	public WebElement _99_Deal;
	@TextType()
	@FindBy(xpath = "//div[2]/div[2]/div/div/div")
	public WebElement delivery;
	@TextType()
	@FindBy(xpath = "//input[@id='w2-address']")
	public WebElement streetAddress;
	@TextType()
	@FindBy(xpath = "//input[@id='w2-address2']")
	public WebElement aptSuite;
	@TextType()
	@FindBy(xpath = "//input[@id='w2-city']")
	public WebElement city;
	@TextType()
	@FindBy(xpath = "//input[@id='w2-state']")
	public WebElement state;
	@TextType()
	@FindBy(xpath = "//input[@id='w2-zip']")
	public WebElement zIP;
	@ButtonType()
	@FindBy(xpath = "//button[contains(normalize-space(.),'Continue')]")
	public WebElement continue_;
	@TextType()
	@FindBy(xpath = "//p[normalize-space(.)='Start here']")
	public WebElement StartHere;
	@ButtonType()
	@FindBy(xpath = "//button[contains(normalize-space(.),'Large 1-Topping Pizza $11.99')]")
	public WebElement large1ToppingPizza1199GetStarted;
	@TextType()
	@FindBy(xpath = "//p[normalize-space(.)='Hand Tossed Pizza']")
	public WebElement HandTossedCrust;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Pepperoni']")
	public WebElement pepperoni;
	@ButtonType()
	@FindBy(xpath = "//button[contains(normalize-space(.),'add to order')]")
	public WebElement addToOrder;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Go to cart']")
	public WebElement goToCart;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='GO TO CHECKOUT']")
	public WebElement goToCheckout;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='BACK TO CART']")
	public WebElement backToCart;
	@TextType()
	@FindBy(xpath = "//header//span//g/g")
	public WebElement closeMenu;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Toppings']")
	public WebElement expandToppings;
	@LinkType()
	@FindBy(xpath = "//a[contains(normalize-space(.),'The Big New Yorker')]")
	public WebElement theBigNewYorker;
	@TextType()
	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//input[@id='phone-number']")
	public WebElement phoneNumber;
	@BooleanType()
	@FindBy(xpath = "//input[@id='promotion-consent']")
	public WebElement yesSendMePromotionalEmailsFromPizzaHut;
	@TextType()
	@FindBy(xpath = "//div[@id='cash-tab-button']")
	public WebElement cashPayment;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='PLACE ORDER']")
	public WebElement placeOrder;
			
}
