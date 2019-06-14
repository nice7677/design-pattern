package kr.springboot.singleton;

public class Main {

    public static void main(String[] args) {

        System.out.println("Start.");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Same object");
        } else {
            System.out.println("Another object");
        }

        System.out.println("finish.");

    }

}
