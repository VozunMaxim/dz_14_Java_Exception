package ru.netology.dz_14_Java_Exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test // # 1
    public void shouldRemoveById() {
        Book book1 = new Book(110, 100, "book100", "author1");
        Book book2 = new Book(220, 200, "book200", "author2");
        Book book3 = new Book(330, 300, "book300", "author3");
        Smartphone smartphone1 = new Smartphone(440, 400, "smartphone100", "smartphone1");
        Smartphone smartphone2 = new Smartphone(550, 500, "smartphone200", "smartphone2");
        Smartphone smartphone3 = new Smartphone(660, 600, "smartphone300", "smartphone3");

        ProductRepository productRepository = new ProductRepository();
        productRepository.add(book1);
        productRepository.add(book2);
        productRepository.add(book3);
        productRepository.add(smartphone1);
        productRepository.add(smartphone2);
        productRepository.add(smartphone3);


        Assertions.assertThrows(RuntimeException.class, () -> {
            productRepository.removeById(990);
        });
    }

    @Test // # 2
    public void shouldRemoveByIdDeleteOneElement() {
        Book book1 = new Book(110, 100, "book100", "author1");
        Book book2 = new Book(220, 200, "book200", "author2");
        Book book3 = new Book(330, 300, "book300", "author3");
        Smartphone smartphone1 = new Smartphone(440, 400, "smartphone100", "smartphone1");
        Smartphone smartphone2 = new Smartphone(550, 500, "smartphone200", "smartphone2");
        Smartphone smartphone3 = new Smartphone(660, 600, "smartphone300", "smartphone3");

        ProductRepository productRepository = new ProductRepository();
        productRepository.add(book1);
        productRepository.add(book2);
        productRepository.add(book3);
        productRepository.add(smartphone1);
        productRepository.add(smartphone2);
        productRepository.add(smartphone3);

        Product[] actual = productRepository.removeById(330);
        Product[] expected = {
                book1,
                book2,
                smartphone1,
                smartphone2,
                smartphone3};

        Assertions.assertArrayEquals(expected, actual);
        {
        }
        ;
    }
}
