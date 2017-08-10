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
        if(numberOfUsers == 0) {
            averageNumerOfCommentsPerUser = 0;
        } else {
            averageNumerOfCommentsPerUser = (double) numberOfComments / numberOfUsers;
        }
        if(numberOfPosts == 0) {
            averageNumerOfCommentsOnPost = 0;
        } else {
            averageNumerOfCommentsOnPost = (double) numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {

        System.out.println("All number of users is: " + numberOfUsers);
        System.out.println("All numer of posts is: " + numberOfPosts);
        System.out.println("All number of comments is: " + numberOfComments);
        System.out.println("Average number of posts per user is: " + averageNumerOfPostsPerUser);
        System.out.println("Average number of comments per user is: " + averageNumerOfCommentsPerUser);
        System.out.println("Average number of comments on post is: " +averageNumerOfCommentsOnPost);
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

    public int getNumberOfUsers() {
        return numberOfUsers;
    }
}
