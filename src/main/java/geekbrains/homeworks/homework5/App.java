package geekbrains.homeworks.homework5;

import geekbrains.homeworks.homework5.controller.Controller;
import geekbrains.homeworks.homework5.model.Format;
import geekbrains.homeworks.homework5.model.PhoneNumber;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.importData(List.of(
                new PhoneNumber("Name1", "Surname1", "+84948934"),
                new PhoneNumber("Name2", "Surname2", "+11111111"),
                new PhoneNumber("Name3", "Surname3", "+77434894")
        ), Format.OBJECT);

        controller.importData(List.of(
                "Name4 Surname4: +22222",
                "Name5 Surname5: +3344894",
                "Name6 Surname6: +9948941"
        ), Format.TEXT);

        controller.export(Format.OBJECT);
        controller.export(Format.TEXT);
    }
}
