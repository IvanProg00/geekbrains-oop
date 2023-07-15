package geekbrains.homeworks.homework5.service;

import geekbrains.homeworks.homework5.model.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberService implements DataService {
    private final List<PhoneNumber> phoneNumbers = new ArrayList<>();

    @Override
    public List<PhoneNumber> list() {
        return phoneNumbers;
    }

    @Override
    public void save(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers.addAll(phoneNumbers);
    }
}
