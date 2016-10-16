package ru.akornilov;

import org.junit.Test;

import static org.junit.Assert.*;


public class BookTest {

    private Book book;
    private Author author2;
    private Author author1;
    private Author[] autors;

    @Test
    public void testGetAutorNames(){
        initialization();
        String resultString = "Kornilov,Sidorov";
        assertEquals(resultString, book.getAutorNames());
    }

    @Test
    public void testToString(){
        initialization();
        String resultString = "Book[name=that the, autors=[Author[name=Kornilov, email=kdl@mail.ru, gender=M]" +
                ", Author[name=Sidorov, email=safsf@mail.ru, gender=M]], price=100.0, qty=0]";
        assertEquals(resultString, book.toString());
    }

    public void initialization(){
        author1 = new Author("Kornilov", "kdl@mail.ru", 'M');
        author2 = new Author("Sidorov", "safsf@mail.ru", 'M');
        autors = new Author[]{author1, author2};
        book = new Book("that the", autors, 100.0);
    }

}