package com.bridgelabz;

public class Stock {
    private String stockName;
    private int sharePrice;
    private int shareNumber;

    Stock(String stockName, int sharePrice, int shareNumber) {
        this.stockName =stockName;
        this.sharePrice = sharePrice;
        this.shareNumber = shareNumber;
    }

    public Stock(){

    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getShareNumber() {
        return shareNumber;

    }

    public void setShareNumber(int shareNumber) {
        this.shareNumber = shareNumber;
    }

    /*@Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", stockPrice=" + stockPrice +
                ", stockNumber=" + stockNumber +
                '}';
    }*/

    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.setStockName("Birla");
        stock.setShareNumber(25);
        stock.setSharePrice(500);
        System.out.println(stock.getStockName());
        System.out.println(stock.getShareNumber());
        System.out.println(stock.getSharePrice());


    }
}
