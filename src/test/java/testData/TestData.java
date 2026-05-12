package testData;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();
    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String fullUserName = firstName + " " + lastName;
    public String userEmail = faker.internet().emailAddress();
    public String userNumber = faker.phoneNumber().subscriberNumber(10);
    public String currentAddress = faker.address().fullAddress();
    public String gender = faker.options().option("Male", "Female", "Other");
    public String year = String.format(String.valueOf(faker.number().numberBetween(1900,2100)));
    public String month = faker.options().option("January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December");
    public String day = String.format(String.valueOf(faker.number().numberBetween(1,28)));
    public String fullUserDate = day + " " + month + "," + year;
    public String hobbies = faker.options().option("Sports", "Reading", "Music");
    public String subjects = faker.options().option("English", "Chemistry", "Computer Science", "Commerce",
            "Economics", "Social Studies");
    public String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    public String city = chooseCityofState();
    public String stateCity = state + " " + city;


    public String chooseCityofState() {
        String city = selectCity(state);
        return city;
    }

    public String selectCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> null;
        };
    }
}
