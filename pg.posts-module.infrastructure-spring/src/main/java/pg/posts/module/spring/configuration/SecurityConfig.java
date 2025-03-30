package pg.posts.module.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import pg.context.auth.api.context.provider.ContextProvider;
import pg.context.auth.api.context.provider.remote.HttpUserContextProvider;
import pg.context.auth.domain.context.UserContext;
import pg.lib.common.spring.user.Roles;
import pg.lib.remote.cqrs.executors.RemoteCqrsModuleServiceExecutor;
import pg.posts.module.api.frontend.HttpServicesPaths;

/**
 * The type Security config.
 */
@Configuration
public class SecurityConfig {

    /**
     * Posts request customizer customizer.
     *
     * @return the customizer
     */
    @Bean
    public Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> postsRequestCustomizer() {
        return requests -> requests.requestMatchers(HttpServicesPaths.POSTS_PATH)
                .hasRole(Roles.USER.name());
    }


    /**
     * Context provider context provider.
     *
     * @param serviceExecutor the service executor
     * @return the context provider
     */
    @Bean
    public ContextProvider<UserContext> contextProvider(final RemoteCqrsModuleServiceExecutor serviceExecutor) {
        return new HttpUserContextProvider(serviceExecutor);
    }
}
