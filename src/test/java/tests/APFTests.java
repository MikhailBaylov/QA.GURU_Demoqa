package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class APFTests extends TestBase {

    @Test
    void APFTestAllFields() {
        open("/automation-practice-form");
        $("[id=firstName]").setValue("Mikhail");
        $("[id=lastName]").setValue("Baylov");
        $("[id=userEmail]").setValue("mikhailbaylov@qa.guru");
        $("[id=output] [id=name]")
        $("[id=genterWrapper] [id=gender-radio-1"] ).click();

    }
}
