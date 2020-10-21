package com.cros.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * This CROS orgin will help to get ajax and jquery from font end
 *
 *
 */
@Component
public class CROSRegister {

    public WebMvcConfigurer crosConfigure(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/cros").allowedOrigins("http://localhost:9090");
                super.addCorsMappings(registry);
            }
        };
    }
}
