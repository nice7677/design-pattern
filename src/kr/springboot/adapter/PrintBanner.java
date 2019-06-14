package kr.springboot.adapter;

public class PrintBanner extends Banner implements Print{

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAfter();
    }

    public PrintBanner(String string) {
        super(string);
    }
}
