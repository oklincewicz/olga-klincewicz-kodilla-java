package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class ForumStatistics {

    Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumerOfPostsPerUser;
    private double averageNumerOfCommentsPerUser;
    private double averageNumerOfCommentsOnPost;



    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUsers == 0) {
            averageNumerOfPostsPerUser = 0;
        } else {
            averageNumerOfPostsPerUser = (double) numberOfPosts / numberOfUsers;
        }
        //Todo policzenie średnich (double)



    }

    public void showStatistics() {

        System.out.println();
    }

    public double getAverageNumerOfPostsPerUser() {
        return averageNumerOfPostsPerUser;
    }

    public double getAverageNumerOfCommentsPerUser() {
        return averageNumerOfCommentsPerUser;
    }

    public double getAverageNumerOfCommentsOnPost() {
        return averageNumerOfCommentsOnPost;
    }
}
