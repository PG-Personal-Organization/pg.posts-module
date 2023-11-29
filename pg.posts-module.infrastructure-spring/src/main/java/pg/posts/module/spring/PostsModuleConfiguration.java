package pg.posts.module.spring;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pg.context.auth.api.security.ContextBasedSecurityConfiguration;
import pg.lib.common.spring.config.CommonModuleConfiguration;
import pg.lib.cqrs.config.CommandQueryAutoConfiguration;
import pg.lib.remote.cqrs.config.RemoteModulesCqrsConfiguration;

/**
 * The type Posts module configuration.
 */
@Configuration
@EntityScan("pg.posts.module")
@EnableJpaRepositories("pg.posts.module")
@ComponentScan("pg.posts.module")
@Import({
        CommonModuleConfiguration.class,
        CommandQueryAutoConfiguration.class,
        ContextBasedSecurityConfiguration.class,
        RemoteModulesCqrsConfiguration.class,
})
public class PostsModuleConfiguration {
}
