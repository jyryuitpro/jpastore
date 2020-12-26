package jpabook.jpastore.service;

import jpabook.jpastore.domain.item.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
public class ItemUpdateTest {

    @Autowired
    EntityManager em;

    @Test
    void updateTest() {
        Book book = em.find(Book.class, 1L);

        book.setName("asdfasdf");
    }
}
