package DAO;


import enteties.Post;
import enteties.User;

public interface PostDAO {
    User getAllUsersPost(String username);

    boolean addPost(User user, Post post);
}
