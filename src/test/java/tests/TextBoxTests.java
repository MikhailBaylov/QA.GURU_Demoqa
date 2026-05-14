package tests;

import org.junit.jupiter.api.Test;
import testData.TestData;

public class TextBoxTests extends TestBase {
    TestData testData = new TestData();
    @Test
    void successfulFileFormTestBox() {
        textBoxPage.openPage();
        textBoxPage.
                typeUserName(testData.fullUserName).
                typeUserEmail(testData.userEmail).
                typeUserCurrentAddress(testData.currentAddress).
                typeUserPermanentAddress(testData.currentAddress).
                submitForm().
                checkField("name", testData.fullUserName).
                checkField("email", testData.userEmail).
                checkField("currentAddress", testData.currentAddress).
                checkField("permanentAddress", testData.currentAddress);
    }
}
