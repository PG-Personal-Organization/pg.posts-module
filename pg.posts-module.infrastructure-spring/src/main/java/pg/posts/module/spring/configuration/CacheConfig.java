package pg.posts.module.spring.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static pg.posts.module.infrastructure.cache.CacheNames.POSTS_CACHE;

/**
 * The type Cache config.
 */
@Configuration
@EnableCaching
@RequiredArgsConstructor
public class CacheConfig {
    /**
     * Cache manager cache manager.
     *
     * @return the cache manager
     */
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager(POSTS_CACHE);
    }


    /**
     * Context cache cache.
     *
     * @return the cache
     */
    @Bean
    @Qualifier(POSTS_CACHE)
    public Cache contextCache() {
        return cacheManager().getCache(POSTS_CACHE);
    }

}