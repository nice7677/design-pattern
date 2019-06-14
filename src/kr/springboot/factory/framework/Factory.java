package kr.springboot.factory.framework;

public abstract class Factory {

    public final Product create(String owner) {
        Product product = createProject(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProject(String owner);

    protected abstract void registerProduct(Product product);

}
