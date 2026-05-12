package tests;

import org.junit.jupiter.api.Test;
import testData.TestData;

public class ApfTests extends TestBase {
    TestData testData = new TestData();
    @Test
    void apfTestAllFields() {
        apfPage.openPage();
        apfPage.
                typeFirstName(testData.firstName).
                typeLastName(testData.lastName).
                typeUserEmail(testData.userEmail).
                typeUserGender(testData.gender).
                typeUserNumber(testData.userNumber).
                typeDateOfBirth(testData.year, testData.month, testData.day).
                typeSubjects(testData.subjects).
                typeUserHobbies(testData.hobbies).
                uploadPicture("picture.jpg").
                typeAddress(testData.currentAddress).
                typeState(testData.state).
                typeCity(testData.city).

                submitForm().

                checkTitleOutput("Thanks for submitting the form").
                checkFieldsOutput("Student Name", testData.fullUserName).
                checkFieldsOutput("Student Email",testData.userEmail).
                checkFieldsOutput("Gender", testData.gender).
                checkFieldsOutput("Mobile", testData.userNumber).
                checkFieldsOutput("Date of Birth",testData.fullUserDate).
                checkFieldsOutput("Subjects", testData.subjects).
                checkFieldsOutput("Hobbies", testData.hobbies).
                checkFieldsOutput("Picture","picture.jpg").
                checkFieldsOutput("Address", testData.currentAddress).
                checkFieldsOutput("State and City",testData.stateCity);

    }
}
