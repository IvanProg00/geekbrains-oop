package geekbrains.homeworks.homework5.service;

import geekbrains.homeworks.homework5.model.PhoneNumber;

import java.util.List;

public interface DataService {
    List<PhoneNumber> list();

    void save(List<PhoneNumber> phoneNumbers);
}
