package DAO;


import enteties.Post;

import java.util.ArrayList;

public interface PostDAO {
    ArrayList<Post> getAllUsersPost(int user_id);

    boolean addPost(Post post);

    ArrayList<Post> getAllPosts();

    ArrayList<Post> getFilteredPosts(String search);
}
