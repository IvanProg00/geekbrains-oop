package geekbrains.homeworks.homework5.controller;

import geekbrains.homeworks.homework5.model.Format;
import geekbrains.homeworks.homework5.model.PhoneNumber;
import geekbrains.homeworks.homework5.service.PhoneNumberService;
import geekbrains.homeworks.homework5.view.PhoneNumberView;

import java.util.List;

public class Controller {
    private final PhoneNumberService phoneNumberService = new PhoneNumberService();
    private final PhoneNumberView phoneNumberView = new PhoneNumberView();

    public void importData(List<Object> data, Format format) {
        List<PhoneNumber> phoneNumbers = phoneNumberView.serialize(data, format);
        phoneNumberService.save(phoneNumbers);
    }

    public void export(Format format) {
        List<PhoneNumber> phoneNumbers = phoneNumberService.list();

        phoneNumberView.print(phoneNumbers, format);
    }
}
