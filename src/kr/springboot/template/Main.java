package kr.springboot.template;

public class Main {

    public static void main(String[] args) {

        AbstractDisplay abstractDisplay = new CharDisplay('H');
        AbstractDisplay abstractDisplay2 = new StringDisplay("Hello, World");
        AbstractDisplay abstractDisplay3 = new StringDisplay("안녕");
        abstractDisplay.display();
        abstractDisplay2.display();
        abstractDisplay3.display();

    }

}
