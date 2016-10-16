package ru.akornilov;


import java.util.Arrays;

public class Book {

    private String name;

    private Author[] autors;

    private double price;

    private int qty = 0;

    public Book(String name, Author[] autors, double price) {
        this.name = name;
        this.autors = autors;
        this.price = price;
    }

    public Book(String name, Author[] autors, double price, int qty) {
        this.name = name;
        this.autors = autors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAutors() {
        return autors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name=" + name +
                ", autors=" + Arrays.toString(autors) +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }

    public String getAutorNames(){
        StringBuilder autorsNames = new StringBuilder();
        for (Author autor: autors) {
            autorsNames.append(autor.getName());
            autorsNames.append(",");
        }
        autorsNames.deleteCharAt(autorsNames.length()-1);
        return String.valueOf(autorsNames);
    }

}
