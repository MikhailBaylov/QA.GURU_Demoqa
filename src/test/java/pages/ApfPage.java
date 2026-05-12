package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarPicker;
import pages.components.ResultTableChecker;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApfPage {
    CalendarPicker calendarPicker = new CalendarPicker();
    // Elements
    private final SelenideElement firstNameInput = $("[id=firstName]");
    private final SelenideElement lastNameInput = $("[id=lastName]");
    private final SelenideElement userEmailInput = $("[id=userEmail]");
    private final SelenideElement genderInput = $("[id=genterWrapper]");
    private final SelenideElement userNumberInput = $("[id=userNumber]");
    private final SelenideElement dateOfBirthInput = $("[id=dateOfBirthInput]");
    private final SelenideElement subjectsInput = $("[id=subjectsInput]");
    private final SelenideElement hobbiesInput = $("[id=hobbiesWrapper]");
    private final SelenideElement pictureInput = $("[id=uploadPicture]");
    private final SelenideElement addressInput = $("[id=currentAddress]");
    private final SelenideElement stateInput = $("[id=react-select-3-input]");
    private final SelenideElement cityInput = $("[id=react-select-4-input]");

    private final SelenideElement submitButton = $("[id=submit]");

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
        calendarPicker.setFullDate(y,m,d);
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

    public ResultTableChecker submitForm() {
        submitButton.click();
        return new ResultTableChecker();
    }

}
