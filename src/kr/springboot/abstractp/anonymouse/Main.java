package kr.springboot.abstractp.anonymouse;

import kr.springboot.abstractp.factory.Factory;
import kr.springboot.abstractp.factory.Link;
import kr.springboot.abstractp.factory.Page;
import kr.springboot.abstractp.factory.Tray;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java Main class.name.of.ConcreteFactory");
            System.out.println("example 1 : java Main listfactory.ListFactory");
            System.out.println("example 2 : java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link stupid1 = factory.createLink("바보", "http://바보");
        Link stupid2 = factory.createLink("바보2", "http://바보2");

        Tray trayStupid = factory.createTray("바보");
        trayStupid.add(stupid1);
        trayStupid.add(stupid2);

        Page page = factory.createPage("StupidPage", "StupidDotCom");
        page.add(trayStupid);
        page.output();

    }

}
