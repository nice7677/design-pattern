package kr.springboot.factory.Anonymous;

import kr.springboot.factory.framework.Factory;
import kr.springboot.factory.framework.Product;
import kr.springboot.factory.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {

        Factory factory = new IDCardFactory();
        Product card1 = factory.create("AWS");
        Product card2 = factory.create("GCP");
        Product card3 = factory.create("AZURE");
        card1.use();
        card2.use();
        card3.use();

    }

}
