package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> TheUsersList = new ArrayList<>();

    public Forum() {
        TheUsersList.add(new ForumUser(1,"Stephenie Meyer", 'K', 1973, 12, 24, 839));
        TheUsersList.add(new ForumUser(2,"Dan Brown", 'M', 1964, 6, 22, 448));
        TheUsersList.add(new ForumUser(3,"James Patterson", 'M',1947, 3, 22, 0));
        TheUsersList.add(new ForumUser(4,"Heath Ledger", 'M', 1979, 4, 4, 97));
        TheUsersList.add(new ForumUser(5,"Jaden Smith", 'M', 1998, 7, 8, 546));
        TheUsersList.add(new ForumUser(6,"Eva Green", 'K', 1980, 7, 6, 59));
        TheUsersList.add(new ForumUser(7,"Cate Blanchett", 'K', 1969, 5, 14, 226));
        TheUsersList.add(new ForumUser(8,"Matthew McConaughey", 'M', 1969, 11, 4, 3));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(TheUsersList);
    }
}



