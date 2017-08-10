package com.kodilla.testing.forum.statistic;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
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

}
