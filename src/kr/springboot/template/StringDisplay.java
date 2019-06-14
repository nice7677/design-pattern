package kr.springboot.template;

public class StringDisplay extends AbstractDisplay {

    private String string;
    private Integer witdh;

    public StringDisplay(String string) {
        this.string = string;
        this.witdh = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < witdh; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
