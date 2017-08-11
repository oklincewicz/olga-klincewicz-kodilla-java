package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    //gdy użytkownik nie ma wypożyczonych żadnych książek - dla metody BookLibrary - listBooksInHandsOf(LibraryUser libraryUser)
    @Test
    public void zeroBookInHandOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser user = new LibraryUser("Ala", "Nowak", "90090900090");
        Book book = new Book("Ania z Zielonego Wzgórza", "Lucy Montgomery", 1996);

        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(new ArrayList<>());
        when(libraryDatabaseMock.listBooksWithCondition("Ania z ")).thenReturn(new ArrayList<>());
        when(libraryDatabaseMock.rentABook(user, book)).thenReturn(false);
        when(libraryDatabaseMock.returnBooks(user)).thenReturn(0);

        //When
        bookLibrary.listBooksInHandsOf(user);
        List<Book> list = libraryDatabaseMock.listBooksInHandsOf(user);

        //Then
        assertEquals(0, list.size());
    }


    //gdy ma wypożyczoną jedną książkę - dla metody BookLibrary - listBooksInHandsOf(LibraryUser libraryUser)
    @Test
    public void oneBookInHandOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser user = new LibraryUser("Ala", "Nowak", "90090900090");
        Book book = new Book("Ania z Zielonego Wzgórza", "Lucy Montgomery", 1996);
        ArrayList<Book> booksListInUserHands = new ArrayList<>();
        booksListInUserHands.add(book);

        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(booksListInUserHands);
        when(libraryDatabaseMock.listBooksWithCondition("Ania z ")).thenReturn(new ArrayList<>());
        when(libraryDatabaseMock.rentABook(user, book)).thenReturn(true);
        when(libraryDatabaseMock.returnBooks(user)).thenReturn(0);

        //When
        bookLibrary.listBooksInHandsOf(user);
        List<Book> list = libraryDatabaseMock.listBooksInHandsOf(user);

        //Then
        assertEquals(1, list.size());
    }

    //gdy ma wypożyczone 5 książek - dla metody BookLibrary - listBooksInHandsOf(LibraryUser libraryUser)
    @Test
    public void fiveBooksInHandOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("Ala", "Nowak", "90090900090");
        Book book1 = new Book("Ania z Zielonego Wzgórza", "Lucy Montgomery", 1996);
        Book book2 = new Book("Ania z Avonlea", "Lucy Montgomery", 1997);
        Book book3 = new Book("Ania na Uniwersytecie", "Lucy Montgomery", 1998);
        Book book4 = new Book("Ania z Szumiących Topoli", "Lucy Montgomery", 1999);
        Book book5 = new Book("Wymarzony dom Ani", "Lucy Montgomery", 2000);

        ArrayList<Book> booksListInUserHands = new ArrayList<>();
        booksListInUserHands.add(book1);
        booksListInUserHands.add(book2);
        booksListInUserHands.add(book3);
        booksListInUserHands.add(book4);
        booksListInUserHands.add(book5);


        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(booksListInUserHands);
        when(libraryDatabaseMock.listBooksWithCondition("Ania z ")).thenReturn(new ArrayList<>());
        when(libraryDatabaseMock.rentABook(user, book1)).thenReturn(true);
        when(libraryDatabaseMock.rentABook(user, book2)).thenReturn(true);
        when(libraryDatabaseMock.rentABook(user, book3)).thenReturn(true);
        when(libraryDatabaseMock.rentABook(user, book4)).thenReturn(true);
        when(libraryDatabaseMock.rentABook(user, book5)).thenReturn(true);
        when(libraryDatabaseMock.returnBooks(user)).thenReturn(0);

        //When
        bookLibrary.listBooksInHandsOf(user);
        List<Book> list = libraryDatabaseMock.listBooksInHandsOf(user);

        //Then
        assertEquals(5, list.size());
    }

}