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
        // ✅ Add your actual deployed frontend URL here
        String[] allowedOrigins = {
            "http://localhost:3000", // local React dev server
            "https://ecommerce-mu-beryl-47.vercel.app" // your deployed Vercel frontend
        };

        registry.addMapping("/**")
                .allowedOrigins(allowedOrigins)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true); // important if you use cookies or sessions
    }
}
