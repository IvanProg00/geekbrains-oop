package geekbrains.lessons.lesson2.task2;

public class Human {
    private Transport currentTransport;

    public void drive(Transport transport) {
        transport.run();
        currentTransport = transport;
    }

    public void stop() {
        if (currentTransport != null) {
            currentTransport.stop();
            currentTransport = null;
        } else {
            System.out.println("Not going");
        }
    }
}
