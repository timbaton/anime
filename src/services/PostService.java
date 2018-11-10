package services;


import DAO.PostDAO;
import DAO.imp.PostDAOImp;
import enteties.Post;
import enteties.User;

public class PostService {

    private PostDAO postDAO = new PostDAOImp();

    public boolean addPost(Post post) {
        return postDAO.addPost(post);
    }
}
