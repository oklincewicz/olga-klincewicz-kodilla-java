package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Dylan Murphy", "Wolf of the mountains", 2003, "0001");
        Book book2 = new Book("Phoebe Pearson", "Slaves of dreams", 2012, "0002");
        Book book3 = new Book("Morgan Walsh", "Obliteration of heaven", 2001, "0003");
        Book book4 = new Book("Aimee Murphy", "Rejecting the night", 2015, "0004");
        Book book5 = new Book("Ryan Talley", "Gangsters and kings", 2007,  "0005");
        Book book6 = new Book("Madelynn Carson", "Unity without duty", 2007, "0006");
        Book book7 = new Book("Giancarlo Guerrero", "Enemies of eternity", 2009, "0007");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);
        MedianAdapter adapter = new MedianAdapter();
        //Then
        int medianaOfYear = adapter.publicationYearMedian(bookSet);
        //When
        System.out.println(medianaOfYear);
        assertEquals(2007, medianaOfYear);
    }
}
