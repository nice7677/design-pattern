package kr.springboot.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Create Instance Successful");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
