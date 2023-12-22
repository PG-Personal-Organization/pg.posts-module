package pg.posts.module.infrastructure.post;

import lombok.experimental.UtilityClass;
import pg.posts.module.domain.post.Post;

/**
 * The type Posts mapper.
 */
@UtilityClass
public class PostsMapper {
    /**
     * To post post.
     *
     * @param entity the entity
     * @return the post
     */
    public Post toPost(final PostEntity entity) {
        return Post.builder()
                .id(entity.getId().toString())
                .userId(entity.getUserId())
                .content(entity.getContent())
                .creationDateTime(entity.getCreationDateTime())
                .build();
    }

    /**
     * To entity post entity.
     *
     * @param post the post
     * @return the post entity
     */
    public PostEntity toEntity(final Post post) {
        return PostEntity.builder()
                .userId(post.getUserId())
                .content(post.getContent())
                .creationDateTime(post.getCreationDateTime())
                .build();
    }
}