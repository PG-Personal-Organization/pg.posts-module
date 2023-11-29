package pg.posts.module.api.frontend;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * The type Http services paths.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HttpServicesPaths {
    /**
     * The constant BASE_PATH.
     */
    public static final String BASE_PATH = "/api";
    /**
     * The constant POSTS_PATH.
     */
    public static final String POSTS_PATH = BASE_PATH + "/frontend/v1/posts";
}
