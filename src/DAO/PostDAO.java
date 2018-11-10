package DAO;


import enteties.Post;

import java.util.ArrayList;

public interface PostDAO {
    ArrayList<Post> getAllUsersPost(String username);

    boolean addPost(Post post);
}
