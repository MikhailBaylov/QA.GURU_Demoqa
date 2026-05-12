package tests;

import org.junit.jupiter.api.Test;
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
                checkFieldsOutput("Student Name",fullUserName).
                checkFieldsOutput("Student Email",userEmail).
                checkFieldsOutput("Gender",gender).
                checkFieldsOutput("Mobile",userNumber).
                checkFieldsOutput("Date of Birth",fullUserDate).
                checkFieldsOutput("Subjects",subjects).
                checkFieldsOutput("Hobbies",hobbies).
                checkFieldsOutput("Picture","picture.jpg").
                checkFieldsOutput("Address",currentAddress).
                checkFieldsOutput("State and City",stateCity);

    }
}
