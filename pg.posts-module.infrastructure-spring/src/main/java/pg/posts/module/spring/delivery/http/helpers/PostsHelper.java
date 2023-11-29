package pg.posts.module.spring.delivery.http.helpers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pg.posts.module.api.frontend.post.CreatePostRequest;
import pg.posts.module.domain.post.Post;
import pg.posts.module.domain.post.PostsService;

import java.time.LocalDateTime;

/**
 * The type Posts helper.
 */
@Service
@RequiredArgsConstructor
public class PostsHelper {
    private final PostsService postsService;

    /**
     * Add post string.
     *
     * @param request the request
     * @return the string
     */
    public String addPost(final CreatePostRequest request) {
        var post = toPost(request);
        return postsService.addPost(post);
    }

    private Post toPost(final CreatePostRequest request) {
        return Post.builder()
                .userId(request.getUserId())
                .content(request.getContent())
                .creationDateTime(LocalDateTime.now())
                .build();
    }
}
