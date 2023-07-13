package geekbrains.lessons.lesson5.task1;

public class Outer {
    int outerValue;

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public void outerMethod() {
        System.out.println(outerValue);
    }

    class Inner {
        public int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(outerValue);
            System.out.println(innerValue);
            outerMethod();
        }
    }
}
