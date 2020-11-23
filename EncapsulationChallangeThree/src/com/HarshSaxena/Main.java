package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50, false);
        System.out.println("The initial print page count is " + printer.getPagesPrinted());

        int pagesPrinted = printer.pagesPrinted(4);
        System.out.println("The print count given is " + pagesPrinted + " new print count is "
        + printer.getPagesPrinted());

        pagesPrinted = printer.pagesPrinted(2);
        System.out.println("The print count given is " + pagesPrinted + " new print count is "
                + printer.getPagesPrinted());
    }
}
