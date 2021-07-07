package com.demoqa.page_object;

import com.demoqa.browserfactory.DriverHelpers;
import com.demoqa.task_helper.TaskHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class PracticeFormPage extends DriverHelpers {

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;
    @FindBy(css = "#lastName")
    private WebElement lastName;
    @FindBy(css = "#userEmail")
    private WebElement emailField;
    @FindBy(css = "label[for='gender-radio-1']")
    private WebElement gender;
    @FindBy(id = "userNumber")
    private WebElement mobileNumber;
    @FindBy(css = "#dateOfBirthInput")
    private WebElement birthDate;
    @FindBy(css = "select[class='react-datepicker__month-select']")
    private WebElement month;
    @FindBy(css = "select[class='react-datepicker__year-select']")
    private WebElement year;
    @FindBy(xpath = "//div[@aria-label='Choose Monday, April 3rd, 2000']")
    private WebElement birthDateSelect;
    @FindBy(css = "input#subjectsInput")
    private WebElement subject;
    @FindBy(css = "label[for='hobbies-checkbox-3']")
    private WebElement hobby;
    @FindBy(css = "label[for='uploadPicture']")
    private WebElement chooseFile;
    @FindBy(css = "#currentAddress")
    private WebElement currentAddress;
    @FindBy(css = "#state")
    private WebElement state;
    @FindBy(css = "input#react-select-3-input")
    private WebElement stateSelection;
    @FindBy(css = "input#react-select-4-input")
    private WebElement city;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(css = "div#example-modal-sizes-title-lg")
    private WebElement registrationConformation;


    public PracticeFormPage() {
        PageFactory.initElements(driver, this);
    }

    public void homePage() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    public void firstLastName() {
        firstName.sendKeys("Pankaj");
        lastName.sendKeys("Prajapati");
    }

    public void emailAdderess() {
        emailField.sendKeys("xyz@gmail.com");
    }

    public void setGender() {
        if (gender.isSelected()) {
            System.out.println("gender is already selected");
        } else {
            gender.click();
        }
    }

    public void mobileBirthSubject() {
        mobileNumber.sendKeys("01234567890");
        birthDate.click();
        new Select(month).selectByVisibleText("April");
        new Select(year).selectByValue("2000");
        birthDateSelect.click();
        subject.click();
        System.out.println(subject.isEnabled());
        subject.sendKeys("Accounting");
        subject.sendKeys(Keys.ENTER);
    }

    public void hobbyImage() throws AWTException {
        if (hobby.isSelected()) {
            System.out.println("hobby is selected already");
        } else {
            hobby.click();
        }
        chooseFile.click();
        TaskHelper.customWait(5000);
        StringSelection ss1 = new StringSelection("C:\\Users\\Owner\\Desktop\\painting.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void setCurrentAddress() {
        currentAddress.sendKeys("watford, London");
    }

    public void stateAndCity() {
        TaskHelper.customWait(4000);
        TaskHelper.ScrollByJavaScriptExecutor(0, 1000);
        state.click();
        stateSelection.sendKeys("Haryana");
        stateSelection.sendKeys(Keys.ENTER,Keys.TAB);
        city.sendKeys("Karnal");
        city.sendKeys(Keys.ENTER,Keys.TAB);
    }
    public void clickSubmit(){
        submitButton.click();
    }
    public String RegConfirm(){
        String actual=registrationConformation.getText();
        return actual;

    }

}
