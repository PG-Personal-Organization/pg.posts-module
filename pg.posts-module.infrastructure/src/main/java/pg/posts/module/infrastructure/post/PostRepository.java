package pg.posts.module.infrastructure.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * The interface Post repository.
 */
@Repository
public interface PostRepository extends JpaRepository<PostEntity, UUID> {
}
