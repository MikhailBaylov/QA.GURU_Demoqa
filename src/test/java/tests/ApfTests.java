package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApfTests extends TestBase {

    @Test
    void apfTestAllFields() {
        open("/automation-practice-form");
        $("[id=firstName]").setValue("Mikhail");
        $("[id=lastName]").setValue("Baylov");
        $("[id=userEmail]").setValue("mikhailbaylov@qa.guru");
        $("[id=gender-radio-1]").click();
        $("[id=userNumber]").setValue("70000000000");
        $("[id=dateOfBirthInput]").click();
        $("[class=react-datepicker__year-select]").$(byText("1986")).click();
        $("[class=react-datepicker__month-select]").$(byText("December")).click();
        $("[class=react-datepicker__month]").$(byText("16")).click();
        $("[id=subjectsInput]").setValue("English").pressEnter();
        $("[id=hobbies-checkbox-3]").click();
        $("[id=uploadPicture]").uploadFromClasspath("picture.jpg");
        $("[id=currentAddress]").setValue("bum");
        $("[id=react-select-3-input]").setValue("Rajasthan").pressEnter();
        $("[id=react-select-4-input]").setValue("Jaipur").pressEnter();

        $("#submit").click();


        $(".modal-content").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Mikhail Baylov"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("mikhailbaylov@qa.guru"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("7000000000"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("16 December,1986"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("English"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Music"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("picture.jpg"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("bum"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("Rajasthan Jaipur"));




    }
}
