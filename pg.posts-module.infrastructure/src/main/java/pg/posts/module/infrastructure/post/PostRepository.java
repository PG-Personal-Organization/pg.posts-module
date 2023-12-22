package pg.posts.module.infrastructure.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * The interface Post repository.
 */
@Repository
public interface PostRepository extends JpaRepository<PostEntity, UUID> {
    /**
     * Find by user id list.
     *
     * @param userId the user id
     * @return the list
     */
    List<PostEntity> findByUserId(String userId);

}