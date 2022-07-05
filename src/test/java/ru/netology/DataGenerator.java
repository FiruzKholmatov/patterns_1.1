package ru.netology;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {

    public static UserData generateUser() {

        String city = generateCity();
        String name = generateName();
        String phone = generatePhone();

        return new UserData(city, name, phone);
    }

    public static String generateDate(int changeDay) {
        return LocalDate.now().plusDays(changeDay).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.address().city();
    }

    public static String generateName() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.name().lastName() + " " + faker.name().firstName();
    }

    public static String generatePhone() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.phoneNumber().phoneNumber();
    }


}
