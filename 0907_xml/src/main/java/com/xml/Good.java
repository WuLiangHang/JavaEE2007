package com.xml;

public class Good {
    private String id;
    private String name;
    private String firm;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Good() {
    }

    @Override
    public String toString() {
        return "Good{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", firm='" + firm + '\'' +
                ", price=" + price +
                '}';
    }

    public Good(String id, String name, String firm, double price) {
        this.id = id;
        this.name = name;
        this.firm = firm;
        this.price = price;
    }
}
