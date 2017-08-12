package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers =  forum.getUserList().stream()
                .filter(sex -> sex.getSex() == 'M')
                .filter(age -> age.getDateOfBirth().getYear() < 1997)
                .filter(posts -> posts.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, users -> users));

        resultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

//    zainicjuje strumień Stream przy pomocy metody stream() kolekcji
//    odfiltruje tylko tych użytkowników, którzy są mężczyznami
//    odfiltruje tylko tych użytkowników, którzy mają co najmniej 20 lat
//        odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post
//        przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika
//        wyświetli otrzymaną mapę wynikową