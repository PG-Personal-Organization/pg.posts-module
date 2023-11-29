package pg.posts.module.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import pg.posts.module.integration.common.PostsModuleIntegrationTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * The type Posts module application test.
 */
@PostsModuleIntegrationTest
class PostsModuleApplicationTest {
    @Autowired
    private ApplicationContext applicationContext;

    /**
     * Should app startup correctly.
     */
    @Test
    void shouldAppStartupCorrectly() {
        assertNotNull(applicationContext);
    }
}