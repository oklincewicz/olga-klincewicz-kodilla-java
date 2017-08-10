package com.kodilla.testing.forum.statistic;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuit {
    //gdy liczba postów = 0
    @Test
    public void testNumberOfPostZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());


        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.getAverageNumerOfPostsPerUser();


        //Then
        assertEquals(0, result, 0.001);

    }
    //gdy liczba postów = 1000
    @Test
    public void testNumberOfPosts1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(users);
        users.add("user1");

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.getAverageNumerOfPostsPerUser();

        //Then
        assertEquals(1000, result, 0.001);
    }

    //gdy liczba komentarzy = 0
    @Test
    public void testNumberOfCommentZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double result = forumStatistics.getAverageNumerOfCommentsOnPost();

        //Then
        assertEquals(0, result, 0.001);
    }

    //gdy liczba komentarzy < liczba postów
    @Test
    public void numberOfCommentsLessThenNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(users);
        users.add("user1");

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double posts = forumStatistics.getAverageNumerOfPostsPerUser();
        double comments = forumStatistics.getAverageNumerOfCommentsPerUser();

        //Then
        assertEquals(100 < 1000, comments < posts);
    }

    //gdy liczba komentarzy > liczba postów
    @Test
    public void numberOfCommentsMoreThenNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(users);
        users.add("user1");

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double posts = forumStatistics.getAverageNumerOfPostsPerUser();
        double comments = forumStatistics.getAverageNumerOfCommentsPerUser();

        //Then
        assertEquals(1000 > 100, comments > posts);
    }

    //gdy liczba użytkowników = 0
    @Test
    public void numberOfUserZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = forumStatistics.getNumberOfUsers();

        //Then
        assertEquals(0,result);
    }

    // gdy liczba użytkowników = 100
    @Test
    public void numberOfUsers100() {
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        int n = 0;
        for(int i = 0; i <100; i++) {
            users.add("user" + n);
            n++;
        }

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = forumStatistics.getNumberOfUsers();

        //Then
        assertEquals(100, result);
    }



}
