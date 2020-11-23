package com.HarshSaxena;

public class Printer {
    private int tonerlevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerlevel, boolean isDuplex) {
        if(tonerlevel > -1 && tonerlevel <=100){
            this.tonerlevel = tonerlevel;
        }else{
            this.tonerlevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > -1 && tonerAmount <=100){
            if(this.tonerlevel + tonerAmount > 100){
                this.tonerlevel = -1;
            }
            this.tonerlevel += tonerAmount;
            return this.tonerlevel;
        }else{
            return -1;
        }
    }

    public int pagesPrinted(int pages){
        int pagesToBePrinted = pages;
        if(this.isDuplex){
            pagesToBePrinted = (pages / 2) + (pages % 2);
            System.out.println("The printer is printing in duplex mode");
        }
        this.pagesPrinted += pagesToBePrinted;
        return pagesToBePrinted;
    }



    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
