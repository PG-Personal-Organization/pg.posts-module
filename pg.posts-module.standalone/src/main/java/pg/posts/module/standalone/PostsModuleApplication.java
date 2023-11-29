package pg.posts.module.standalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import pg.posts.module.spring.PostsModuleConfiguration;

/**
 * The type Posts module application.
 */
@SpringBootApplication
@Import({
        PostsModuleConfiguration.class
})
public class PostsModuleApplication {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(PostsModuleApplication.class, args);
    }
}