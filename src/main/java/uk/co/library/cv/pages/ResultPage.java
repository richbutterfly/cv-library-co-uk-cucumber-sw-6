package uk.co.library.cv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.cv.utilities.Utility;


public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public String verifyTheResults() {
        return getTextFromElement(resultText);
    }

   }
