package kr.springboot.prototype.framework;

import java.util.HashMap;

public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product product = (Product) showcase.get(protoname);
        return product.createClone();
    }

}
