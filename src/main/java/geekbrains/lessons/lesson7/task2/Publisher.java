package geekbrains.lessons.lesson7.task2;

public interface Publisher {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, int salary);
}
