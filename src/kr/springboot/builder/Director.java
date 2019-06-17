package kr.springboot.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greating");
        builder.makeString("Morning, Night");
        builder.makeItems(new String[] {
                "Good morning",
                "Bye Bye"
        });
        builder.makeString("Night");
        builder.makeItems(new String[] {
                "Hi",
                "Good night",
                "Bye"
        });
        builder.close();
    }
}
