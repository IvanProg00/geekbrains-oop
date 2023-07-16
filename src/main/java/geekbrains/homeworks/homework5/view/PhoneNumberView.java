package geekbrains.homeworks.homework5.view;

import geekbrains.homeworks.homework5.model.Format;
import geekbrains.homeworks.homework5.model.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberView {
    public List<PhoneNumber> serialize(List<Object> phoneNumbers, Format format) {
        List<PhoneNumber> result = new ArrayList<>();

        for (Object phone : phoneNumbers) {
            if (format == Format.OBJECT && phone instanceof PhoneNumber) {
                result.add((PhoneNumber) phone);
            } else if (format == Format.TEXT && phone instanceof String) {
                String[] p = ((String) phone).split("[ :]+");
                String name = p.length >= 1 ? p[0] : "";
                String surname = p.length >= 2 ? p[1] : "";
                String number = p.length >= 3 ? p[2] : "";

                result.add(new PhoneNumber(name, surname, number));
            }
        }

        return result;
    }

    public void print(List<PhoneNumber> phoneNumbers, Format format) {
        switch (format) {
            case TEXT -> {
                for (PhoneNumber phone : phoneNumbers) {
                    System.out.println(phone.getName() + " " + phone.getSurname() + ": " + phone.getPhone());
                }
            }
            case OBJECT -> {
                for (PhoneNumber phoneNumber : phoneNumbers) {
                    System.out.println(phoneNumber);
                }
            }
            default -> System.out.println("ERROR: format not found");
        }
    }
}
