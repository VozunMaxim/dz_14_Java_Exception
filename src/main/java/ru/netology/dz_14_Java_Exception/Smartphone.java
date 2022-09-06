package ru.netology.dz_14_Java_Exception;

public class Smartphone extends Product {
    protected String producer;

    public Smartphone(int id, int price, String name, String producer) {
        super(id, price, name);
        this.producer = producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }
}
