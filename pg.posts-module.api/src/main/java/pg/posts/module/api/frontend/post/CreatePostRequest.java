package pg.posts.module.api.frontend.post;

import lombok.*;

import java.io.Serializable;

/**
 * The type Create post request.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class CreatePostRequest implements Serializable {
    private String content;
    private String userId;
}