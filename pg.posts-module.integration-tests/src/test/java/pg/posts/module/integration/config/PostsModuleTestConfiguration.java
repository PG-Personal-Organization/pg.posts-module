package pg.posts.module.integration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pg.posts.module.spring.PostsModuleConfiguration;

/**
 * The type Posts module test configuration.
 */
@Configuration
@Import({
        PostsModuleConfiguration.class
})
public class PostsModuleTestConfiguration {
}