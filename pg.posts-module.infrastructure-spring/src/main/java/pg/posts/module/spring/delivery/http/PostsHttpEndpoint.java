package pg.posts.module.spring.delivery.http;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import pg.posts.module.api.frontend.post.CreatePostRequest;
import pg.posts.module.domain.post.Post;
import pg.posts.module.domain.post.PostsService;
import pg.posts.module.spring.delivery.http.helpers.PostsHelper;

import java.util.List;

import static pg.posts.module.api.frontend.HttpServicesPaths.POSTS_PATH;

/**
 * The type Posts http endpoint.
 */
@Log4j2
@RestController
@RequestMapping(POSTS_PATH)
@RequiredArgsConstructor
@Tag(name = "Posts")
public class PostsHttpEndpoint {
    private final PostsService postsService;
    private final PostsHelper postsHelper;

    /**
     * Gets user posts.
     *
     * @param userId the user id
     * @return the user posts
     */
    @GetMapping
    public List<Post> getUserPosts(final @RequestParam("userId") @NotBlank String userId) {
        log.info("Started processing get user posts with userId: {}", userId);
        return postsService.findUserPosts(userId);
    }

    /**
     * Create post string.
     *
     * @param request the request
     * @return the string
     */
    @PostMapping
    public String createPost(final @Valid @RequestBody CreatePostRequest request) {
        log.info("Started processing createPost with request: {}", request);
        return postsHelper.addPost(request);
    }
}
