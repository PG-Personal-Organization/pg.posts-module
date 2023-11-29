package pg.posts.module.infrastructure.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pg.posts.module.domain.post.Post;
import pg.posts.module.domain.post.PostsService;

import java.util.Collections;
import java.util.List;

/**
 * The type Database posts service.
 */
@Log4j2
@Service
@RequiredArgsConstructor
public class DatabasePostsService implements PostsService {
    private final PostRepository postRepository;

    @Override
    public List<Post> findUserPosts(final String userId) {
        return Collections.emptyList();
    }

    @Override
    public String addPost(Post newPost) {
        return null;
    }
}
