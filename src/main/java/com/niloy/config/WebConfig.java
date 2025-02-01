package com.niloy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Global CORS configuration
        registry.addMapping("/**")  // Apply CORS to all endpoints
                .allowedOrigins("*")  // Specify allowed origins
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Allowed HTTP methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true)  // Allow credentials (cookies, authorization headers)
                .maxAge(3600);  // Cache pre-flight response for 1 hour
    }
}
