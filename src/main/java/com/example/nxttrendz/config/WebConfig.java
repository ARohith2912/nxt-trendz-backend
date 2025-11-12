package com.example.nxttrendz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Handler for product images
        registry.addResourceHandler("/IMAGES/**")
                .addResourceLocations("classpath:/static/IMAGES/");
        
        // Handler for all React static files
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/", "classpath:/public/");
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // IMPORTANT: Update this list upon production deployment!
        String[] allowedOrigins = {
            "http://localhost:3000", // Local React dev server
            "https://your-production-frontend.com" // Placeholder
        };

        registry.addMapping("/**") 
                .allowedOrigins(allowedOrigins) 
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}