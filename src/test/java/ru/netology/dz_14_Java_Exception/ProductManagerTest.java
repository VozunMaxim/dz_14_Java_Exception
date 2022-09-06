package ru.netology.dz_14_Java_Exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ProductManagerTest {

    @Test
    public void shouldSearchBy() {
        Book book1 = new Book(110, 100, "book100", "author1");
        Book book2 = new Book(220, 200, "book200", "author2");
        Book book3 = new Book(330, 300, "book300", "author3");
        Smartphone smartphone1 = new Smartphone(440, 400, "smartphone100", "smartphone1");
        Smartphone smartphone2 = new Smartphone(550, 500, "smartphone200", "smartphone2");
        Smartphone smartphone3 = new Smartphone(660, 600, "smartphone300", "smartphone3");

        ProductManager productManager = new ProductManager(new ProductRepository());
        productManager.add(book1);
        productManager.add(book2);
        productManager.add(book3);
        productManager.add(smartphone1);
        productManager.add(smartphone2);
        productManager.add(smartphone3);

        Product[] actual = productManager.searchBy("book200");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByEmptyManager() {
        Book book1 = new Book(110, 100, "book100", "author1");
        Book book2 = new Book(220, 200, "book200", "author2");
        Book book3 = new Book(330, 300, "book300", "author3");
        Smartphone smartphone1 = new Smartphone(440, 400, "smartphone100", "smartphone1");
        Smartphone smartphone2 = new Smartphone(550, 500, "smartphone200", "smartphone2");
        Smartphone smartphone3 = new Smartphone(660, 600, "smartphone300", "smartphone3");

        ProductManager productManager = new ProductManager(new ProductRepository());

        Product[] actual = productManager.searchBy("smartphone100");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySeveralProducts() {
        Book book1 = new Book(110, 100, "book100", "author1");
        Book book2 = new Book(220, 200, "book 200", "author2");
        Book book3 = new Book(330, 300, "book 300", "author3");
        Smartphone smartphone1 = new Smartphone(440, 400, "smartphone100", "smartphone1");
        Smartphone smartphone2 = new Smartphone(550, 500, "smartphone 200", "smartphone2");
        Smartphone smartphone3 = new Smartphone(660, 600, "smartphone 300", "smartphone3");

        ProductManager productManager = new ProductManager(new ProductRepository());
        productManager.add(book1);
        productManager.add(book2);
        productManager.add(book3);
        productManager.add(smartphone1);
        productManager.add(smartphone2);
        productManager.add(smartphone3);

        Product[] actual = productManager.searchBy("smartphone ");
        Product[] expected = {smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);
    }
}