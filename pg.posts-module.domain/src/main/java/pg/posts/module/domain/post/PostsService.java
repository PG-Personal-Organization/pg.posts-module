package pg.posts.module.domain.post;

import java.util.List;

/**
 * The interface Posts service.
 */
public interface PostsService {
    /**
     * Find user posts list.
     *
     * @param userId the user id
     * @return the list
     */
    List<Post> findUserPosts(String userId);

    /**
     * Add post string.
     *
     * @param newPost the new post
     * @return the string
     */
    String addPost(Post newPost);
}