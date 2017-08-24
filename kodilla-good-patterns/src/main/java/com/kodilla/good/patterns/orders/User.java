package com.kodilla.good.patterns.orders;

public class User {
    private final String userName;
    private final long userId;
    private final String userContact;

    public User(final String userName, final long userId, final String userContact) {
        this.userName = userName;
        this.userId = userId;
        this.userContact = userContact;
    }

    public String getUserName() {
        return userName;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserContact() {
        return userContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        return userContact != null ? userContact.equals(user.userContact) : user.userContact == null;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userContact != null ? userContact.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", userContact='" + userContact + '\'' +
                '}';
    }
}
