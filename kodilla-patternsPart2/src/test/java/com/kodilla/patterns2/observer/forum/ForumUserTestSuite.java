package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUbdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi Everyone! Could you help me with for loop");
        javaHelpForum.addPost("Better try to use while loop in this case");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better");
        javaToolsForum.addPost("When I try to log in i got 'bad credencials' message.");
        //Then
        assertEquals(3, johnSmith.getUpdatecount());
        assertEquals(2, ivoneEscobar.getUpdatecount());
        assertEquals(5, jessiePinkman.getUpdatecount());
    }
}
