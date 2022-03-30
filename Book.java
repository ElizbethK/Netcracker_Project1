package com.homework;

import java.util.Arrays;


public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, double price, Author... authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;

    }

    public Book(String name, double price, int qty, Author... authors) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }


    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty > 0){
            this.qty = qty;
        } else {
            this.qty = 0;
        }
    }

    public String getAuthorNames(){
       String names = "";
        for (int i = 0; i < authors.length; i++){
            names += authors[i].getName() + "; ";
        }
        return names;

    }

    @Override
    public String toString() {
        return "Book[name=" + name +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty + "]";
    }
}
