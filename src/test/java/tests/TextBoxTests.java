package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static testData.TestData.*;

public class TextBoxTests extends TestBase {

    @Test
    void successfulFileFormTestBox() {
        textBoxPage.openPage();
        textBoxPage.
                typeUserName(fullUserName).
                typeUserEmail(userEmail).
                typeUserCurrentAddress(currentAddress).
                typeUserPermanentAddress(currentAddress).
                submitForm().
                checkField("name", fullUserName).
                checkField("email", userEmail).
                checkField("currentAddress", currentAddress).
                checkField("permanentAddress", currentAddress);
    }
}
