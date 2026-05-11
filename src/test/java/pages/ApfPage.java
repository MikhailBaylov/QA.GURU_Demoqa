package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static testData.TestData.*;

public class ApfPage {
    // Elements
    private SelenideElement firstNameInput = $("[id=firstName]");
    private SelenideElement lastNameInput = $("[id=lastName]");
    private SelenideElement userEmailInput = $("[id=userEmail]");
    private SelenideElement genderInput = $("[id=genterWrapper]");
    private SelenideElement userNumberInput = $("[id=userNumber]");
    private SelenideElement dateOfBirthInput = $("[id=dateOfBirthInput]");
    private SelenideElement yearOfBirthInput = $("[class=react-datepicker__year-select]");
    private SelenideElement monthOfBirthInput = $("[class=react-datepicker__month-select]");
    private SelenideElement dayOfBirthInput = $("[class=react-datepicker__month]");
    private SelenideElement subjectsInput = $("[id=subjectsInput]");
    private SelenideElement hobbiesInput = $("[id=hobbiesWrapper]");
    private SelenideElement pictureInput = $("[id=uploadPicture]");
    private SelenideElement addressInput = $("[id=currentAddress]");
    private SelenideElement stateInput = $("[id=react-select-3-input]");
    private SelenideElement cityInput = $("[id=react-select-4-input]");

    private SelenideElement submitButton = $("[id=submit]");

    private SelenideElement titleOutput = $("[class=modal-content]");
    private SelenideElement fieldOutput = $("[class=table-responsive]");

    //Actions
    public ApfPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public ApfPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public ApfPage typeLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public ApfPage typeUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public ApfPage typeUserGender(String value) {
        genderInput.$(byText(value)).click();
        return this;
    }

    public ApfPage typeUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public ApfPage typeDateOfBirth(String y, String m, String d) {
        dateOfBirthInput.click();
        yearOfBirthInput.$(byText(y)).click();
        monthOfBirthInput.$(byText(m)).click();
        dayOfBirthInput.$(byText(d)).click();
        return this;
    }

    public ApfPage typeSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public ApfPage typeUserHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }

    public ApfPage uploadPicture(String value) {
        pictureInput.uploadFromClasspath(value);
        return this;
    }

    public ApfPage typeAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    public ApfPage typeState(String value) {
        stateInput.setValue(value).pressEnter();
        return this;
    }

    public ApfPage typeCity(String value) {
        cityInput.setValue(value).pressEnter();
        return this;
    }

    public ApfPage submitForm() {
        submitButton.click();
        return this;
    }

    public ApfPage checkTitleOutput(String value) {
        titleOutput.shouldHave(text(value));
        return this;
    }

    public ApfPage checkFieldOutput(String key, String value) {
        fieldOutput.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }

}
