package com.learning.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //given
        Library library = new Library("Library 1");

        library.getBooks().add(new Book("A Tale of Two Cities", "Charles Dickens", LocalDate.of(1859, 1, 1)));
        library.getBooks().add(new Book("The Little Prince", "Antoine de Saint-Exupéry", LocalDate.of(1943, 1, 1)));
        library.getBooks().add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", LocalDate.of(1997, 1, 1)));
        library.getBooks().add(new Book("Dream of the Red Chamber", "Cao Xueqin", LocalDate.of(1791, 1, 1)));
        library.getBooks().add(new Book("The Da Vinci Code", "Dan Brown", LocalDate.of(2003, 1, 1)));
        library.getBooks().add(new Book("The Lion, the Witch, and the Wardrobe", "C.S. Lewis", LocalDate.of(1950, 1, 1)));
        library.getBooks().add(new Book("She: A History of Adventure", "H. Rider Haggard", LocalDate.of(1886, 1, 1)));

        //when
        Library shallowCloned = null;
        try {
            shallowCloned = library.shallowCopy();
            shallowCloned.setName("Shallow Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloned = null;
        try {
            deepCloned = library.deepCopy();
            deepCloned.setName("Deep Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //then
        System.out.println(library.getBooks());
        System.out.println(shallowCloned.getBooks());
        System.out.println(deepCloned.getBooks());
        Assert.assertEquals(7, library.getBooks().size());
        Assert.assertEquals(7, deepCloned.getBooks().size());

        //Assert.assertEquals(shallowCloned.getBooks(), library.getBooks());


    }
}
