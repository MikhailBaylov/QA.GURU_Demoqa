package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static testData.TestData.*;

public class ApfTests extends TestBase {

    @Test
    void apfTestAllFields() {
        apfPage.openPage();
        apfPage.
                typeFirstName(firstName).
                typeLastName(lastName).
                typeUserEmail(userEmail).
                typeUserGender(gender).
                typeUserNumber(userNumber).
                typeDateOfBirth(year,month,day).
                typeSubjects(subjects).
                typeUserHobbies(hobbies).uploadPicture("picture.jpg").
                typeAddress(currentAddress).
                typeState(state).
                typeCity(city).

                submitForm().

                checkTitleOutput("Thanks for submitting the form").
                checkFieldOutput("Student Name",fullUserName).
                checkFieldOutput("Student Email",userEmail).
                checkFieldOutput("Gender",gender).
                checkFieldOutput("Mobile",userNumber).
                checkFieldOutput("Date of Birth",fullUserDate).
                checkFieldOutput("Subjects",subjects).
                checkFieldOutput("Hobbies",hobbies).
                checkFieldOutput("Picture","picture.jpg").
                checkFieldOutput("Address",currentAddress).
                checkFieldOutput("State and City",stateCity);

    }
}
