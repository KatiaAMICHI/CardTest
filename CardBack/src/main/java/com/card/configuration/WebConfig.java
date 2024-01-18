package com.card.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration class for handling Cross-Origin Resource Sharing (CORS) in the Spring application.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * Configures CORS support for the application.
     *
     * @param registry The CORS registry to be configured.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOriginPatterns("*")
            .allowedMethods("GET", "POST", "PUT", "DELETE")
            .allowedHeaders("*")
            .allowCredentials(true)
            .maxAge(3600);
    }
}
