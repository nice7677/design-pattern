package kr.springboot.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {

    private String filename;
    private PrintWriter printwriter;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            printwriter = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        printwriter.println("<html><head><title>" + title + "</title></head><body>");
        printwriter.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        printwriter.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        printwriter.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            printwriter.println("<li>" + items[i] + "</li>");
        }
        printwriter.println("</ul>");
    }

    @Override
    public void close() {
        printwriter.println("</body></html>");
        printwriter.close();
    }

    public String getResult() {
        return filename;
    }
}
