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
        open("/automation-practice-form");
        $("[id=firstName]").setValue(firstName);
        $("[id=lastName]").setValue(lastName);
        $("[id=userEmail]").setValue(userEmail);
        $("[id=genterWrapper]").$(byText(gender)).click();
        $("[id=userNumber]").setValue(userNumber);
        $("[id=dateOfBirthInput]").click();
        $("[class=react-datepicker__year-select]").$(byText(year)).click();
        $("[class=react-datepicker__month-select]").$(byText(month)).click();
        $("[class=react-datepicker__month]").$(byText(day)).click();
        $("[id=subjectsInput]").setValue(subjects).pressEnter();
        $("[id=hobbiesWrapper]").$(byText(hobbies)).click();
        $("[id=uploadPicture]").uploadFromClasspath("picture.jpg");
        $("[id=currentAddress]").setValue(currentAddress);
        $("[id=react-select-3-input]").setValue(state).pressEnter();
        $("[id=react-select-4-input]").setValue(city).pressEnter();

        $("#submit").click();


        $(".modal-content").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(firstName + " " + lastName));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text(userEmail));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text(gender));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text(userNumber));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text(day + " " +month+","+ year));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text(subjects));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text(hobbies));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("picture.jpg"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text(currentAddress));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text(state + " " +city));




    }
}
